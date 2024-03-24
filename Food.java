
public class Food {
    String name;
    double sizeVolume;

    Food(String name, double sizeVolume) {
        this.name = name;
        this.sizeVolume = sizeVolume;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
