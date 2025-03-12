package com.sm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.model.Tourist;

public interface ITouristRepository extends JpaRepository<Tourist, Integer> {

}
