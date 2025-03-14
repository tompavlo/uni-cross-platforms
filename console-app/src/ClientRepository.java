import java.util.*;

public class ClientRepository {
    ArrayList<Client> clientList = new ArrayList<>();
    Client curClient = null;

    public ClientRepository(){};

    public void createClient(){
        System.out.println("Enter name and surname of client");
        Scanner scanner = new Scanner(System.in);
        String clientName = scanner.nextLine();
        System.out.println("Input initial amount of client's money");
        double money = scanner.nextDouble();
        Client client = new Client(clientName, money);
        addClient(client);
    }

    public void addClient(Client client){
        clientList.add(client);
    }

    public void printAllClients(){
        int i = 1;
        for(Client client : clientList){
            System.out.println("№"+i);
            System.out.println("Name: " + client.nameOfClient);
            System.out.println("Amount of money: " + client.amountOfMoney);
            ++i;
        }
    }

    public boolean findById(int id){
        if(id-1>=clientList.size()){
            return false;
        }
        else {
            curClient = clientList.get(id - 1);
            System.out.println("Your current clients is "+ curClient.nameOfClient);
            return true;
        }
    }

    public boolean findByName(String name){
        for (Client client : clientList) {
            if (client.nameOfClient.equals(name)) {
                System.out.println("Your client was successfully found!");
                curClient = client;
                return true;
            }
        }
        return false;
    }

    public void chooserOfSorting(int option){
        switch (option){
            case 1:
                clientList.sort(Comparator.comparing(client -> client.nameOfClient));
                break;
            case 2:
                clientList.sort(Comparator.comparing(Client::getNameOfClient).reversed());
                break;
            case 3:
                clientList.sort(Comparator.comparing(client -> client.amountOfMoney));
                break;
            case 4:
                break;
            case 5:
                clientList.sort(Comparator.comparing(client -> client.transactions.size()));
                break;
            case 6:
        }
    }

}

