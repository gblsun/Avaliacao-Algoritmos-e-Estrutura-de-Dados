import java.util.Scanner;

/*

 */
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
