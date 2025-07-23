package com.example.api.DTO;

public class ApiResponse {
    private String responseCode;
    private String responseMessage;
    private ResponseData responseData;

    public ApiResponse(String responseCode, String responseMessage, ResponseData responseData) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.responseData = responseData;
    }

    public String getResponseCode() { return responseCode; }
    public void setResponseCode(String responseCode) { this.responseCode = responseCode; }

    public String getResponseMessage() { return responseMessage; }
    public void setResponseMessage(String responseMessage) { this.responseMessage = responseMessage; }

    public ResponseData getResponseData() { return responseData; }
    public void setResponseData(ResponseData responseData) { this.responseData = responseData; }
}

