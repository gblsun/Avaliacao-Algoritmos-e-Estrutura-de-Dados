/*
Avaliação Parcial Algoritmos e Estrutura de Dados. 11/03/2025
Faculdade Impacta - Ciência da Computação - 3 Semestre - Manhã
Desenvolvido e Criado por:
    Gabriel Muchon Pavanelli RA: 2401895
    Guilherme Pinheiro dos Santos RA: 2401832
3 - Criar um programa que leia o peso e altura do usuário e imprima no console o IMC.

 */

import java.util.Scanner;

public class Questao3CalculodoIMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para peso (KG): ");
        double peso = sc.nextDouble();

        System.out.println("Digite um valor para altura (M): ");
        double altura = sc.nextDouble();

        sc.close();
        double IMC = (peso / (altura * altura));
        System.out.println("O cálculo do IMC= (" + peso + " x " + altura + ") / 2 = " + IMC);

    }
}
