package GenClinic;

import java.util.LinkedList;
import java.util.List;

public class GenClinicRunner {
    public static void main(String[] args) {


   final GenClinic gclinic = new GenClinic(5);
        List<GenClient> clientslist = new  LinkedList<GenClient>();


   for (int i=0; i<gclinic.size; i++){

       //gclinic.addClient(i,new GenClient(i + " Client", new GenPet(i + " Pet")));
       clientslist.add(new GenClient("firstClient", new GenPet("firstPet")));

   }


       System.out.println(clientslist.get(1));





     //gclinic.showClients();

    }
}
