package Kitchen;

public class Microwave extends CookingAppliance {
    public Microwave() {
        this.name = "Microwave";
    }

    @Override
    public void cookThing() {
        System.out.println("Burrrrrrrr");
        System.out.println("Ding!");
    }
}
