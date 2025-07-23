package com.example.api.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "sso_user_test")
public class ApiEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }
    @Column(name = "requestDate")
    private String requestDate;

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

    public String getSsoType() {
        return ssoType;
    }

    @Column(name = "ssoType", length = 50, nullable = false)
    public void setSsoType(String ssoType) {
        this.ssoType = ssoType;
    }

    public String getSystemId() {
        return systemId;
    }

    @Column(name = "systemId", length = 50)
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return systemName;
    }

    @Column(name = "systemName", length = 250)
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemTransactions() {
        return systemTransactions;
    }

    @Column(name = "systemTransactions", length = 250)
    public void setSystemTransactions(String systemTransactions) {
        this.systemTransactions = systemTransactions;
    }

    public String getSystemPrivileges() {
        return systemPrivileges;
    }

    @Column(name = "systemPrivileges", length = 250)
    public void setSystemPrivileges(String systemPrivileges) {
        this.systemPrivileges = systemPrivileges;
    }

    public String getSystemUserGroup() {
        return systemUserGroup;
    }

    @Column(name = "systemUserGroup", length = 50)
    public void setSystemUserGroup(String systemUserGroup) {
        this.systemUserGroup = systemUserGroup;
    }

    public String getSystemLocationGroup() {
        return systemLocationGroup;
    }

    @Column(name = "systemLocationGroup", length = 50)
    public void setSystemLocationGroup(String systemLocationGroup) {
        this.systemLocationGroup = systemLocationGroup;
    }

    public String getUserId() {
        return userId;
    }

    @Column(name = "userId", length = 200)
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFullName() {
        return userFullName;
    }

    @Column(name = "userFullName", length = 500)
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserOfficeCode() {
        return userOfficeCode;
    }

    @Column(name = "userOfficeCode", length = 250)
    public void setUserOfficeCode(String userOfficeCode) {
        this.userOfficeCode = userOfficeCode;
    }

    public String getClientLocation() {
        return clientLocation;
    }

    @Column(name = "clientLocation", length = 250)
    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

    public String getLocationMachineNumber() {
        return locationMachineNumber;
    }

    @Column(name = "locationMachineNumber", length = 500)
    public void setLocationMachineNumber(String locationMachineNumber) {
        this.locationMachineNumber = locationMachineNumber;
    }

    public String getTokenId() {
        return tokenId;
    }

    @Column(name = "tokenId", length = 1000)
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @PrePersist
    public void prePersist() {
        if (requestDate == null) {
            requestDate = LocalDateTime.now().toString();
        }
    }

}
