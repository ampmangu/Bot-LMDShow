package com.inma.botlmdshow.service;

import com.inma.botlmdshow.domain.PostDTO;
import com.inma.botlmdshow.domain.PostDTOAdapter;
import com.inma.botlmdshow.service.reddit.PushshiftService;
import com.inma.botlmdshow.service.reddit.RedditApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RedditServiceImpl implements RedditService {

    private final PushshiftService pushShiftService;
    private final RedditApiService redditApiService;
    private static final Logger log = LoggerFactory.getLogger(RedditServiceImpl.class);

    public RedditServiceImpl(PushshiftService pushshiftService, RedditApiService redditApiService) {
        this.pushShiftService = pushshiftService;
        this.redditApiService = redditApiService;
    }

    @Override
    public List<PostDTO> getAllPosts() {
        Optional<List<PostDTO>> postDTOS = pushShiftService.getAllPosts().map(PostDTOAdapter::adaptFromPushshift);
        if (postDTOS.isPresent()) {
            log.info("API de Pushshift devolvió un codigo 200");
            return postDTOS.get();
        }
        log.info("Utilizando API de Reddit.");
        Optional<List<PostDTO>> redditDTO = redditApiService.getAllPosts().map(PostDTOAdapter::adaptFromRedditJson);
        return redditDTO.orElseThrow();
    }

}
