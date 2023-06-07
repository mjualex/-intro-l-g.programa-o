/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcaoprocedimento;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Funcaoprocedimento {

public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int opcao;
        double lcubo, v, altura, largura, comprimento;

        do {
            menu();
            System.out.print("\nEscolha uma opção: ");
            opcao = dado.nextInt();

            switch (opcao) {
                case 1:
               
                    System.out.print("\nDigite o lado do cubo: ");
                    lcubo = dado.nextDouble();
                    v = volumeCubo(lcubo);
                    System.out.println("O volume do cubo de lado é: " + v + "\n");
                    break;
                case 2:
                    
                    System.out.print("\nDigite as medidas do paralelepípedo (altura, largura e comprimento):");
                    System.out.print("\nAltura: ");
                    altura = dado.nextDouble();
                    System.out.print("Largura: ");
                    largura = dado.nextDouble();
                    System.out.print("Comprimento: ");
                    comprimento = dado.nextDouble();
                    v = volumeParalelepipedo(altura, largura, comprimento);
                    System.out.println("O volume do paralelepípedo é: " + v + "\n");
                    break;
                case 0:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n\n");
                    break;
            }
        } while (opcao != 0);

        dado.close();
    }

    // Funções
    public static double volumeCubo(double lado) {
        return lado * lado * lado;
    }

    public static double volumeParalelepipedo(double altura, double largura, double comprimento) {
        return altura * largura * comprimento;
    }

    public static void menu() {
        System.out.println("(1) Calcular o volume do Cubo.");
        System.out.println("(2) Calcular o volume do Paralelepípedo.");
        System.out.println("(0) Sair.");




    }
}
