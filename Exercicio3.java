/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista8daniel;

/**
 *
 * @author Vitor Hugo
 */
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();
        scanner.close();

        int resultado = somarTresNumeros(num1, num2, num3);
        System.out.println("A soma dos três números é: " + resultado);
    }

    public static int somarTresNumeros(int a, int b, int c) {
        return a + b + c;
    }
}
