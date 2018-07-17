package ru.lesson.lessons;

public class CatDog extends Pet {


    public CatDog(String petName) {
        super(petName);
    }

    public CatDog(Cat cat, Dog dog){
        super.setPetName(cat.getPetNam() + dog.getPetNam());

    }
}
