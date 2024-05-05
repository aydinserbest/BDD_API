package net.bddtrader.testdata;

import com.serenitydojo.news.NewsItem;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class NewsItemTestData {

    /*
    private ZonedDateTime datetime;
    private String headline;
    private String source;
    private String url;
    private String summary;
    private String related;
     */
    private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private static final  LocalDateTime DEFAULT_LOCALE_TIME = LocalDateTime.parse(initialData.get("date") + " " + initialData.get("time"), DEFAULT_FORMATTER);
    private static final ZonedDateTime DEFAULT_ZONED_TIME = ZonedDateTime.of(DEFAULT_LOCALE_TIME, ZoneId.of("UTC"));

    public static NewsItem newsItemFrom(Map<String, String> initialData) {

        return null;
    }
}
