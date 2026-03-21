import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PossibleNullPointerDereference {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("file.txt"));
            do {
                String line = scanner.nextLine();
                System.out.println(line);
            } while (scanner.hasNextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}