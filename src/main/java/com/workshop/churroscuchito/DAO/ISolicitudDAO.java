package com.workshop.churroscuchito.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.churroscuchito.models.Solicitud;

@Repository
public interface ISolicitudDAO extends JpaRepository<Solicitud, Integer> {

}