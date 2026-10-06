package com.contalitro.backend.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Veiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;
    private String modelo;
    private Double capacidadeTanque;

    @OneToMany(mappedBy = "veiculo")
    private List<Leitura> leituras = new ArrayList<>();

    @OneToMany(mappedBy = "veiculo")
    private List<Viagem> viagens = new ArrayList<>();

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public Double getCapacidadeTanque(){
        return capacidadeTanque;
    } 
    
    public void setCapacidadeTanque(Double capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
}