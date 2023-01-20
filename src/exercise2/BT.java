package exercise2;

public class BT implements BankAccount {

    private static final String ACCOUNT_NAME = "BT Account";
    private int accountBalance = 0;

    @Override
    public String getAccountName() {
        return ACCOUNT_NAME;
    }

    @Override
    public int getAccountBalance() {
        return accountBalance;
    }

    @Override
    public void depositMoney(int amountForDeposit) {
        if (amountForDeposit >= 0) {
            this.accountBalance += amountForDeposit;
            System.out.printf("You deposited %d$ in your %s and the account balance is %d$. Multumim!\n",
                    amountForDeposit, this.getAccountName(), this.getAccountBalance());
        } else {
            System.out.println("In order to do a deposit, the amount most be a positive value. Multumim!");
        }
    }

    @Override
    public void withdrawMoney(int amountForWithdraw) {
        if (amountForWithdraw >= 0 && amountForWithdraw <= this.accountBalance){
            this.accountBalance -= amountForWithdraw;
            System.out.printf("You withdraw %d$ from your %s and the account balance is %d$. Multumim!\n",
                    amountForWithdraw, this.getAccountName(), this.getAccountBalance());
        } else {
            System.out.println("In order to do a withdraw, the amount most be a positive value and lower than your account balance. Multumim!");
        }
    }
}
