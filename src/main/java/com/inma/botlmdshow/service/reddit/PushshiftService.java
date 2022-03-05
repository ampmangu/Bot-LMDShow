package com.inma.botlmdshow.service.reddit;

import com.inma.botlmdshow.domain.pushshift.Data;

import java.util.Optional;

public interface PushshiftService {
    Optional<Data> getAllPosts();
}
