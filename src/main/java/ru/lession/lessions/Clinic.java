package ru.lession.lessions;
/*
* Класс описывает клиентов клиники
*/
public class Clinic {

    /*
    * Список клиентов
    */
    private final Client[] clients;

    public Clinic (final int size){
        this.clients = new Client[size];
    }

    /*
    Добавить клиента.
    @param position Позиция
    @param client Клиент
    */
    public void addClient(final int position, final Client client){
        this.clients[position] = client;
    }

    public Client findClientByPetName(final String petName){
           for ( int i=0; i < clients.length - 1; i++){
               if (petName.equals(clients[i].getPetName())){
                   return clients[i];
               }
           } return  clients[0];
    }


    public Client  findPetByClientId (String clientName){
        for ( int i=0; i < clients.length - 1; i++){
            if (clientName.equals(clients[i].getId())){
                return clients[i];
            }
        } return  clients[0];

    }



}
