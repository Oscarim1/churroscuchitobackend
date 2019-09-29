package com.workshop.churroscuchito.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.churroscuchito.models.CatalogoEstadoOrden;

@Repository
public interface ICatalogoEstadoOrdenDAO extends JpaRepository<CatalogoEstadoOrden, Integer> {

}
