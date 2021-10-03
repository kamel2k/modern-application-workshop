package com.jc.gainde.declarationservice.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Setter
@Getter
@Builder(setterPrefix = "with")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Manifeste {

    @Id @GeneratedValue
    private Long id;
    private String numeroRepertoire;
    private Date dateArrivee;
    private String bureau;
    private String moyenTransport;
    private String typeManifeste;
    private String statut;
    private int numero;
    private String annee;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Collection<Article> articles;
}
