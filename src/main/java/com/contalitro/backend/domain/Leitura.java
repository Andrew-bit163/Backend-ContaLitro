package com.contalitro.backend.domain;

import java.time.LocalDateTime;

public class Leitura {

    private Long id;
    private Veiculo veiculo;
    private LocalDateTime instante;

    private Double speedKmh;
    private Double rpm;
    private Double tankPct;
    private Double fuelLph;
    private Double consumptionKml;
    private Double tripDistanceKm;
    private Double tripFuelL;
    private Double tripCostBrl;
    private Double idleTimeS;
    private Double efficiencyScore;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getInstante() {
        return instante;
    }

    public void setInstante(LocalDateTime instante) {
        this.instante = instante;
    }

    public Double getSpeedKmh() {
        return speedKmh;
    }

    public void setSpeedKmh(Double speedKmh) {
        this.speedKmh = speedKmh;
    }

    public Double getRpm() {
        return rpm;
    }

    public void setRpm(Double rpm) {
        this.rpm = rpm;
    }

    public Double getTankPct() {
        return tankPct;
    }

    public void setTankPct(Double tankPct) {
        this.tankPct = tankPct;
    }

    public Double getFuelLph() {
        return fuelLph;
    }

    public void setFuelLph(Double fuelLph) {
        this.fuelLph = fuelLph;
    }

    public Double getConsumptionKml() {
        return consumptionKml;
    }

    public void setConsumptionKml(Double consumptionKml) {
        this.consumptionKml = consumptionKml;
    }

    public Double getTripDistanceKm() {
        return tripDistanceKm;
    }

    public void setTripDistanceKm(Double tripDistanceKm) {
        this.tripDistanceKm = tripDistanceKm;
    }

    public Double getTripFuelL() {
        return tripFuelL;
    }

    public void setTripFuelL(Double tripFuelL) {
        this.tripFuelL = tripFuelL;
    }

    public Double getTripCostBrl() {
        return tripCostBrl;
    }

    public void setTripCostBrl(Double tripCostBrl) {
        this.tripCostBrl = tripCostBrl;
    }

    public Double getIdleTimeS() {
        return idleTimeS;
    }

    public void setIdleTimeS(Double idleTimeS) {
        this.idleTimeS = idleTimeS;
    }

    public Double getEfficiencyScore() {
        return efficiencyScore;
    }

    public void setEfficiencyScore(Double efficiencyScore) {
        this.efficiencyScore = efficiencyScore;
    }
}