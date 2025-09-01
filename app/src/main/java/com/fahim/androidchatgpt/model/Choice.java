package com.fahim.androidchatgpt.model;

// Choice.java
public class Choice {
    private int index;
    private Message message;
    private String finish_reason;

    public Message getMessage() { return message; }
    public String getFinish_reason() { return finish_reason; }
}

