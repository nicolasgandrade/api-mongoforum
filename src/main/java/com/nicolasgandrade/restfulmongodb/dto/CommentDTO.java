package com.nicolasgandrade.restfulmongodb.dto;

import java.util.Date;

public class CommentDTO {

    private AuthorDTO author;
    private Date date;
    private String text;

    public CommentDTO() {
    }

    public CommentDTO(AuthorDTO author, Date date, String text) {
        this.author = author;
        this.date = date;
        this.text = text;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
