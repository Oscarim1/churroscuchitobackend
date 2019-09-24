package com.workshop.churroscuchito.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.churroscuchito.models.DetalleUsuario;

@Repository
public interface IDetalleUsuarioDAO extends JpaRepository<DetalleUsuario, Integer> {

}