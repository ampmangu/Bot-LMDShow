package com.inma.botlmdshow.domain;

import java.util.Objects;

public class PostDTO {
    private String title;
    private String author;
    private String link;

    private PostDTO(String title, String author, String link) {
        this.title = title;
        this.author = author;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostDTO postDTO = (PostDTO) o;
        return Objects.equals(title, postDTO.title) && Objects.equals(author, postDTO.author) && Objects.equals(link, postDTO.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, link);
    }

    public static class Builder {
        private String title;
        private String author;
        private String link;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder link(String link) {
            this.link = link;
            return this;
        }

        private void validate() throws IllegalStateException {
            if (title == null) {
                throw new IllegalStateException("Title can't be null");
            }
            if (author == null) {
                throw new IllegalStateException("Author can't be null");
            }
            if (link == null) {
                throw new IllegalStateException("Link can't be null");
            }

        }

        public PostDTO build() {
            validate();
            return new PostDTO(title, author, link);
        }
    }

}
