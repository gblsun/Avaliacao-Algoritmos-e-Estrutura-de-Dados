/*
Avaliação Parcial Algoritmos e Estrutura de Dados. 11/03/2025
Faculdade Impacta - Ciência da Computação - 3 Semestre - Manhã
Desenvolvido e Criado por:
    Gabriel Muchon Pavanelli RA: 2401895
    Guilherme Pinheiro dos Santos RA: 2401832
1- Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

 */
import java.util.Scanner;

public class Questao1FahrenheitparaCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja Bem vindo à Calculadora Fahrenheit para Celsius!");
        System.out.println("\nDigite o valor em Fahrenheit: ");
        double f = sc.nextDouble();
        double c = ((f - 32) / 1.8);
        System.out.println(f + "° em Celsius= " + c);
        sc.close();
    }
}
