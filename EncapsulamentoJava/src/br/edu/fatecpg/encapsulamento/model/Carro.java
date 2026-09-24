package br.edu.fatecpg.encapsulamento.model;

public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private double capacidadeTanque;

    public Carro(String marca, String modelo, String placa, double capacidadeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeTanque() {
        return this.capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void ligar() {
        System.out.println("Carro ligado!");
    }

    public void buzinar() {
        System.out.println("Buzina: BIP BIP!");
    }

    public void acelerar() {
        System.out.println("Carro acelerando!");
    }

    public double calcularValorTanque(double valorGasolina) {
        return this.capacidadeTanque * valorGasolina;
    }
}
