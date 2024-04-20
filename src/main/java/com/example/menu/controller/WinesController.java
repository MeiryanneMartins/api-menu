package com.example.menu.controller;

import com.example.menu.wines.Wine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("menu")
public class WinesController {
    @GetMapping
    public void getAll(){
        Wine wines;

    }
}
