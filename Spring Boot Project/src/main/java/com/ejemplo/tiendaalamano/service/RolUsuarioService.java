package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.RolUsuario;
import com.ejemplo.tiendaalamano.repository.RolUsuarioRepository;

@Service
public class RolUsuarioService implements IRolUsuario {
	
	@Autowired
	private RolUsuarioRepository repositorio;

	@Override
	public List<RolUsuario> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<RolUsuario> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public RolUsuario save(RolUsuario rol) {
	
		return repositorio.save(rol);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}
