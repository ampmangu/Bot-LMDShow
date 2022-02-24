package com.inma.botlmdshow.utils;

import com.inma.botlmdshow.domain.Datum;

import java.util.Optional;

public class DatumUtils {

    private DatumUtils () {

    }

    public static String formUrl(Datum datum) {
        return Optional.ofNullable(datum.getFullLink()).orElse(datum.getUrl());
    }


    public static String formText(Datum datum) {
        return Optional.ofNullable(datum.getTitle()).orElse("") +
                ", by " +
                Optional.ofNullable(datum.getAuthor()).orElse("/r/LMDShow") +
                System.getProperty("line.separator") +
                formUrl(datum);
    }
}
