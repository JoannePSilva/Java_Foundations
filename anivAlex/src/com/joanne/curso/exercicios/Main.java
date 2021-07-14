package com.joanne.curso.exercicios;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Conta calcContas = new Conta();
        ArrayList<Double> valoresPorConvidado = new ArrayList(Arrays.asList(10.0, 12.0, 9.0, 8.0, 7.0, 15.0, 11.0, 30.0));
        ArrayList<Double>resultado = calcContas.totalContas(valoresPorConvidado);

        System.out.println("O valor por convidado é: " + resultado);
        System.out.println("O valor total da conta é de: "  );
    }
}
