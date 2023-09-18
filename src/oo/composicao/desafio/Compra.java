package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();

    double obterValorTotalCompra() {
        double valorTotal = 0;
        for (Item item: itens) {
            valorTotal += item.getValorTotalProduto();
        }
        return valorTotal;
    }
}
