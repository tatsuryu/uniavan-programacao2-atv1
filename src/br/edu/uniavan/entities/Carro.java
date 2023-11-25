package br.edu.uniavan.entities;

public class Carro implements CarbonFootprint {
    private String modelo;
    private String combustivel;

    public Carro(String modelo, String combustivel) {
        this.modelo = modelo;
        this.combustivel = combustivel;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getCombustivel(){
        return this.combustivel;
    }

    public String descricao(){
        return String.format(
            "Carro modelo: %s, movido a %s",
            this.modelo,
            this.combustivel
        );
    }

    @Override
    public double getCarbonFootprint() {
        return modelo.length() * 2;
    }
}