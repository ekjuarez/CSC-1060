
// Evan Knudsen

public class LargestPower {
    public static void main(String[] args) {
        System.out.println(powerOf2GreaterThanNIteratively(129));
        System.out.println(powerOf2GreaterThanNRecursively(129));
    }

    public static int powerOf2GreaterThanNIteratively(int challengerInt) {
        int lowestPower = 0;
        for (int power = 0; (Math.pow(2, power)) <= challengerInt; power++) {
            lowestPower++;
        }
        return (int) Math.pow(2, lowestPower);
    }

    public static int powerOf2GreaterThanNRecursively(int challengerInt) {
        int power = powerOf2GreaterThanNRecursivelyInner(challengerInt, 0);
        return (int) Math.pow(2, power);
    }

    public static int powerOf2GreaterThanNRecursivelyInner(int challengerInt, int index) {
        if (challengerInt < Math.pow(2, index)) {
            return index;
        }
        return powerOf2GreaterThanNRecursivelyInner(challengerInt, index + 1);
    }
}
