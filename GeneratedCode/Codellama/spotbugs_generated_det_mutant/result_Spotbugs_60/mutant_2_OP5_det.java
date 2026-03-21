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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        int vnqyaezv = 0;switch  (vnqyaezv) {case 1:short qpkghsmi = -1828;break;default:float tbybvlkb = 710911725;break;}
        }
    
}
}