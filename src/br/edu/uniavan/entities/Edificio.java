package br.edu.uniavan.entities;

public abstract class Edificio implements CarbonFootprint {
    private int area;
    private int numeroAndares;

    public Edificio(int area, int numeroAndares){
        this.area = area;
        this.numeroAndares = numeroAndares;
    }

    public int getArea() {
        return this.area;
    }

    public int getAndares() {
        return this.numeroAndares;
    }

    public abstract double calculateCarbonFootprint();

    @Override
    public double getCarbonFootprint() {
        return calculateCarbonFootprint();
    }
}