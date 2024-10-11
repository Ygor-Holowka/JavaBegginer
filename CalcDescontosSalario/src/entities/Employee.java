package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
         return grossSalary - (grossSalary*tax)/100;
    }

    public void setGrossSalary(double incremento){
        this.grossSalary += (this.grossSalary*incremento)/100;
    }

    public String toString(){
        return name
                + " - Salário bruto: R$"
                + String.format("%.2f", grossSalary)
                + " - Salário líquido: R$"
                + String.format("%.2f%n", netSalary());
    }
}
