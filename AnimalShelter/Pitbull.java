package AnimalShelter;

public class Pitbull extends Dog{
    public Pitbull(String name, String description, int price) {
        super(name, description,price);
    }
    @Override
    public String getBreed() {
        return "Pitbull";
    }
}
