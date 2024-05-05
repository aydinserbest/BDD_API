package net.bddtrader.testdata;

import com.serenitydojo.news.NewsItem;

import java.time.*;
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
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    private static final LocalDate DEFAULT_DATE = LocalDate.of(2022, 10, 10);
    private static final LocalTime DEFAULT_TIME = LocalTime.of(1, 1);

    private static final String DEFAULT_HEADLINE = "Exciting article";
    private static final String DEFAULT_SOURCE = "SeekingAlpha";
    private static final String DEFAULT_URL = "https://api.example.com/1.0/stock/aapl/article/5793469523684637";
    private static final String DEFAULT_SUMMARY = "Singular Research Director's Letter, April 2018";
    private static final String DEFAULT_RELATED = "AAPL,BMWYY";

    public static NewsItem newsItemFrom(Map<String, String> initialData) {
        LocalDate date = initialData.containsKey("date") ?
                LocalDate.parse(initialData.get("date"), DATE_FORMATTER) : DEFAULT_DATE;

        LocalTime time = initialData.containsKey("time") ?
                LocalTime.parse(initialData.get("time"), TIME_FORMATTER) : LocalTime.of(DEFAULT_TIME.getHour(), DEFAULT_TIME.getMinute(), 0);

        ZonedDateTime articleTimestamp = ZonedDateTime.of(date, time, ZoneId.of("UTC"));

        String headline = initialData.getOrDefault("headline", DEFAULT_HEADLINE);
        String source = initialData.getOrDefault("source", DEFAULT_SOURCE);
        String url = initialData.getOrDefault("url", DEFAULT_URL);
        String summary = initialData.getOrDefault("summary", DEFAULT_SUMMARY);
        String related = initialData.getOrDefault("related", DEFAULT_RELATED);

        return new NewsItem(articleTimestamp, headline, source, url, summary, related);
    }
}
