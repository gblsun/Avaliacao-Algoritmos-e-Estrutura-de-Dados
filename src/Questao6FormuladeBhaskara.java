/*
Avaliação Parcial Algoritmos e Estrutura de Dados. 11/03/2025
Faculdade Impacta - Ciência da Computação - 3 Semestre - Manhã
Desenvolvido e Criado por:
    Gabriel Muchon Pavanelli RA: 2401895
    Guilherme Pinheiro dos Santos RA: 2401832
6 - Criar um programa que resolve equações do segundo grau (ax2+bx+c=0). Utilizando a formula de Bhaskara. Use como exemplo a=1, b= 12, c= -13. Encontre o Delta.

fórmula=
delta = (b*b)-4-a*c
xpositivo=(-b+sqrt(delta))2a
xpositivo=(-b-sqrt(delta))2a
 */

import java.util.Scanner;

public class Questao6FormuladeBhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao programa de calcular o Δ (Delta) e raízes!");
        System.out.printf("Digite o valor de A: ");
        double a = sc.nextDouble();

        System.out.printf("Digite o valor de B: ");
        double b = sc.nextDouble();

        System.out.printf("Digite o valor de C: ");
        double c = sc.nextDouble();

        double delta = (b * b) - (4 * a * c);
        sc.close();

        double xpositivo = (((-b) + (Math.sqrt(delta))) / 2 * a);
        double xnegativo = (((-b) - (Math.sqrt(delta))) / 2 * a);

        System.out.println("O valor de Δ (Delta) é: " + delta + "\n o valor do x positivo é: " + xpositivo + "\n o valor do x negativo é: " + xnegativo);
    }
}
/**
 * Resultado esperado:
 *
 * Seja bem vindo ao programa de calcular o Δ (Delta) e raízes!
 * Digite o valor de A: 1
 * Digite o valor de B: 12
 * Digite o valor de C: -13
 * O valor de Δ (Delta) é: 196.0
 *  o valor do x positivo é: 1.0
 *  o valor do x negativo é: -13.0
 */