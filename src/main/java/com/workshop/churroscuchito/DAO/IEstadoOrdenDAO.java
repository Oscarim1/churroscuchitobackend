package com.workshop.churroscuchito.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.churroscuchito.models.EstadoOrden;

@Repository
public interface IEstadoOrdenDAO extends JpaRepository<EstadoOrden, Integer> {

}