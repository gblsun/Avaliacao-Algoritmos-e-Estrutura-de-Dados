import java.util.Scanner;

/*

 */
public class Questao3CalculodoIMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para peso (KG): ");
        double peso = sc.nextDouble();

        System.out.println("Digite um valor para altura (M): ");
        double altura = sc.nextDouble();

        sc.close();
        double IMC = (peso / (altura*altura));
        System.out.println("O cálculo do IMC= (" + peso + " x " + altura + ") / 2 = " + IMC);

    }
}
