package com.joanne.curso.exercicios;

public class Main {
        public static void main(String[] args) {
            int eggsPerChicken = 5;
            double chickenCount = 3;
            eggsPerDay(5,3);
            eggsPerDay(4, 8);

        }
        public static int eggsPerDay(int eggsPerChicken, int chickenCount) {
            int totalEggs = 0;
            for (int i = 0; i <= 2; i++) {
                switch (i) {
                    case 0:
                        totalEggs = chickenCount * eggsPerChicken;
                        break;
                    case 1:
                        chickenCount = chickenCount + 1;
                        totalEggs += (chickenCount * eggsPerChicken);
                        break;
                    case 2:
                        chickenCount = (chickenCount / 2);
                        totalEggs += (chickenCount * eggsPerChicken);
                        break;
                    default:
                        throw new java.lang.IllegalStateException("Unexpected value: " + i);
                }
            }
            System.out.println("O Total de ovos é " + totalEggs);
            return totalEggs;
        }
    }