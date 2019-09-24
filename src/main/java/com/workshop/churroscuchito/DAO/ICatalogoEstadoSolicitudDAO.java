package com.workshop.churroscuchito.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.churroscuchito.models.CatalogoEstadoSolicitud;

@Repository
public interface ICatalogoEstadoSolicitudDAO extends JpaRepository<CatalogoEstadoSolicitud, Integer> {

}
