package br.edu.uniavan.entities;

public class Escola extends Edificio {
    private int numeroSalas;

    public Escola(int area, int numeroAndares, int numeroSalas) {
        super(area, numeroAndares);
        this.numeroSalas = numeroSalas;
    }

    public int getNumeroDeSalas(){
        return this.numeroSalas;
    }

    @Override
    public double calculateCarbonFootprint(){
        return this.getArea() * this.getAndares() * this.numeroSalas * 1.2;
    }
}