package com.example.menu.wines;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WinesRepository extends JpaRepository<Wine, Integer> {
}
