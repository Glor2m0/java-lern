package ru.lession.lessions;

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
