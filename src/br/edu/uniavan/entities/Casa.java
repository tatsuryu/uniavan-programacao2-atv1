package br.edu.uniavan.entities;

public class Casa extends Edificio {
    private int numeroDePessoas;

    public Casa(int area, int numeroAndares, int numeroDePessoas) {
        super(area, numeroAndares);
        this.numeroDePessoas = numeroDePessoas;
    }

    public int getNumeroDePessoas() {
        return this.numeroDePessoas;
    }

    @Override
    public double calculateCarbonFootprint() {
        return this.getAndares() * 10.0 + numeroDePessoas * 2.0;
    }
}