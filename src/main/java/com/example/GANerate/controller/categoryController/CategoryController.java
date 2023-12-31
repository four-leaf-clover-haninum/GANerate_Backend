package com.example.GANerate.controller.categoryController;

import com.example.GANerate.response.CustomResponseEntity;
import com.example.GANerate.response.category.CategoryResponse;
import com.example.GANerate.service.category.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CategoryController {

    private final CategoryService categoryService;

    //전체 카테고리 조회
    @GetMapping("/v1/categories")
    public CustomResponseEntity<List<CategoryResponse.findCategories>> findCategories(){
        return CustomResponseEntity.success(categoryService.findCategories());
    }
}
