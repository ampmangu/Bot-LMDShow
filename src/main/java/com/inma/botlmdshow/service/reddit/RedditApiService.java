package com.inma.botlmdshow.service.reddit;

import com.inma.botlmdshow.domain.redditapi.Data;

import java.util.Optional;

public interface RedditApiService {
    Optional<Data> getAllPosts();
}
