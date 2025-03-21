package com.example.realestate.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.realestate.response.ApiResponse;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<ApiResponse> homeController() {
        ApiResponse res = new ApiResponse("Welcome to the Real Estate Management System", true);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
