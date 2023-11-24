package br.edu.uniavan.entities;

public class Bicicleta {
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
}