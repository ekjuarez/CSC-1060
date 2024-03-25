package Kitchen;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fridge extends CookingAppliance {

    ArrayList<String> foodInFridge = new ArrayList<>();
    public Fridge() {
        this.name = "Fridge";
    }
    @Override
    public void cookThing() {
        System.out.println("Fridges can't cook, idiot");
    }
    public void storeFood(String food) {
        foodInFridge.add(food);
        System.out.println("Plink, food stored!");
    }
    public void viewFridge() {
        System.out.println(foodInFridge);
    }
}
