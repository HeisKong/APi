package com.example.api.model;

import lombok.Data;

@Data
public class ApiModel {
    private String ssoType;
    private String systemId;
    private String systemName;
    private String systemTransactions;
    private String systemPrivileges;
    private String systemUserGroup;
    private String systemLocationGroup;
    private String userId;
    private String userFullName;
    private String userOfficeCode;
    private String clientLocation;
    private String locationMachineNumber;
    private String tokenId;
    private String userRdOfficeCode;

}
