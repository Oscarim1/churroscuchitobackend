package com.workshop.churroscuchito.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.churroscuchito.models.DetalleProducto;

@Repository
public interface IDetalleProductoDAO extends JpaRepository<DetalleProducto, Integer> {

}

