package com.workshop.churroscuchito.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.churroscuchito.models.DetalleOrden;

@Repository
public interface IDetalleOrdenDAO extends JpaRepository<DetalleOrden, Integer> {

}