package com.joanne.curso.exercicios;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Conta calcContas = new Conta();
        ArrayList<Double> valoresPorConvidado = new ArrayList(Arrays.asList(10.0, 12.0, 9.0, 8.0, 7.0, 15.0, 11.0, 30.0));
        ArrayList<Double>resultado = calcContas.totalContas(valoresPorConvidado);
        
       double total = calcContas.findTotal(resultado);
        System.out.println("O valor por convidado é: " + resultado);
        System.out.println("O valor total da conta é de: " + total  );

        double remove = valoresPorConvidado.remove(7);
        System.out.println("O valor da conta removida é: " + remove);

        double calcToRemove = total - remove;
        System.out.println("o total com a conta removida ficou: " +calcToRemove );

    }
}
