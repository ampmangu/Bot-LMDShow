package com.inma.botlmdshow.domain.redditapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class SecureMedia {

    @SerializedName("reddit_video")
    @Expose
    private RedditVideo redditVideo;

    public RedditVideo getRedditVideo() {
        return redditVideo;
    }

    public void setRedditVideo(RedditVideo redditVideo) {
        this.redditVideo = redditVideo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecureMedia.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof SecureMedia) == false) {
            return false;
        }
        SecureMedia rhs = ((SecureMedia) other);
        return ((this.redditVideo == rhs.redditVideo) || ((this.redditVideo != null) && this.redditVideo.equals(rhs.redditVideo)));
    }

}
