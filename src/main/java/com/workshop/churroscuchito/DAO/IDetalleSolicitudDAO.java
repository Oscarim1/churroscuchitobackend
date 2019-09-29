package com.workshop.churroscuchito.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.churroscuchito.models.DetalleSolicitud;

@Repository
public interface IDetalleSolicitudDAO extends JpaRepository<DetalleSolicitud, Integer> {

}