package com.fahim.androidchatgpt.model;

import java.util.List;

// ChatResponse.java
public class ChatResponse {
    private String id;
    private String object;
    private long created;
    private String model;
    private List<Choice> choices;
    private Usage usage;

    public String getId() { return id; }
    public List<Choice> getChoices() { return choices; }
    public Usage getUsage() { return usage; }
}