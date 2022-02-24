package com.inma.botlmdshow.service;

import com.google.gson.Gson;
import com.inma.botlmdshow.domain.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;

@Service
public class RedditServiceImpl implements RedditService {
    public final String BASE_URL = "https://api.pushshift.io/reddit/search/submission/?subreddit=lmdshow&sort=desc&sort_type=created_utc&before=R_BEFORE&size=50";


    private final RestTemplate restTemplate;


    public RedditServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Data getAllPosts() {
        String formedUrl = BASE_URL.replace("R_BEFORE", Long.toString(Instant.now().getEpochSecond()));

        String formed = restTemplate.getForObject(formedUrl, String.class);

        return new Gson().fromJson(formed, Data.class);
    }
}
