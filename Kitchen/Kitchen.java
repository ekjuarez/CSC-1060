package Kitchen;

import java.util.List;

public class Kitchen {
    List<CookingAppliance> appliances;

    public Kitchen(List<CookingAppliance> appliances) {
        this.appliances = appliances;
    }
    public void cookEverything() {
        for (int i = 0; i < this.appliances.size(); i += 1) {
            this.appliances.get(i).cookThing();
        }
    }
}
