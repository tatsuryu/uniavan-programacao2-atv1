package br.edu.uniavan.entities;

public class Bicicleta implements CarbonFootprint {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String pedala(){
        return String.format("pedalando bicicleta %s", this.tipo);
    }

    @Override
    public double getCarbonFootprint() {
        return this.tipo.equals("elétrica") ? 1.5 : 0.5;
    }
}