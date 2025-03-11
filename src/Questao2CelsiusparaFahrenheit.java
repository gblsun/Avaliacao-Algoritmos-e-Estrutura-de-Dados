/*
Avaliação Parcial Algoritmos e Estrutura de Dados. 11/03/2025
Faculdade Impacta - Ciência da Computação - 3 Semestre - Manhã
Desenvolvido e Criado por:
    Gabriel Muchon Pavanelli RA: 2401895
    Guilherme Pinheiro dos Santos RA: 2401832
2- Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

(C°*9/5)+32 = F°
------> "%.2f"
 */

import java.util.Scanner;

public class Questao2CelsiusparaFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja Bem vindo à Calculadora Celsius para Fahrenheit!");
        System.out.println("\nDigite o valor em Celsius: ");
        double c = sc.nextDouble();
        double f = ((c*9/5)+32);
        System.out.println(c+ "° em Fahrenheit="+f);
        sc.close();
    }
}
