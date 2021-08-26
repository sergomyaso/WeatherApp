package com.sergomyaso.webweather.Provider;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateProvider {
    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);
    static final char DATE_SEPARATOR = ';';

    static public LocalDate getConvertedDate(String date) {
        return LocalDate.parse(date, FORMATTER);
    }

    static public String getStringDate(LocalDate date) {
        return date.format(FORMATTER);
    }

   static public String getCompressedDate(String date1, String date2) {
        return date1 + DATE_SEPARATOR + date2;
    }

    static public String getCompressedDate(LocalDate date1, LocalDate date2) {
        return date1.format(FORMATTER) + DATE_SEPARATOR + date2.format(FORMATTER);
    }

}
