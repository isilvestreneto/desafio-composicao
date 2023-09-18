package oo.composicao.desafio;

import java.util.ArrayList;

public class DesafioRunner {
    // 1 cliente
    // 2 compras com 2 itens
    public static void main(String[] args) {
        var caneta = new Item(4, new Produto("Caneta", 3));
        var papel = new Item(1, new Produto("Papel", 10));

        var compra1 = new Compra();

        compra1.itens.add(caneta);
        compra1.itens.add(papel);

        double v1 = compra1.obterValorTotalCompra();

        System.out.println("O valor total da compra1 foi de " + v1);

        var brigadeiro = new Item(10, new Produto("Caneta", 1));
        var pastel = new Item(2, new Produto("Papel", 5));

        var compra2 = new Compra();

        compra2.itens.add(brigadeiro);
        compra2.itens.add(pastel);

        double v2 = compra2.obterValorTotalCompra();

        System.out.println("O valor total da compra2 foi de " + v2);

        ArrayList<Compra> compras = new ArrayList<>();
        compras.add(compra1);
        compras.add(compra2);

        var cliente = new Cliente("Ivan Silvestre", compras);

        cliente.obterValorTotal();
    }
}
