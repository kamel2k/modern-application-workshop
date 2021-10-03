package com.jc.gainde.manifesteservice.repository;

import com.jc.gainde.manifesteservice.model.Manifeste;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ManifesteRepository extends JpaRepository<Manifeste,Long> {

	List <Manifeste> findByNumeroRepertoire(String numeroRepertoire);
	
}
