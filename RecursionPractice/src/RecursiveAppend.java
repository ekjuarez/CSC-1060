
// Evan Knudsen

import java.util.List;

public class RecursiveAppend {
    public static void main(String[] args) {
        System.out.println(appendNTimesIteratively("poopy", 5));

        System.out.println(appendNTimesRecursively("poopy", 5));
    }

    public static String appendNTimesIteratively(String originalString, int num) {
        String newString = originalString;

        for (int i = 0; i < num; i++) {
            newString = newString.concat(originalString);
        }
        return newString;
    }

    public static String appendNTimesRecursively(String originalString, int num) {
        return appendNTimesRecursivelyInner(originalString, num, 0);
    }

    public static String appendNTimesRecursivelyInner(String string, int num, int index) {
        if (index == num) {
            return string;
        }
        return string.concat(appendNTimesRecursivelyInner(string, num, index + 1));
    }
}
