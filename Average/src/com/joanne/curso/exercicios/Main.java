package com.joanne.curso.exercicios;

public class Main {
    public static void main(String[] args) {
    days();
    }
    public static void days() {

        int monday = 100;
        int tuesday = 121;
        int wednesday = 117;

        double dailyEggs = monday + tuesday + wednesday;
        double dailyAverage = dailyEggs / 3;
        double monthlyAverage = dailyAverage *30;
        double monthlyProfit = monthlyAverage *0.18;
           System.out.println("Daily Average:   " +dailyAverage);
           System.out.println("Monthly Average: " +monthlyAverage);
           System.out.println("Monthly Profit:  $" +monthlyProfit);

    }
}

