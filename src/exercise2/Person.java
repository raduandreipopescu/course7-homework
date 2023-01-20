package exercise2;

public class Person {
    private String personName;
    private BankAccount bankAccount;

    public Person(String personName, BankAccount bankAccount) {
        this.personName = personName;
        this.bankAccount = bankAccount;
    }

    public String getPersonName() {
        return personName;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
