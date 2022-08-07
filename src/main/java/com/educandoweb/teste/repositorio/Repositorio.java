package com.educandoweb.teste.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.teste.usuario.Usuario;

public interface Repositorio extends JpaRepository<Usuario, Long> {

}
