package com.abc.filter;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    @GetMapping
    public ResponseEntity userInfo(@RequestHeader(value = "email") String email) {
        System.out.println(email);
        return ResponseEntity.ok(null);
    }

}