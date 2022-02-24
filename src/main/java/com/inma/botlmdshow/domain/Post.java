package com.inma.botlmdshow.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "post-col")
public class Post {
    @Id
    private String id;
    private String title;
    private String accessTime;

    public Post() {

    }

    public Post(String id, String title, String accessTime) {
        this.id = id;
        this.title = title;
        this.accessTime = accessTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime;
    }
}
