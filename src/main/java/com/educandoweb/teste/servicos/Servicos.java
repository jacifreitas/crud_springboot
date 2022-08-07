package com.educandoweb.teste.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.teste.repositorio.Repositorio;
import com.educandoweb.teste.usuario.Usuario;

@Service
public class Servicos {
	
	@Autowired
	private Repositorio repositorio;
	
	public Usuario inserir(Usuario usuario) {
		return repositorio.save(usuario);
	}
	
	public void deletar(Long id) {
		 repositorio.deleteById(id);
	}
	
	public List<Usuario> listarTodos(){
		List<Usuario> usu = repositorio.findAll();
		return usu;
	}

}
