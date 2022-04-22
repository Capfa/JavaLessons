package ru.itmo.lessons.lesson11.enums;

import java.time.LocalDateTime;

public class Article {
    private String title;
    private String text;
    private LocalDateTime created;
    private Country country;//null AUSTRALIA,UK,FRANCE

    public Article(String title){
        this.title=title;
        created=LocalDateTime.now();
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setTitle(String title) {
        if (title==null|| title.length()<3){
            throw new IllegalArgumentException("Значение title от трех символов");
        }

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }


    public Country getCountry() {
        return country;
    }
}
