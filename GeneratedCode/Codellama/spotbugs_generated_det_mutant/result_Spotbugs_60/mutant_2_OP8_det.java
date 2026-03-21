import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PossibleNullPointerDereference {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("file.txt"));
            while (scanner.hasNextLine()) {
                String ytfrkauz = scanner.nextLine();
                System.out.println(ytfrkauz);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}