
public class Bottle {
    private boolean resealable = true;

    public void setResealable(boolean resealable) {
        this.resealable = resealable;
    }
    public boolean getResealable() {
        return this.resealable;
    }

    double heightInMm;
    double circumferenceOfBase;

    public Bottle(double circumferenceOfBase, double heightInMm) {
        this.circumferenceOfBase = circumferenceOfBase;
        this.heightInMm = heightInMm;
    }
}
