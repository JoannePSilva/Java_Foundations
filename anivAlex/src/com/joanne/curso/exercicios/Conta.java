package com.joanne.curso.exercicios;

import java.util.ArrayList;

public class Conta {
    public ArrayList<Double>  totalContas(ArrayList<Double> valor){
       ArrayList<Double> valorPerson = new ArrayList<>();

        for (int i = 0; i < valor.size() ; i++) {
           double taxas = valor.get(i) * 0.20;
           double totaComTaxas = taxas + valor.get(i);
            valorPerson.add(totaComTaxas);
        }

        return valorPerson;
    }

}
