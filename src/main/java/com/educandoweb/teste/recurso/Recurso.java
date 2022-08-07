package com.educandoweb.teste.recurso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.teste.servicos.Servicos;
import com.educandoweb.teste.usuario.Usuario;

@RestController
@RequestMapping(value = "/usuario")
public class Recurso {
	
	@Autowired
	private Servicos servico;
	
	@PostMapping
	public ResponseEntity<Usuario> inserir(@RequestBody Usuario usuario){
		usuario = servico.inserir(usuario);
		return ResponseEntity.ok().body(usuario);
	}
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id){
		servico.deletar(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listarTodos(){
		List<Usuario> usuario = servico.listarTodos();
		return ResponseEntity.ok().body(usuario);
	}
	

}
