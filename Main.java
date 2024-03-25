import java.util.ArrayList;
import java.util.List;
import Kitchen.CookingAppliance;
import Kitchen.Microwave;
import Kitchen.Fridge;
import Kitchen.Kitchen;



public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.storeFood("orange");
        fridge.storeFood("milk");

        fridge.viewFridge();

        Microwave microwave = new Microwave();
        microwave.cookThing();

        List<CookingAppliance> appliances = new ArrayList<>();
        Kitchen kitchen = new Kitchen(appliances);

        kitchen.cookEverything();
    }
}
