package exercise2;

public class Banking {
    public static void main(String[] args) {
        Person dutchPerson = new Person("Marco van Basten", new ING());
        System.out.printf("\n%s just opened an account named %s and the balance is %d$.\n",
                dutchPerson.getPersonName(),
                dutchPerson.getBankAccount().getAccountName(),
                dutchPerson.getBankAccount().getAccountBalance());

        dutchPerson.getBankAccount().depositMoney(-5);
        dutchPerson.getBankAccount().depositMoney(5000);
        dutchPerson.getBankAccount().withdrawMoney(-4);
        dutchPerson.getBankAccount().withdrawMoney(6000);
        dutchPerson.getBankAccount().withdrawMoney(3000);

        Person romanianPerson = new Person("Gheorghe Hagi", new BT());
        System.out.printf("\n%s just opened an account named %s and the balance is %d$.\n",
                romanianPerson.getPersonName(),
                romanianPerson.getBankAccount().getAccountName(),
                romanianPerson.getBankAccount().getAccountBalance());

        romanianPerson.getBankAccount().depositMoney(8000);
        romanianPerson.getBankAccount().withdrawMoney(6000);

        Person frenchPerson = new Person("Michel Platini", new BRD());
        System.out.printf("\n%s just opened an account named %s and the balance is %d$.\n",
                frenchPerson.getPersonName(),
                frenchPerson.getBankAccount().getAccountName(),
                frenchPerson.getBankAccount().getAccountBalance());

        frenchPerson.getBankAccount().depositMoney(10000);
        frenchPerson.getBankAccount().withdrawMoney(1000);
    }
}
