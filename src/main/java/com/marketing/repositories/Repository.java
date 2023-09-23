package com.marketing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing.entities.Lead;

public interface Repository extends JpaRepository<Lead, Long> {

}
