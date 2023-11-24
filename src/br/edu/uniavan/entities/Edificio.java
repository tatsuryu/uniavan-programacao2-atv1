package br.edu.uniavan.entities;

public class Edificio {
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
}