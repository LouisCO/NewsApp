package com.example.android.newsapp;

public class News {
    private String title, author, section, date, url;

    News(String title, String author, String section, String date, String url) {
        this.title=title;
        this.author=author;
        this.section=section;
        this.date=date;
        this.url=url;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSection() {
        return section;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }
}
