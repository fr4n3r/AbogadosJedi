package com.time;

public class Saludos {
	private final long id;
    private final String content;

    public Saludos(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
