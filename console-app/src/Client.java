import java.util.ArrayList;

public class Client {
    ArrayList<Transaction> transactions = new ArrayList<>();
    String nameOfClient;
    double amountOfMoney;

    public String getNameOfClient() {
        return nameOfClient;
    }

    public Client(String name, double money){
        nameOfClient = name;
        amountOfMoney = money;
    }

    public void withdraw(double amount){
        transactions.add(new Transaction(TransactionType.WITHDRAW, amount));
        amountOfMoney -= amount;
    }

    public void replenishment(double amount){
        transactions.add(new Transaction(TransactionType.REPLENISHMENT, amount));
        amountOfMoney += amount;
    }

}
