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

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        char resultado = verificarPositivoNegativo(numero);
        System.out.println("O resultado é: " + resultado);
    }

    public static char verificarPositivoNegativo(int numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
}
