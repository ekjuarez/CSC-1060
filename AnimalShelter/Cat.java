package AnimalShelter;

public class Cat implements AdoptableAnimal{

    private final String name;
    private final String description;
    private final int price;

    public Cat(String name, String description, int price) {
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
    public int getPrice() {
        return this.price;
    }
}
