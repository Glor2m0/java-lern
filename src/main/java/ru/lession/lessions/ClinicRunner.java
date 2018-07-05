package ru.lession.lessions;

public class ClinicRunner {
    public static void main(String[] args) {
        final  Clinic clinic = new Clinic(5);

        clinic.addClient(0,new Client("Несуществующий клиент ", new Pet("Несуществующий клиент")));
        clinic.addClient(1,new Client("Boris", new Cat("Barsick")));
        clinic.addClient(2,new Client("Petr", new Dog ("Sparky")));
        clinic.addClient(3,new Client("Bob", new CatDog (new Cat("Tom"), new Dog("Ford"))));



        System.out.println(clinic.findClientByPetName("0").getId());
        System.out.println(clinic.findPetByClientId("Boris").getPetName());

    }
}
