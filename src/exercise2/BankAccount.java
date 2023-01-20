package exercise2;

public interface BankAccount {
    String getAccountName();
    int getAccountBalance();
    void depositMoney(int amountForDeposit);
    void withdrawMoney(int amountForWithdraw);
}
