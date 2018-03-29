package com.tw.pjhu.controller.home;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HomeController {

    @GetMapping("/home")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<UserResponse> getHome() {
        UserResponse user = UserResponse.builder().name("pjhu").build();
        return ResponseEntity.ok(user);
    }
}