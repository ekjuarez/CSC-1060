package FIleIO;

import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\S02944712\\IdeaProjects\\CSC-1060\\FIleIO\\temp.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            Scanner sc = new Scanner(fileInputStream);
            System.out.println(sc.nextLine());
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.print("Hello there");
        }
    }
}
