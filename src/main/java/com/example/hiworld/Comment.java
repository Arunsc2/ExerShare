package com.example.hiworld;

public class Comment {
    private String comment;
    private String name;

    public Comment(String comment, String name) {
        this.comment = comment;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
