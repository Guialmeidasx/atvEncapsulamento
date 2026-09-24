package br.edu.fatecpg.encapsulamento.model;

public class Carro {
    // MÉTODOS E ATRIBUTOS
    private String marca;
    private String modelo;
    private String placa;
    private double capacidadeTanque;

    // MÉTODO CONSTRUTOR
    public Carro(String marca, String modelo, String placa, double capacidadeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.capacidadeTanque = capacidadeTanque;
    }

    // GETTERS E SETTERS

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

    // MÉTODOS

    public String ligar() {
        return "Carro ligado!";
    }

    public String buzinar() {
        return "Bi Bi Bi";
    }

    public String acelerar(int vel) {
        return "Você acelerou a " + vel + " KM/H";
    }

    // Calcula o valor total para encher o tanque
    public double calcularValorTanque(double valorGasolina) {
        return this.capacidadeTanque * valorGasolina;
    }
}