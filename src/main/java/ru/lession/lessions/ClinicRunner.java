package ru.lession.lessions;

public class ClinicRunner {
    public static void main(String[] args) {
        final  Clinic clinic = new Clinic(5);
//Client c = new Client("nnn", new Dog("dsd"));
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


    }
}
