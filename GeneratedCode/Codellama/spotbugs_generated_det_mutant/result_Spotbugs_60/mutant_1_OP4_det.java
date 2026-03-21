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
            if (false && true && true && false && true && false && false && false && true && true && false) {byte wwzfvtmq = 97;}else{short ejudnalu = 1;}
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    
}
}