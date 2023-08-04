package com.example.javaClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface salarieRepository extends JpaRepository< salarie , Integer> {
}
