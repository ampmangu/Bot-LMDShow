package com.inma.botlmdshow.service.reddit;

import com.google.gson.Gson;
import com.inma.botlmdshow.domain.pushshift.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.util.Optional;

@Service
public class PushshiftServiceImpl implements PushshiftService {
    private static final String BASE_URL = "https://api.pushshift.io/reddit/search/submission/?subreddit=lmdshow&sort=desc&sort_type=created_utc&before=R_BEFORE&size=50";

    private static final Logger log = LoggerFactory.getLogger(PushshiftServiceImpl.class);

    private final RestTemplate restTemplate;

    public PushshiftServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Optional<Data> getAllPosts() {
        String formedUrl = BASE_URL.replace("R_BEFORE", Long.toString(Instant.now().getEpochSecond()));
        try {
            String formed = restTemplate.getForObject(formedUrl, String.class);

            return Optional.of(new Gson().fromJson(formed, Data.class));
        } catch (RestClientException restClientException) {
            log.error("Pushshift devolvió un error {}", restClientException.getLocalizedMessage());
        }
        return Optional.empty();
    }
}
