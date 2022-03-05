package com.inma.botlmdshow.domain.redditapi;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class SecureMediaEmbed {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecureMediaEmbed.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecureMediaEmbed) == false) {
            return false;
        }
        SecureMediaEmbed rhs = ((SecureMediaEmbed) other);
        return true;
    }

}
