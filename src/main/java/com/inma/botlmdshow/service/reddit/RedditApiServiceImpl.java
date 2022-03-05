package com.inma.botlmdshow.service.reddit;

import com.google.gson.Gson;
import com.inma.botlmdshow.domain.redditapi.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class RedditApiServiceImpl implements RedditApiService {
    private static final String BASE_URL = "https://www.reddit.com/r/LMDShow/new.json?sort=new";
    private final RestTemplate restTemplate;
    private static final Logger log = LoggerFactory.getLogger(RedditApiServiceImpl.class);

    public RedditApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Optional<Data> getAllPosts() {
        try {
            String data = restTemplate.getForObject(BASE_URL, String.class);
            return Optional.of(new Gson().fromJson(data, Data.class));
        } catch (RestClientException restClientException) {
            log.error("Reddit devolvió un error {}", restClientException.getLocalizedMessage());
        }
        return Optional.empty();
    }
}
