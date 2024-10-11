package app;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee func = new Employee();
        System.out.println("Entre com nome, salário e porcentagem de deduções !!");
        System.out.print("Nome: ");
        func.name = sc.nextLine();
        System.out.print("Salário Bruto: ");
        func.grossSalary = sc.nextDouble();
        System.out.print("Percentual de deduções: ");
        func.tax = sc.nextDouble();
        System.out.print(func);
        System.out.println("Deseja aumentar o salário do funcionário: (s ou n)");
        char op = sc.next().charAt(0);
        if (op == 's' || op == 'S') {
            System.out.print("Qual percentual de aumento: ");
            double incremento = sc.nextDouble();
            func.setGrossSalary(incremento);
            System.out.println(func.grossSalary);
        }
        else {
            System.out.println("Não foi adicionado nenhum aumento !!!!!");
        }

        System.out.print(func);


        sc.close();
    }
}
