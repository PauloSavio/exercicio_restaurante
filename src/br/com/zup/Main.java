package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Prato prato1 = new Prato("Feijoada", 50);

        Ingrediente ingrediente1 = new Ingrediente("Feijão");
        Ingrediente ingrediente2 = new Ingrediente("Carne");


        System.out.println(prato1);
        prato1.adicionarIngrediente(ingrediente1);
        prato1.adicionarIngrediente(ingrediente2);
        System.out.println("-------------------");
        System.out.println(prato1);
    }
}
