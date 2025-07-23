package com.example.api.controller;

import com.example.api.DTO.ApiResponse;

import com.example.api.model.ApiModel;
import com.example.api.service.ApiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @PostMapping("/addUser")
    public ResponseEntity<ApiResponse> addUser(@RequestBody ApiModel addUser) {
        ApiResponse response = (ApiResponse) apiService.addUser(addUser);
        return ResponseEntity.ok(response);
    }




}
