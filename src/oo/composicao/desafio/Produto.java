package oo.composicao.desafio;

public class Produto {
    String nome;
    double valorProduto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Produto(String nome, double valorProduto) {
        this.nome = nome;
        this.valorProduto = valorProduto;
    }
}
