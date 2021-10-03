package com.jc.gainde.declarationservice.repository;

import com.jc.gainde.declarationservice.model.Declaration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeclarationRepository extends JpaRepository<Declaration, Long> {

    List<Declaration> findByNumeroRepertoire(String numeroRepertoire);
}