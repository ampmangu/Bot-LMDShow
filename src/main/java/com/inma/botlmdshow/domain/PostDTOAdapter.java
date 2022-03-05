package com.inma.botlmdshow.domain;

import com.inma.botlmdshow.domain.pushshift.Data;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PostDTOAdapter {
    private PostDTOAdapter() {

    }

    public static List<PostDTO> adaptFromPushshift(Data pushshiftData) {
        return pushshiftData.getData().stream().map(datum -> {
            String author = Optional.ofNullable(datum.getAuthor()).orElse("/r/LMDShow");
            String title = Optional.ofNullable(datum.getTitle()).orElse("");
            String link = Optional.ofNullable(datum.getFullLink()).orElse(datum.getUrl());
            return new PostDTO.Builder().author(author).title(title).link(link).build();
        }).collect(Collectors.toList());
    }

    public static List<PostDTO> adaptFromRedditJson(com.inma.botlmdshow.domain.redditapi.Data redditJsonData) {
        return redditJsonData.getData().getChildren().stream().map(child -> {
            String author = child.getData().getAuthor();
            String title = child.getData().getTitle();
            String link = "https://www.reddit.com/" + child.getData().getPermalink();
            return new PostDTO.Builder().author(author).title(title).link(link).build();
        }).collect(Collectors.toList());

    }
}
