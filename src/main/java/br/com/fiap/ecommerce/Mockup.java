package br.com.fiap.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Mockup {
    private static List<Produto> produtos;

    static {
        produtos = new ArrayList<Produto>();

        produtos.add(new Produto(1l, "Pêra"));

        produtos.add(new Produto(2l, "Maçã"));
    }



    public static List<Produto> list() {
        return produtos;
    }

}
