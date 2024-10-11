package app;

import java.util.Locale;
import java.util.Scanner;
import utilities.Operator;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char opcao;
        Operator conta = null;

        boolean sair = false;
        System.out.println("Simulação de conta bancária !!!");
        System.out.print("Insira o número da sua conta de 4 dígitos: ");
        int acountNumber = sc.nextInt();
        System.out.print("Insira seu nome completo: ");
        String nomeCompleto = sc.next();
        sc.nextLine();

        while (!sair) {
            System.out.print("Deseja fazer um depósito inicial ? (s/n): ");
            opcao = sc.next().charAt(0);
            if (opcao == 's' || opcao == 'S') {
                System.out.print("Insira o valor que deseja depositar: ");
                String depositoInicialString = sc.next();
                double depositoInicial = converterStringParaDouble(depositoInicialString);

                if (depositoInicial != -1) {
                    System.out.println("Valor convertido: " + depositoInicial);
                    conta = new Operator(acountNumber, nomeCompleto, depositoInicial);
                } else {
                    System.out.println("O que foi digitado não é um número, sua conta vai iniciar com Zero reais !!");
                    conta = new Operator(acountNumber, nomeCompleto);
                }

                System.out.println();
                System.out.print(conta);
                System.out.println();
                System.out.println();
                sair = true;
            } else if (opcao == 'n' || opcao == 'N') {
                conta = new Operator(acountNumber, nomeCompleto);
                System.out.println();
                System.out.print(conta);
                System.out.println();
                System.out.println();
                sair = true;
            } else {
                sc.nextLine();
                System.out.println("Opção inválida, digite novamente !!!");
                System.out.print("Deseja fazer um depósito inicial ? (s/n): ");
                opcao = sc.next().charAt(0);
            }
        }
        sc.nextLine();

        sair = false;

        do {
            System.out.println("Digite a opção: (1) Saque --- (2) Deposito --- (q) Sair");
            opcao = sc.next().charAt(0);

            if (opcao == '1') {
                System.out.print("Qual valor do saque: ");
                double valorsaque = sc.nextDouble();
                conta.saque(valorsaque);
            } else if (opcao == '2') {
                System.out.print("Qual o valor do depósito: ");
                double valordeposito = sc.nextDouble();
                conta.deposit(valordeposito);
            } else if (opcao == 'q') {
                sair = true;
            }
        } while (!sair);


        sc.close();
    }
    public static double converterStringParaDouble(String valor) {
        try {
            return Double.parseDouble(valor);
        } catch (NumberFormatException e1) {
            try {
                String valorCorrigido = valor.replace(',', '.');
                return Double.parseDouble(valorCorrigido);
            } catch (NumberFormatException e2) {
                System.out.println("Erro: formato inválido.");
                return -1;
            }
        }
    }
}

