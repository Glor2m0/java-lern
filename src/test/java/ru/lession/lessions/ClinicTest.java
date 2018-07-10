package ru.lession.lessions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClinicTest {

    @Test
    public void addClient() {

    }

    @Test
    public void findClientByPetName() {
        Clinic clinic = new Clinic(5);
        clinic.addClient(0,new Client("Jordan",new Pet("Klaus")));

        assertEquals("Klaus",clinic.findClientByPetName("Klaus").getPetName());
    }

    @Test
    public void findPetByClientId() {

    }

    @Test
    public void chengePetName() {
    }

    @Test
    public void chengeId() {
    }

    @Test
    public void showAll() {
    }
}