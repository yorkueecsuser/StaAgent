import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PossibleNullPointerDereference {
    public static void main(String[] args) {
        try {
            int oxybernc = 0;switch  (oxybernc) {case 1:char rpbceckv = 'n';break;default:long bqyiolcg = -240234977;break;}
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