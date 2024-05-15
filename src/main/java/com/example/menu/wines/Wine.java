package com.example.menu.wines;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.example.menu.wines.WineRequestDTO;

@Table(name = "wines")
@Entity(name = "wines")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Wine {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String image;

    private Integer price;

    public Wine(WineRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}

