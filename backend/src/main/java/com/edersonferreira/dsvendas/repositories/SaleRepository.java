package com.edersonferreira.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edersonferreira.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
