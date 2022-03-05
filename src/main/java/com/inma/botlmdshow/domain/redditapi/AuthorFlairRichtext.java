package com.inma.botlmdshow.domain.redditapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class AuthorFlairRichtext {

    @SerializedName("e")
    @Expose
    private String e;
    @SerializedName("t")
    @Expose
    private String t;

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuthorFlairRichtext.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("e");
        sb.append('=');
        sb.append(((this.e == null) ? "<null>" : this.e));
        sb.append(',');
        sb.append("t");
        sb.append('=');
        sb.append(((this.t == null) ? "<null>" : this.t));
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
        result = ((result * 31) + ((this.t == null) ? 0 : this.t.hashCode()));
        result = ((result * 31) + ((this.e == null) ? 0 : this.e.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthorFlairRichtext) == false) {
            return false;
        }
        AuthorFlairRichtext rhs = ((AuthorFlairRichtext) other);
        return (((this.t == rhs.t) || ((this.t != null) && this.t.equals(rhs.t))) && ((this.e == rhs.e) || ((this.e != null) && this.e.equals(rhs.e))));
    }

}
