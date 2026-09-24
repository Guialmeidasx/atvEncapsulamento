package br.edu.fatecpg.encapsulamento.model;

public class Produto {
    //METODOS E ATRIBUTOS
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // CONSTRUTOR
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // GETTERS

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }

    // SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("A quantidade em estoque não pode ser negativa.");
        }
    }
}