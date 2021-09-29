package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    private double valor;
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Prato(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void adicionarIngrediente (Ingrediente novoIngrediente){
        ingredientes.add(novoIngrediente);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("O nome do prato é: "+nome);
        retorno.append("O valor do prato é: "+ valor);
        retorno.append("Os ingredientes são: "+ ingredientes);
        return retorno.toString();
    }
}
