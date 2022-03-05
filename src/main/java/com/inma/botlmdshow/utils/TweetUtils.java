package com.inma.botlmdshow.utils;

import com.inma.botlmdshow.domain.PostDTO;

public class TweetUtils {
    private TweetUtils() {

    }

    public static String formTweet(PostDTO postDTO) {
        return postDTO.getTitle() +
                ", by " +
                postDTO.getAuthor() + System.getProperty("line.separator")
                + postDTO.getLink();
    }
}
