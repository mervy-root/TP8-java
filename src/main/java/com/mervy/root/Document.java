package com.mervy.root;

public class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }
    public Document(){;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                '}';
    }
}
