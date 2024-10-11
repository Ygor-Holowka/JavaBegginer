package utilities;

public class Operator {

    private int acountNumber;
    private String clientName;
    private double balance;

    public Operator(int acountNumber, String clientName) {
        this.acountNumber = acountNumber;
        this.clientName = clientName;
    }
    public Operator(int acountNumber, String clientName, double initialBalance) {
        this.acountNumber = acountNumber;
        this.clientName = clientName;
        deposit(initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depósito realizado com sucesso!");
    }
    public String getBalance() {
        return String.format("%.2f", this.balance);
    }
    public int getAcountNumber() {
        return acountNumber;
    }
    public String getClientName() {
        return this.clientName;
    }
    public void saque(double valorSaque) {
        if (valorSaque > this.balance) {
            System.out.println("SALDO INSUFICIENTE !!");
        } else {
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public String toString() {
        return "Número da conta: "
                + getAcountNumber()
                + " -- Cliente: "
                + getClientName()
                + " -- Balance: "
                + getBalance();
    }
}
