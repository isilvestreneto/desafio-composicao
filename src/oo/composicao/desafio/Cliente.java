package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

    String nome;
    ArrayList<Compra> compras = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public Cliente(String nome, ArrayList<Compra> compras) {
        this.nome = nome;
        this.compras = compras;
    }

    void obterValorTotal() {
        double totalGasto = 0;

        for (Compra compra: compras) {
            totalGasto += compra.obterValorTotalCompra();
        }

        System.out.println("O valor total gasto por " + nome + " em todas as compras foi de:");
        System.out.println(totalGasto);
    }
}
