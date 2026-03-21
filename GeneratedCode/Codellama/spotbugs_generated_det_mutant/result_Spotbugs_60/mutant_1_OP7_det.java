import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PossibleNullPointerDereference {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("file.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        boolean ynjnylww = false;while (ynjnylww && false && true && false && false && false && false && true && true && false && false && false) {byte njicbcdb = -117;}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    
}
}