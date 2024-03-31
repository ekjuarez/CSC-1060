package AnimalShelter;

public class Aussie extends Dog {
    public Aussie(String name, String description, int price) {
        super(name, description, price);
    }

    @Override
    public String getBreed() {
        return "Aussie";
    }
}
