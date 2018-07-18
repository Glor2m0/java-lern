package ru.lesson.store;

import ru.lesson.lessons.Client;
import ru.lesson.lessons.Clinic;
import ru.lesson.lessons.Pet;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

public class ClinicCash {
    private static final ClinicCash CLINIC = new ClinicCash();

    private final ConcurrentHashMap<Integer, Client> clients = new ConcurrentHashMap<Integer, Client>();

    public static ClinicCash getClinic() {
        return CLINIC;
    }

    public Collection<Client> values(){ return this.clients.values();}

    public void add(final Client client){
        this.clients.put(client.getId(), client);
    }

    public void edit (final Client client){
        this.clients.replace(client.getId(), client);
    }

    public void delete (final int id){
        this.clients.remove(id);
    }

    public Client get(final int id) {
        return this.clients.get(id);
    }

    public Client findByName (String name){

        for (int i = 0; i < clients.size(); i++) {
            if(name.equals(CLINIC.get(i).getClientName())){ return CLINIC.get(i);
            }
        } return new Client (0,"none", new Pet("none"));
    }

}
