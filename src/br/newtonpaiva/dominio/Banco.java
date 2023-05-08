package br.newtonpaiva.dominio;

import java.util.ArrayList;

public class Banco {

    private String nome;

    private ArrayList<Conta> contas;

    public Double somaValores (ArrayList<Conta> contas){
        Double valorTotal = 0.0;
        for (Conta iten : contas) {
             valorTotal += iten.getSaldo();
        }
        return valorTotal;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
