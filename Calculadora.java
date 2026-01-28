package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite outro numero: ");
        double valor2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Escolha a operação (+, -, x, /): ");
        String operacao = scanner.nextLine();


        switch (operacao) {
            case "+" -> {
                System.out.printf("%.1f", valor1 + valor2);
            }
            case "-" -> {
                System.out.printf("%.1f", valor1 - valor2);
            }
            case "x" -> {
                System.out.printf("%.1f", valor1 * valor2);
            }
            case "/" -> {
                System.out.printf( "%.1f", valor1 / valor2);
            }
        }
        
        scanner.close();
    }
    
}
