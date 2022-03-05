package com.inma.botlmdshow.service;

import com.inma.botlmdshow.domain.PostDTO;

import java.util.List;

public interface RedditService {
    List<PostDTO> getAllPosts();
}
