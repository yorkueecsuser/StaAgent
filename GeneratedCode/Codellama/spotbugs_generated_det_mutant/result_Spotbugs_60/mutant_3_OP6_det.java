import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PossibleNullPointerDereference {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("file.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for  (int jnhdxdhz = 0; jnhdxdhz < 0; jnhdxdhz++) {char hwlphsla = 'x';}
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    
}
}