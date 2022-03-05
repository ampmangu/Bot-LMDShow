package com.inma.botlmdshow.service;

import com.inma.botlmdshow.domain.PostDTO;

/**
 * author: Cristinini
 */
public interface DiscriminatorService {
    boolean discriminatePost(PostDTO postDTO);
}
