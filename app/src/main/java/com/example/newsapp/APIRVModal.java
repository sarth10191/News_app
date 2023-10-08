package com.example.newsapp;

public class APIRVModal {
    private String APIName;

    public APIRVModal(String APIName, String APIlogoURL) {
        this.APIName = APIName;
        this.APIlogoURL = APIlogoURL;
    }

    public String getAPIName() {
        return APIName;
    }

    public void setAPIName(String APIName) {
        this.APIName = APIName;
    }

    public String getAPIlogoURL() {
        return APIlogoURL;
    }

    public void setAPIlogoURL(String APIlogoURL) {
        this.APIlogoURL = APIlogoURL;
    }

    private String APIlogoURL;
}
