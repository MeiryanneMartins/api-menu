package com.example.menu.wines;

public record WinesResponseDTO(Integer id, String title, String image, Integer price) {

    public WinesResponseDTO(Wine wine) {
        this(wine.getId(), wine.getTitle(), wine.getImage(), wine.getPrice());
    }
}
