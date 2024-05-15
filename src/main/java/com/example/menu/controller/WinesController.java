package com.example.menu.controller;

import com.example.menu.wines.Wine;
import com.example.menu.wines.WinesRepository;
import com.example.menu.wines.WinesResponseDTO;
import com.example.menu.wines.WineRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("menu")
public class WinesController {

    @Autowired
    private WinesRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveWine(@RequestBody WineRequestDTO data){
        Wine wineData = new Wine(data);
        repository.save(wineData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<WinesResponseDTO> getAll(){

        List<WinesResponseDTO> wineList = repository.findAll().stream().map(WinesResponseDTO::new).toList();
        return wineList;

    }
}
