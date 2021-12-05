package com.ejemplo.tiendaalamano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.ejemplo.tiendaalamano.model.Recaudo;

@Repository
public interface RecaudoRepository extends JpaRepository<Recaudo, Long>{

	
	
}
