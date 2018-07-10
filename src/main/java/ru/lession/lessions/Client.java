package ru.lession.lessions;

import java.util.Objects;

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


    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(pet, client.pet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, pet);
    }
}
