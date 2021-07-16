package com.joanne.curso.exercicios;

import java.util.ArrayList;

public class Conta {
    public ArrayList<Double>  totalContas(ArrayList<Double> valor){
       ArrayList<Double> valorPerson = new ArrayList<>();

        for (int i = 0; i < valor.size() ; i++) {
           double taxas = valor.get(i) * 0.20;
           double totalComTaxas = taxas + valor.get(i);
            valorPerson.add(totalComTaxas);
        }

        return valorPerson;
    }
    public double findTotal(ArrayList<Double>contas){
        double soma = 0;
        for (int i = 0; i < contas.size(); i++) {
            soma += contas.get(i);

        }
        return soma;
    }

    public int removePerson(ArrayList<Double>remover){
        int personRemove = 0;
        for (int i = 0; i < remover.size(); i++) {
            personRemove -= remover.remove(i);

        }
        return personRemove;
    }

}
