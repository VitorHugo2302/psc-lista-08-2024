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

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar = 'S';
        while (continuar == 'S') {
            System.out.print("Digite a hora (0-23): ");
            int hora = scanner.nextInt();
            System.out.print("Digite os minutos (0-59): ");
            int minutos = scanner.nextInt();

            String horaConvertida = converterPara12Horas(hora, minutos);
            System.out.println("Hora convertida: " + horaConvertida);

            System.out.print("Deseja converter outra hora? (S/N): ");
            continuar = scanner.next().charAt(0);
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }

    public static String converterPara12Horas(int hora, int minutos) {
        String periodo = "A.M.";
        if (hora >= 12) {
            periodo = "P.M.";
        }
        if (hora > 12) {
            hora -= 12;
        } else if (hora == 0) {
            hora = 12;
        }

        return hora + ":" + String.format("%02d", minutos) + " " + periodo;
    }
}
