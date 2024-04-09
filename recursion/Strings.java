package recursion;

public class Strings {
    public static int countHiIteratively(String userString) {
        int numOfHi = 0;
        int startingIndex = 0;

        while (startingIndex < userString.length()) {
            String substring = userString.substring(startingIndex);
            int hiLocation = substring.indexOf("Hi");
            if (hiLocation > -1) {
                numOfHi += 1;
                startingIndex = startingIndex + hiLocation + 1;
            } else {
                break;
            }
        }
        return numOfHi;
    }
    public static int countHiRecursively(String userString) {
        return countHiRecursivelyInner(userString,0);
    }
    public static int countHiRecursivelyInner(String userString, int startingIndex) {
        if (startingIndex > userString.length()) {
            return 0;
        }
        String substring = userString.substring(startingIndex);
        int hiLocation = substring.indexOf("Hi");
        if (hiLocation > -1) {
            return countHiRecursivelyInner(userString, startingIndex + hiLocation + 1) + 1;
        }
    }
    public static void main(String[] args){

    }
}
