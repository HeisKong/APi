# Project ApiTest

This project is about experimenting with Api by receiving data, validating the data and saving it to the database.

## Features
- Receive JSON data via POST API
- Validate input before saving
- Save valid data to PostgreSQL database
- Return response with status and token
- Integrated Swagger UI for API testing
- SpringDoc for OpenAPI documentation                        

## Requirement
postgreSql 15                        
spring 3.1.1                        
spring doc 2.1.0                        
swagger 2.2.22                        
lombok 1.18.32                        

```
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.1.0</version>
        </dependency>
        <dependency>
            <groupId>io.swagger.core.v3</groupId>
            <artifactId>swagger-core</artifactId>
            <version>2.2.22</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.32</version>
            <scope>provided</scope>
        </dependency>
```
## Create Database With PostgreSql
create table sso_user_test
```
(
    request_date          timestamp not null
        constraint pk_sso_user_test
            primary key,
    ssotype               varchar(50),
    systemid              varchar(50),
    systemname            varchar(250),
    systemtransactions    varchar(250),
    systemprivileges      varchar(250),
    systemusergroup       varchar(50),
    systemlocationgroup   varchar(50),
    userid                varchar(200),
    userfullname          varchar(500),
    userrdofficecode      varchar(250),
    userofficecode        varchar(250),
    clientlocation        varchar(250),
    locationmachinenumber varchar(500),
    tokenid               varchar(1000)
);
```
and set up request_date to add local time because request_date in not null and eazy to use it                        
```ALTER TABLE sso_user_test ALTER COLUMN request_date SET DEFAULT now();```                        
but in ApiService code has                        
```apiEntity.setRequestDate(java.time.LocalDateTime.now().toString().trim());```                        
you can delete it or not it up to you to choose


## How to Run
You can press run spring boot and open swagger to try out the api.                                                
swagger link: ```http://localhost:8080/apitest/swagger-ui.html```

## Example to test by swagger
the data you can send to test                        
```
{
  "ssoType": "string",
  "systemId": "string",
  "systemName": "string",
  "systemTransactions": "string",
  "systemPrivileges": "string",
  "systemUserGroup": "string",
  "systemLocationGroup": "string",
  "userId": "string",
  "userFullName": "string",
  "userOfficeCode": "string",
  "clientLocation": "string",
  "locationMachineNumber": "string",
  "tokenId": "string",
  "userRdOfficeCode": "string"
}
```
You can change string to data if you want any to send this to spring.                        

The response is                        
```
{
  "responseCode": "200",
  "responseMessage": "ทำรายการเรียบร้อย",
  "responseData": {
    "userId": "string",
    "tokenId": "string"
  }
}
```                       
but the data blank space in userId or tokenId                        
```
{
  "responseCode": "E000001",
  "responseMessage": "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้",
  "responseData": {
    "userId": "string",
    "tokenId": ""
  }
}
```
