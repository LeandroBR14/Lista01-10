import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double tempC;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a temperatura em Celsius?");
        tempC = teclado.nextDouble();

        double tempF = tempC * 1.8 + 32;

        System.out.println("A temperatura em graus Fahrenheit é de : " +tempF);
        teclado.close();
    }
}
