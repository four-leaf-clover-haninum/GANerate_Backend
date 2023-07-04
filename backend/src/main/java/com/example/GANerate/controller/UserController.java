package com.example.GANerate.controller;

import com.example.GANerate.request.UserRequest;
import com.example.GANerate.response.CustomResponseEntity;
import com.example.GANerate.response.UserResponse;
import com.example.GANerate.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    //회원가입
    @PostMapping("/auth/signup")
    public CustomResponseEntity<UserResponse.signup> signup(
            @RequestBody @Valid final UserRequest.signup request){
        return CustomResponseEntity.success(userService.signup(request));
    }

    //로그인
    @PostMapping("/auth/signin")
    public CustomResponseEntity<UserResponse.signin> signin(
            @RequestBody @Valid final UserRequest.signin request){
        return CustomResponseEntity.success(userService.signin(request));
    }




    //유저 정보 조회


    //프로필 수정


    //좋아요 상품 조회


    //구매 상품 조회




}
