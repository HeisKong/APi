package com.example.api.DTO;

public class ResponseData {
    private String userId;
    private String tokenId;

    public ResponseData(String userId, String tokenId) {
        this.userId = userId;
        this.tokenId = tokenId;
    }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getTokenId() { return tokenId; }
    public void setTokenId(String tokenId) { this.tokenId = tokenId; }
}
