package br.edu.fatecpg.encapsulamento.model;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("O valor do depósito deve ser positivo!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saque não realizado! Verifique o valor e o saldo.");
        }
    }
}
