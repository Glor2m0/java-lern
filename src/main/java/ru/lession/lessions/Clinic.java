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
           } return  new Client("Клиент не найден", new Pet ("Пет не найден"));
    }


    public Client  findPetByClientId (final String id){
        for ( int i=0; i < clients.length - 1; i++){
            if (id.equals(clients[i].getId())){
                return clients[i];
            }
        } return  new Client("Клиент не найден", new Pet ("Пет не найден"));

    }


public String chengePetName (String oldPetName, String newPetName){
       if (findClientByPetName(oldPetName).getPetName().equals(oldPetName)){
           findClientByPetName(oldPetName).setPet(newPetName);
           return ("New pet name is " + findClientByPetName(newPetName).getPetName());
       }
return "Пет не найден";
}


    public String chengeId (String oldId, String newId){
        if (findPetByClientId(oldId).getId().equals(oldId)){
            findPetByClientId(oldId).setId(newId);
            return ("New id is " + findPetByClientId(newId).getId());
        }
        return "Id не найден";
    }


    public void showAll(){
        for (int i=0; i< clients.length - 1; i++){
            System.out.println(clients[i].getId() + ". her pet - "+ clients[i].getPetName());
        }
    }



}
