package com.and.playground.demo.exceptions;

import java.io.Serializable;

public class MessageException implements Serializable {
    private String dateTime;
    private String msg;
    private String details;

    public MessageException(String dateTime, String msg, String details) {
        this.dateTime = dateTime;
        this.msg = msg;
        this.details = details;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
