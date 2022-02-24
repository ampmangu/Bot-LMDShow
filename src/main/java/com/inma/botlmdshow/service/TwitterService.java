package com.inma.botlmdshow.service;

import com.inma.botlmdshow.domain.Datum;

public interface TwitterService {

    boolean postTweet(Datum datum);
}
