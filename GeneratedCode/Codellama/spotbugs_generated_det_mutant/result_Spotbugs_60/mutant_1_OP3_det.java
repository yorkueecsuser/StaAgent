import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PossibleNullPointerDereference {
    public static void main(String[] args) {
        if (true && false && false && true && true && true && true && false && true && true && false) {float zqvnekju = 227143175;}
        try {
            Scanner scanner = new Scanner(new File("file.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    
}
}