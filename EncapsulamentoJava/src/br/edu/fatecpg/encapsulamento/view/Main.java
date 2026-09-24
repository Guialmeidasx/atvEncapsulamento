package br.edu.fatecpg.encapsulamento.view;

import java.util.Scanner;

import br.edu.fatecpg.encapsulamento.model.Carro;
import br.edu.fatecpg.encapsulamento.model.ContaBancaria;
import br.edu.fatecpg.encapsulamento.model.Produto;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // =========================
        // 1 - TESTE DA CLASSE CARRO
        // =========================
        System.out.println("===== CARRO =====");

        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite a placa do carro: ");
        String placa = scanner.nextLine();

        System.out.print("Digite a capacidade do tanque (litros): ");
        double capacidadeTanque = Double.parseDouble(scanner.nextLine().replace(",", "."));

        System.out.print("Digite o preço da gasolina por litro: ");
        double valorGasolina = Double.parseDouble(scanner.nextLine().replace(",", "."));

        Carro carro = new Carro(marca, modelo, placa, capacidadeTanque);

        carro.ligar();
        carro.buzinar();
        carro.acelerar();

        double valorTotal = carro.calcularValorTanque(valorGasolina);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Capacidade do tanque: " + carro.getCapacidadeTanque() + " litros");
        System.out.printf("Valor para encher o tanque: R$ %.2f%n", valorTotal);

        // ==============================
        // 2 - TESTE DA CONTA BANCÁRIA
        // ==============================
        System.out.println("\n===== CONTA BANCÁRIA =====");

        ContaBancaria conta = new ContaBancaria("Guilherme");

        System.out.println("Titular: " + conta.getTitular());
        System.out.printf("Saldo inicial: R$ %.2f%n", conta.getSaldo());

        conta.depositar(500);
        System.out.printf("Saldo após depósito: R$ %.2f%n", conta.getSaldo());

        conta.sacar(150);
        System.out.printf("Saldo após saque: R$ %.2f%n", conta.getSaldo());

        // Testes de regras
        conta.depositar(-50);
        conta.sacar(1000);

        // =========================
        // 3 - TESTE DA CLASSE PRODUTO
        // =========================
        System.out.println("\n===== PRODUTO =====");

        Produto produto = new Produto("Notebook", 3500.00, 10);

        System.out.println("Nome: " + produto.getNome());
        System.out.printf("Preço: R$ %.2f%n", produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());

        // Alterações válidas
        produto.setPreco(3200.00);
        produto.setQuantidadeEstoque(15);

        System.out.println("\nApós alterações:");
        System.out.printf("Preço: R$ %.2f%n", produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());

        // Testes de valores inválidos
        System.out.println("\nTestando valores inválidos:");
        produto.setPreco(-50);
        produto.setQuantidadeEstoque(-10);

        scanner.close();
    }
}
