package com.example.application.model;

import java.util.*;
import java.text.SimpleDateFormat;


public class ServerState {

    private Long currentTimeMillis;
    private String localDate;
    private String localDateTime;
    private final String timeZone = TimeZone.getDefault().getDisplayName();
    private Long freeMemory;
    private Long totalMemory;

    public ServerState() {
        currentTimeMillis = System.currentTimeMillis();
        localDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        localDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        Runtime runtime = Runtime.getRuntime();
        totalMemory = runtime.totalMemory();
        freeMemory = runtime.freeMemory();
    }

    public Long getCurrentTimeMillis() {
        return currentTimeMillis;
    }

    public String getLocalDate() {
        return localDate;
    }

    public String getLocalDateTime() {
        return localDateTime;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public Long getTotalMemory() {
        return totalMemory;
    }

    public Long getFreeMemory() {
        return freeMemory;
    }

}
