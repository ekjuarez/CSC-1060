package AnimalShelter;

public abstract class Dog implements AdoptableAnimal {

    private final String name;
    private final String description;
    private final double price;

    public Dog(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String getDescription() {
        return this.description;
    }
    @Override
    public double getPrice() {
        return this.price;
    }
    public abstract String getBreed();
}
