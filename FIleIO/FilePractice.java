package FIleIO;

import java.io.*;
import java.util.Scanner;

public class FilePractice {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Name: ");
        String name = in.nextLine();
        System.out.println("Age: ");
        int age = in.nextInt();

        File origfile = new File("C:\\Users\\S02944712\\IdeaProjects\\CSC-1060\\FIleIO\\Nameage.txt");
        File duplifile = new File("C:\\Users\\S02944712\\IdeaProjects\\CSC-1060\\FIleIO\\Duplicate.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(origfile)) {
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(name);
            printStream.println(age);
        }
        try (FileInputStream fileInputStream = new FileInputStream(origfile)) {
            Scanner fileScan = new Scanner(fileInputStream);
            try (FileOutputStream fileOutputStream = new FileOutputStream(duplifile)) {
                PrintStream printStream = new PrintStream(fileOutputStream);
                printStream.println(fileScan.nextLine());
                printStream.println(fileScan.nextLine());
            }
        }
    }
}
