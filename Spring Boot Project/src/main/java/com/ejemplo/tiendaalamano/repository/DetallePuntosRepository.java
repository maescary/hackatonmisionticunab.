package com.ejemplo.tiendaalamano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.ejemplo.tiendaalamano.model.DetallePuntos;

@Repository
public interface DetallePuntosRepository extends JpaRepository<DetallePuntos, Long>{

	
	
}
