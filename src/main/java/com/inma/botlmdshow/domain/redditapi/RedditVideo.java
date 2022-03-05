package com.inma.botlmdshow.domain.redditapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class RedditVideo {

    @SerializedName("bitrate_kbps")
    @Expose
    private Integer bitrateKbps;
    @SerializedName("fallback_url")
    @Expose
    private String fallbackUrl;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("scrubber_media_url")
    @Expose
    private String scrubberMediaUrl;
    @SerializedName("dash_url")
    @Expose
    private String dashUrl;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("hls_url")
    @Expose
    private String hlsUrl;
    @SerializedName("is_gif")
    @Expose
    private Boolean isGif;
    @SerializedName("transcoding_status")
    @Expose
    private String transcodingStatus;

    public Integer getBitrateKbps() {
        return bitrateKbps;
    }

    public void setBitrateKbps(Integer bitrateKbps) {
        this.bitrateKbps = bitrateKbps;
    }

    public String getFallbackUrl() {
        return fallbackUrl;
    }

    public void setFallbackUrl(String fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getScrubberMediaUrl() {
        return scrubberMediaUrl;
    }

    public void setScrubberMediaUrl(String scrubberMediaUrl) {
        this.scrubberMediaUrl = scrubberMediaUrl;
    }

    public String getDashUrl() {
        return dashUrl;
    }

    public void setDashUrl(String dashUrl) {
        this.dashUrl = dashUrl;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getHlsUrl() {
        return hlsUrl;
    }

    public void setHlsUrl(String hlsUrl) {
        this.hlsUrl = hlsUrl;
    }

    public Boolean getIsGif() {
        return isGif;
    }

    public void setIsGif(Boolean isGif) {
        this.isGif = isGif;
    }

    public String getTranscodingStatus() {
        return transcodingStatus;
    }

    public void setTranscodingStatus(String transcodingStatus) {
        this.transcodingStatus = transcodingStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RedditVideo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bitrateKbps");
        sb.append('=');
        sb.append(((this.bitrateKbps == null) ? "<null>" : this.bitrateKbps));
        sb.append(',');
        sb.append("fallbackUrl");
        sb.append('=');
        sb.append(((this.fallbackUrl == null) ? "<null>" : this.fallbackUrl));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null) ? "<null>" : this.height));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null) ? "<null>" : this.width));
        sb.append(',');
        sb.append("scrubberMediaUrl");
        sb.append('=');
        sb.append(((this.scrubberMediaUrl == null) ? "<null>" : this.scrubberMediaUrl));
        sb.append(',');
        sb.append("dashUrl");
        sb.append('=');
        sb.append(((this.dashUrl == null) ? "<null>" : this.dashUrl));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null) ? "<null>" : this.duration));
        sb.append(',');
        sb.append("hlsUrl");
        sb.append('=');
        sb.append(((this.hlsUrl == null) ? "<null>" : this.hlsUrl));
        sb.append(',');
        sb.append("isGif");
        sb.append('=');
        sb.append(((this.isGif == null) ? "<null>" : this.isGif));
        sb.append(',');
        sb.append("transcodingStatus");
        sb.append('=');
        sb.append(((this.transcodingStatus == null) ? "<null>" : this.transcodingStatus));
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
        result = ((result * 31) + ((this.duration == null) ? 0 : this.duration.hashCode()));
        result = ((result * 31) + ((this.bitrateKbps == null) ? 0 : this.bitrateKbps.hashCode()));
        result = ((result * 31) + ((this.fallbackUrl == null) ? 0 : this.fallbackUrl.hashCode()));
        result = ((result * 31) + ((this.dashUrl == null) ? 0 : this.dashUrl.hashCode()));
        result = ((result * 31) + ((this.isGif == null) ? 0 : this.isGif.hashCode()));
        result = ((result * 31) + ((this.width == null) ? 0 : this.width.hashCode()));
        result = ((result * 31) + ((this.transcodingStatus == null) ? 0 : this.transcodingStatus.hashCode()));
        result = ((result * 31) + ((this.scrubberMediaUrl == null) ? 0 : this.scrubberMediaUrl.hashCode()));
        result = ((result * 31) + ((this.height == null) ? 0 : this.height.hashCode()));
        result = ((result * 31) + ((this.hlsUrl == null) ? 0 : this.hlsUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RedditVideo) == false) {
            return false;
        }
        RedditVideo rhs = ((RedditVideo) other);
        return (((((((((((this.duration == rhs.duration) || ((this.duration != null) && this.duration.equals(rhs.duration))) && ((this.bitrateKbps == rhs.bitrateKbps) || ((this.bitrateKbps != null) && this.bitrateKbps.equals(rhs.bitrateKbps)))) && ((this.fallbackUrl == rhs.fallbackUrl) || ((this.fallbackUrl != null) && this.fallbackUrl.equals(rhs.fallbackUrl)))) && ((this.dashUrl == rhs.dashUrl) || ((this.dashUrl != null) && this.dashUrl.equals(rhs.dashUrl)))) && ((this.isGif == rhs.isGif) || ((this.isGif != null) && this.isGif.equals(rhs.isGif)))) && ((this.width == rhs.width) || ((this.width != null) && this.width.equals(rhs.width)))) && ((this.transcodingStatus == rhs.transcodingStatus) || ((this.transcodingStatus != null) && this.transcodingStatus.equals(rhs.transcodingStatus)))) && ((this.scrubberMediaUrl == rhs.scrubberMediaUrl) || ((this.scrubberMediaUrl != null) && this.scrubberMediaUrl.equals(rhs.scrubberMediaUrl)))) && ((this.height == rhs.height) || ((this.height != null) && this.height.equals(rhs.height)))) && ((this.hlsUrl == rhs.hlsUrl) || ((this.hlsUrl != null) && this.hlsUrl.equals(rhs.hlsUrl))));
    }

}
