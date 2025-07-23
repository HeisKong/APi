package com.example.api.service;

import com.example.api.DTO.ApiResponse;
import com.example.api.DTO.ResponseData;
import com.example.api.entity.ApiEntity;
import com.example.api.model.ApiModel;
import com.example.api.repository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    @Autowired
    private ApiRepository apiRepository;
    public ApiResponse addUser(ApiModel apiModel) {
        ApiEntity apiEntity = new ApiEntity();
        try {

            apiEntity.setRequestDate(java.time.LocalDateTime.now().toString().trim());
            apiEntity.setSsoType(apiModel.getSsoType().trim());
            apiEntity.setSystemId(apiModel.getSystemId().trim());
            apiEntity.setSystemName(apiModel.getSystemName().trim());
            apiEntity.setSystemTransactions(apiModel.getSystemTransactions().trim());
            apiEntity.setSystemPrivileges(apiModel.getSystemPrivileges().trim());
            apiEntity.setSystemUserGroup(apiModel.getSystemUserGroup().trim());
            apiEntity.setSystemLocationGroup(apiModel.getSystemLocationGroup().trim());
            apiEntity.setUserId(apiModel.getUserId().trim());
            apiEntity.setUserFullName(apiModel.getUserFullName().trim());
            apiEntity.setUserOfficeCode(apiModel.getUserOfficeCode().trim());
            apiEntity.setClientLocation(apiModel.getClientLocation().trim());
            apiEntity.setLocationMachineNumber(apiModel.getLocationMachineNumber().trim());
            apiEntity.setTokenId(apiModel.getTokenId().trim());

            if(apiEntity.getUserId().isEmpty() || apiModel.getTokenId().isEmpty()){
                return new ApiResponse("E000001", "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้", new ResponseData(apiModel.getUserId(), (apiModel.getTokenId())));
            }
            ApiEntity savedEntity = apiRepository.save(apiEntity);
            ResponseData responseData = new ResponseData(apiModel.getUserId(), apiModel.getTokenId());
            return  new ApiResponse("200", "ทำรายการเรียบร้อย", responseData);
        } catch (Exception e) {
            ResponseData data = new ResponseData(apiModel.getUserId(), apiModel.getTokenId());
            return new ApiResponse("500", "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้", data);
        }

    }
}
