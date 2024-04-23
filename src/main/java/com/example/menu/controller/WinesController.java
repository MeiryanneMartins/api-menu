package com.example.menu.controller;

import com.example.menu.wines.Wine;
import com.example.menu.wines.WinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menu")
public class WinesController {

    @Autowired
    private WinesRepository repository;

    @GetMapping
    public List<Wine> getAll(){
        List<Wine> wineList = repository.findAll();
        return wineList;

    }
}
