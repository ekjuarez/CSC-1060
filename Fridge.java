
import java.util.ArrayList;
import java.util.List;
public class Fridge {
    double volumeInInches;
    List<Food> foods;

    Fridge(double volumeInInches) {
        this.foods = new ArrayList<>();
        this.volumeInInches = volumeInInches;
    }
    public void addFood(Food food) {
        this.foods.add(food);
    }
    public void removeFoodAtFront(Food food) {
        this.foods.remove(this.foods.size() - 1);
    }

    @Override
    public String toString() {
        return this.foods.toString();
    }
}
