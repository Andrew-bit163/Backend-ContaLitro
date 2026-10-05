package com.contalitro.backend.domain;

public class Veiculo {

    private Long id;
    private String placa;
    private String modelo;
    private Double capacidadeTanque;

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