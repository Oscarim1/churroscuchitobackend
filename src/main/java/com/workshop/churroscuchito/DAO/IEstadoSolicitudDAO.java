package com.workshop.churroscuchito.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.churroscuchito.models.EstadoSolicitud;

@Repository
public interface IEstadoSolicitudDAO extends JpaRepository<EstadoSolicitud, Integer> {

}