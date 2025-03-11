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
