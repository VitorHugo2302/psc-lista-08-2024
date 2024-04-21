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

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo do item antes do imposto: ");
        double custo = scanner.nextDouble();

        System.out.print("Digite a taxa de imposto sobre vendas (em porcentagem): ");
        double taxaImposto = scanner.nextDouble();

        scanner.close();

        double custoComImposto = somaImposto(taxaImposto, custo);

        System.out.println("O custo do item após incluir o imposto é: R$" + custoComImposto);
    }

    public static double somaImposto(double taxaImposto, double custo) {
        double imposto = (taxaImposto / 100) * custo;
        double custoComImposto = custo + imposto;
        return custoComImposto;
    }
}
