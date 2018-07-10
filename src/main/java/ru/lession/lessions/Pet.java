package ru.lession.lessions;

import java.util.Objects;

public class Pet {
    private String petName;

    public Pet(String petName) {
        this.petName = petName;
    }

    public Pet (){
        this.petName = "WithoutName";
    }


    public String getPetNam() {
        return this.petName;
    }

    public void setPetName(String newPetName){
        this.petName = newPetName;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petName='" + petName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(petName, pet.petName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(petName);
    }
}





class Dog extends Pet{

    public Dog(String petName) {
        super(petName);
    }


}

class Cat extends Pet{

    public Cat (String petName){
        super(petName);
    }


}


class CatDog extends Pet {


    public CatDog(String petName) {
        super(petName);
    }

    public CatDog(Cat cat, Dog dog){
        super.setPetName(cat.getPetNam() + dog.getPetNam());

    }
}
