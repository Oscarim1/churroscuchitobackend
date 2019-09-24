package com.workshop.churroscuchito.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.churroscuchito.models.Producto;

@Repository
public interface IProductoDAO extends JpaRepository<Producto, Integer> {

}