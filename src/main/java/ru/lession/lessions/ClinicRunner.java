package ru.lession.lessions;

import java.util.*;

public class ClinicRunner {
    public static void main(String[] args) {
        final  Clinic clinic = new Clinic(5);

        clinic.addClient(0,new Client("Jordan", new Pet("Hussle")));
        clinic.addClient(1,new Client("Boris", new Cat("Barsick")));
        clinic.addClient(2,new Client("Petr", new Dog ("Sparky")));
        clinic.addClient(3,new Client("Bob", new CatDog (new Cat("Tom"), new Dog("Ford"))));


       // System.out.println(c.getId());
        System.out.println(clinic.findClientByPetName("Hussle").getId());
        System.out.println(clinic.findPetByClientId("Boris").getPetName());

        System.out.println(clinic.chengePetName("Hussle","Bro"));
        System.out.println(clinic.chengeId("Bob","Brob"));
        System.out.println(clinic.findClientByPetName("Bro").getId());
        System.out.println(clinic.findClientByPetName("TomFord").getId());
        clinic.showAll();
        System.out.println("\n");

        List<Client> clients = new LinkedList<Client>();
        clients.add(new Client("0",new Pet("First")));
        clients.add(new Client("1",new Pet("two")));
        clients.add(new Client("0",new Pet("First")));

        for (Client client : clients){ //В классе Pet не перекрыты методы toString и equals, поэтому не выводит имя петя

            System.out.println(client);
        }

        System.out.println("\n");

        Set<Client> cli = new HashSet<Client>();
        cli.add(new Client("1",new Pet("First")));
        cli.add(new Client("2",new Pet("two")));
        cli.add(new Client("1",new Pet("First")));

        for (Client client : clients){ //В классе Pet не перекрыты методы toString и equals, поэтому не выводит имя петя

            System.out.println(client);
        }


        Map<String, Client> clie = new HashMap();
        clie.put("1", new Client("0", new Pet("Dog")));
        clie.put("2", new Client("1", new Pet("Cat")));
        clie.put("1", new Client("0", new Pet("Dog")));
        System.out.println("\n");

        for (Map.Entry<String, Client>clien : clie.entrySet()){
            System.out.println(clien);
        }
    }
}
