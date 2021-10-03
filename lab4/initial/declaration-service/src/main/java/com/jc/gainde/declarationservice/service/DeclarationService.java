package com.jc.gainde.declarationservice.service;

import com.jc.gainde.declarationservice.exceptions.ManifesteNotFoundException;
import com.jc.gainde.declarationservice.model.Declaration;
import com.jc.gainde.declarationservice.model.Manifeste;
import com.jc.gainde.declarationservice.repository.DeclarationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class DeclarationService {

    @Autowired
    DeclarationRepository declarationRepository;

    public List<Declaration> getDeclarations() {

        log.info("Service de récuperation des déclaration sans filter");
        return declarationRepository.findAll();
    }

    public List<Declaration> getDeclarationByNumeroRepertoire(String numeroRepertoire) {
        log.info("Service de récuperation des déclaration par numero repertoire");
        return declarationRepository.findByNumeroRepertoire(numeroRepertoire);
    }

    public void createDeclaration(Declaration declaration) {

        /**
         * A Completer
         */
        /*
        Manifeste manifeste = manifesteRepository.findOneByNumeroAndAnneeAndBureau(
                declaration.getManifeste().getNumero(),
                declaration.getManifeste().getAnnee(),
                declaration.getManifeste().getBureau());

        if (null == manifeste) {
            throw new ManifesteNotFoundException(String.valueOf(declaration.getManifeste().getNumero()),
                    declaration.getManifeste().getAnnee(),
                    declaration.getManifeste().getBureau());
        }

        declaration.setManifeste(manifeste);
        declarationRepository.save(declaration);
        */
    }

    public Manifeste getManifeste(Long id) {
        // A COMPLETER
        return null;
    }

    
}
