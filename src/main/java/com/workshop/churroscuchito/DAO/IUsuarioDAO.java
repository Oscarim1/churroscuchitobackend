package com.workshop.churroscuchito.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.churroscuchito.models.Usuario;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario, Integer> {

}