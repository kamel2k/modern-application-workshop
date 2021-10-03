package com.jc.gainde.manifesteservice.service;

import com.jc.gainde.manifesteservice.model.Manifeste;
import com.jc.gainde.manifesteservice.repository.ManifesteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
import java.util.Optional;
 
@Slf4j
@Service
public class ManifesteService {
 
    private final ManifesteRepository manifesteRepository;
 
    @Autowired
    public ManifesteService(ManifesteRepository manifesteRepository) {
        this.manifesteRepository = manifesteRepository;
    }
 
    public List<Manifeste> getManifestes() {
        log.info("recuperation des manifestes service");
        return manifesteRepository.findAll();
    }
 
    public Manifeste createManifeste(Manifeste manifeste) {
        log.info("service nouveau manifeste");
        return manifesteRepository.save(manifeste);
    }
 
    public Optional<Manifeste> findById(Long id) {
        log.info("service get manifeste by id");
        return manifesteRepository.findById(id);
    }
    
    public List<Manifeste> getManifesteByNumeroRepertoire(String numero) {
        log.info("service : get manifeste par numero repertoire");
        return manifesteRepository.findByNumeroRepertoire(numero);
    }
}

