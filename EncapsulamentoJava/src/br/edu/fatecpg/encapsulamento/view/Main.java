package br.edu.fatecpg.encapsulamento.view;

import java.util.Scanner;

import br.edu.fatecpg.encapsulamento.model.Carro;
import br.edu.fatecpg.encapsulamento.model.ContaBancaria;
import br.edu.fatecpg.encapsulamento.model.Produto;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       // 1 - INTERFACE CARRO
      
        System.out.println("===== CADASTRO DO CARRO =====");

        System.out.print("Digite a marca: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite a placa: ");
        String placa = scanner.nextLine();

        System.out.print("Digite a capacidade do tanque (litros): ");
        double capacidadeTanque = scanner.nextDouble();

        System.out.print("Digite o valor da gasolina: ");
        double valorGasolina = scanner.nextDouble();

        Carro c1 = new Carro(marca, modelo, placa, capacidadeTanque);

        System.out.println();
        System.out.println("==== DADOS DO CARRO ====");
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Placa: " + c1.getPlaca());
        System.out.println("Capacidade do tanque: " + c1.getCapacidadeTanque() + " litros");

        System.out.println(c1.ligar());
        System.out.println(c1.buzinar());

        double valorTotal = c1.calcularValorTanque(valorGasolina);

        System.out.printf("Valor para encher o tanque: R$ %.2f%n", valorTotal);


    
        // 2 - INTERFACE CONTA BANCÁRIA
        System.out.println();
        System.out.println("==== CONTA BANCÁRIA ====");

        scanner.nextLine(); 

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(titular);

        conta.depositar(0);


        System.out.println("Titular: " + conta.getTitular());
        System.out.printf("Saldo inicial: R$ %.2f%n", conta.getSaldo());

        System.out.print("Digite o valor para depositar: ");
        double deposito = scanner.nextDouble();

        conta.depositar(deposito);

        System.out.printf("Saldo após depósito: R$ %.2f%n", conta.getSaldo());

        System.out.print("Digite o valor para sacar: ");
        double saque = scanner.nextDouble();

        conta.sacar(saque);

        System.out.printf("Saldo após saque: R$ %.2f%n", conta.getSaldo());

        // 3 - INTERFACE PRODUTO
        System.out.println();
        System.out.println("==== PRODUTO ====");

        scanner.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();

        Produto produto = new Produto(nomeProduto, precoProduto, quantidadeEstoque);

        System.out.println();
        System.out.println("Nome: " + produto.getNome());
        System.out.printf("Preço: R$ %.2f%n", produto.getPreco());
        System.out.println("Estoque: " + produto.getQuantidadeEstoque());

        // Testando preço negativo
        System.out.println();
        System.out.println("Tentando colocar preço negativo...");

        produto.setPreco(-50);

        System.out.printf("Preço atual: R$ %.2f%n", produto.getPreco());

        // Testando estoque negativo
        System.out.println();
        System.out.println("Tentando colocar estoque negativo...");

        produto.setQuantidadeEstoque(-10);

        System.out.println("Estoque atual: " + produto.getQuantidadeEstoque());

        scanner.close();
    }
}