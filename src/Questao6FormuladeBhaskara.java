/*
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
        System.out.println(Math.sqrt(0));

        double xpositivo = (((-b) + (Math.sqrt(delta))) / 2 * a);
        double xnegativo = (((-b) - (Math.sqrt(delta))) / 2 * a);

        System.out.println("O valor de Δ (Delta) é: " + delta + "\n o valor do x positivo é: " + xpositivo + "\n o valor do x negativo é: " + xnegativo);
    }
}
