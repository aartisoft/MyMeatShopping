package com.mymeatshop.model.response;

import com.google.gson.annotations.SerializedName;

public class ResponseSignUp {

    @SerializedName("response")
    private String response;

    @SerializedName("message")
    private String message;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return
                "ResponseSignUp{" +
                        "response = '" + response + '\'' +
                        ",message = '" + message + '\'' +
                        "}";
    }
}