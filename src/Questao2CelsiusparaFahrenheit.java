import java.util.Scanner;

/*
(C°*9/5)+32 = F°
------> "%.2f"
 */
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
