/*
Avaliação Parcial Algoritmos e Estrutura de Dados. 11/03/2025
Faculdade Impacta - Ciência da Computação - 3 Semestre - Manhã
Desenvolvido e Criado por:
    Gabriel Muchon Pavanelli RA: 2401895
    Guilherme Pinheiro dos Santos RA: 2401832
4- Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

 */
import java.util.Scanner;

public class Questao4QuadradoeaoCubodoValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para calcular ao quadrado e ao cubo: ");
        double valor = sc.nextDouble();

        double quadrado = valor * valor;
        double cubo = valor * valor * valor;
        System.out.println("Os resultados são:\nQuadrado do número: " + valor + " = " + quadrado + "\nCubo do número: " + valor + " = " + cubo);
    }
}
