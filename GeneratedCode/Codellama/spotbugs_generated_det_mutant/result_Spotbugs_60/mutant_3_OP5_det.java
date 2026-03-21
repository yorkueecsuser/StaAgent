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
            int pdfigmej = 0;switch  (pdfigmej) {case 1:short uhaypypl = -6299;break;default:short wmfosadq = -2683;break;}
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    
}
}