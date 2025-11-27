package m08_POO;

public class BankAccount {
    double balance;
    double dineroinicial;

    public BankAccount(double balance, double dineroinicial) {
        this.balance = balance;
        this.dineroinicial = dineroinicial;
    }

    void deposit() {
        double saldoactual = dineroinicial + balance;
        System.out.println(saldoactual);

    }

}
