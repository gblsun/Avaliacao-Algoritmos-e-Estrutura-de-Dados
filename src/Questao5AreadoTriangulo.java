import java.util.Scanner;

/*
 Área = (base x altura) / 2.
 */
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
