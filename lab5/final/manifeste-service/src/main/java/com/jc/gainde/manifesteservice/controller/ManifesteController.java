package com.jc.gainde.manifesteservice.controller;

import com.jc.gainde.manifesteservice.model.Manifeste;
import com.jc.gainde.manifesteservice.service.ManifesteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@Slf4j
@RestController
@RequestMapping(value="/v1")
public class ManifesteController {
 
    @Autowired
    ManifesteService manifesteService;
 
    @GetMapping(value="/manifeste")
    public List<Manifeste> getManifestes() {
        log.info("Récuperation des manifestes");
        return manifesteService.getManifestes();
    }
 
    @PostMapping(value="/manifeste")
    public void createDManifeste(@RequestBody() Manifeste manifeste) {
        log.info("Création d'un manifeste");
        manifesteService.createManifeste(manifeste);
    }
 
    @GetMapping(value = "/manifeste/{id}")
    public Manifeste getManifeste(@PathVariable Long id) {
        log.info("Chargement d'un manifeste avec l'id", id);
        return manifesteService.findById(id)
                .orElseThrow(() -> new RuntimeException(String.valueOf(id)));
    }
    
    @GetMapping(value="/manifeste/repertoire/{numero}")
    public List<Manifeste> getManifesteByNumero(@PathVariable("numero") String numero) {
        log.info("Récuperation des manifestes par numero");
        return manifesteService.getManifesteByNumeroRepertoire(numero);
    }


 
}

