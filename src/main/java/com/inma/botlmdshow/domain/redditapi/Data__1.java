package com.inma.botlmdshow.domain.redditapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class Data__1 {

    @SerializedName("after")
    @Expose
    private String after;
    @SerializedName("dist")
    @Expose
    private Integer dist;
    @SerializedName("modhash")
    @Expose
    private String modhash;
    @SerializedName("geo_filter")
    @Expose
    private String geoFilter;
    @SerializedName("children")
    @Expose
    private List<Child> children = null;

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public Integer getDist() {
        return dist;
    }

    public void setDist(Integer dist) {
        this.dist = dist;
    }

    public String getModhash() {
        return modhash;
    }

    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public String getGeoFilter() {
        return geoFilter;
    }

    public void setGeoFilter(String geoFilter) {
        this.geoFilter = geoFilter;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data__1.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("after");
        sb.append('=');
        sb.append(((this.after == null) ? "<null>" : this.after));
        sb.append(',');
        sb.append("dist");
        sb.append('=');
        sb.append(((this.dist == null) ? "<null>" : this.dist));
        sb.append(',');
        sb.append("modhash");
        sb.append('=');
        sb.append(((this.modhash == null) ? "<null>" : this.modhash));
        sb.append(',');
        sb.append("geoFilter");
        sb.append('=');
        sb.append(((this.geoFilter == null) ? "<null>" : this.geoFilter));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null) ? "<null>" : this.children));
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
        result = ((result * 31) + ((this.dist == null) ? 0 : this.dist.hashCode()));
        result = ((result * 31) + ((this.geoFilter == null) ? 0 : this.geoFilter.hashCode()));
        result = ((result * 31) + ((this.after == null) ? 0 : this.after.hashCode()));
        result = ((result * 31) + ((this.modhash == null) ? 0 : this.modhash.hashCode()));
        result = ((result * 31) + ((this.children == null) ? 0 : this.children.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data__1) == false) {
            return false;
        }
        Data__1 rhs = ((Data__1) other);
        return ((((((this.dist == rhs.dist) || ((this.dist != null) && this.dist.equals(rhs.dist))) && ((this.geoFilter == rhs.geoFilter) || ((this.geoFilter != null) && this.geoFilter.equals(rhs.geoFilter)))) && ((this.after == rhs.after) || ((this.after != null) && this.after.equals(rhs.after)))) && ((this.modhash == rhs.modhash) || ((this.modhash != null) && this.modhash.equals(rhs.modhash)))) && ((this.children == rhs.children) || ((this.children != null) && this.children.equals(rhs.children))));
    }

}
