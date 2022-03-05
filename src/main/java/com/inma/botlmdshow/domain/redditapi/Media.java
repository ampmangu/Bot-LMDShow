package com.inma.botlmdshow.domain.redditapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Media {

    @SerializedName("reddit_video")
    @Expose
    private RedditVideo__1 redditVideo;

    public RedditVideo__1 getRedditVideo() {
        return redditVideo;
    }

    public void setRedditVideo(RedditVideo__1 redditVideo) {
        this.redditVideo = redditVideo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Media.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("redditVideo");
        sb.append('=');
        sb.append(((this.redditVideo == null) ? "<null>" : this.redditVideo));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.redditVideo == null) ? 0 : this.redditVideo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Media) == false) {
            return false;
        }
        Media rhs = ((Media) other);
        return ((this.redditVideo == rhs.redditVideo) || ((this.redditVideo != null) && this.redditVideo.equals(rhs.redditVideo)));
    }

}
