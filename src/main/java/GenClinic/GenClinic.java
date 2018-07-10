package GenClinic;

public class GenClinic{

        private GenClient[] clients;
final int size;
    public GenClinic(final int size) {
        this.size = size;
        this.clients = new GenClient[size];
    }


    public void addClient (final int position, GenClient client){
        this.clients[position] = client;
    }

    public void showClients (){
        for(int i= 0; i< clients.length;i++){
            System.out.println(this.clients[i].getClientName() + " " + this.clients[i].getPetName());
        }
    }







}
