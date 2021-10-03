package com.jc.gainde.declarationservice.controller;

import com.jc.gainde.declarationservice.model.Declaration;
import com.jc.gainde.declarationservice.model.Manifeste;
import com.jc.gainde.declarationservice.service.DeclarationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value="/v1")
public class DeclarationController {

    @Autowired
    DeclarationService declarationService;

    @GetMapping(value="/declaration")
    public List<Declaration> getDeclarations() {
        log.info("Récuperation des déclarations");
        return declarationService.getDeclarations();
    }

    @GetMapping(value="/declaration/{numero}")
    public List<Declaration> getDeclarationsByNumeroRepertoire(@PathVariable("numero") String numero) {
        log.info("Récuperation des déclarations par numero Répertoire");
        return declarationService.getDeclarationByNumeroRepertoire(numero);
    }

    @PostMapping(value="/declaration")
    public void createDeclaration(@RequestBody() Declaration declarationDto) {
        log.info("Création d'une déclaration");
        declarationService.createDeclaration(declarationDto);
    }

    @GetMapping(value="/declaration/manifeste")
    public Manifeste searchManifeste(@RequestParam Long id) {
        log.info("Recherche Manifeste");
        // A COMPLETER
        return null;
    }
}


