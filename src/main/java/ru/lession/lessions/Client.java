package ru.lession.lessions;

public class Client {
    private  String id;
    private final Pet pet;

    public Client(String id, Pet pet){
        this.id = id;
        this.pet = pet;
    }


    public String getPetName() {
        return this.pet.getPetNam();
    }

    public String getId() {
        return this.id;
    }

    public void setPet(String newPetName){
        this.pet.setPetName(newPetName);
    }

    public void setId(String newId){
        this.id = newId;
    }
}
