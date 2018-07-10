package GenClinic;

import java.util.Objects;

public class GenClient {
    private final String clientName;
    private final GenPet genPet;

    public GenClient(String clientName, GenPet genPet) {
        this.clientName = clientName;
        this.genPet = genPet;
    }


    public String getClientName() {
        return clientName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenClient genClient = (GenClient) o;
        return Objects.equals(clientName, genClient.clientName) &&
                Objects.equals(genPet, genClient.genPet);
    }

    @Override
    public String toString() {
        return "GenClient{" +
                "clientName='" + clientName + '\'' +
                 genPet;
    }

    @Override
    public int hashCode() {

        return Objects.hash(clientName, genPet);
    }

    public String getPetName(){
        return this.genPet.getPetName();
    }
}
