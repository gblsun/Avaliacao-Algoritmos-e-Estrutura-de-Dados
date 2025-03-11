/*
Avaliação Parcial Algoritmos e Estrutura de Dados. 11/03/2025
Faculdade Impacta - Ciência da Computação - 3 Semestre - Manhã
Desenvolvido e Criado por:
    Gabriel Muchon Pavanelli RA: 2401895
    Guilherme Pinheiro dos Santos RA: 2401832
5- Criar um programa que leia o valor da base e da altura de um triangulo e calcule a área.

 Área = (base x altura) / 2.
 */

import java.util.Scanner;

public class Questao5AreadoTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para base: ");
        double base = sc.nextDouble();

        System.out.println("Digite um valor para altura: ");
        double altura = sc.nextDouble();

        sc.close();
        double area = (base * altura) / 2;
        System.out.println("A área do triangulo= (" + base + " x " + altura + ") / 2 = " + area);

    }
}
