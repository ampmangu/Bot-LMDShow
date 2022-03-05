package com.inma.botlmdshow.service;

import com.inma.botlmdshow.domain.PostDTO;

public interface TwitterService {

    boolean postTweet(PostDTO postDTO);
}
