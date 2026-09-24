package br.edu.fatecpg.encapsulamento.model;

public class ContaBancaria {
    //METODOS E ATRIBUTOS
    private double saldo;
    private String titular;

    // CONSTRUTOR
    public ContaBancaria(String titular) {
    this.titular = titular;
    this.saldo = 0;
}

    // GETTERS E SETTERS

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // DEPOSITAR
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // SACAR
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser positivo.");
        } else if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}