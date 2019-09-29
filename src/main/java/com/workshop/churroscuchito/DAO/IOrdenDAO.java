package com.workshop.churroscuchito.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.churroscuchito.models.Orden;

@Repository
public interface IOrdenDAO extends JpaRepository<Orden, Integer> {

}