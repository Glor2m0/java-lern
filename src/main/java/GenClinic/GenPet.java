package GenClinic;

public class GenPet {
    private final String petName;

    public GenPet(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    @Override
    public String toString() {
        return
                "petName='" + petName + '\'' +
                '}';
    }

    public void setPetName(String petName){
        petName = petName;
    }
}
