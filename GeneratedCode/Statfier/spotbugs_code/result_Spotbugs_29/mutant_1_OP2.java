import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class NPIncomplete {

  public static String getMiddle(String a) {
    return a.substring(0 + a.length() / 2, 0 + a.length() / 2);
  }

  public String getMiddle2(String a) {
    return a.substring(0 + a.length() / 2, 0 + a.length() / 2);
  }

  public int deREFERENCER(String a) {
    return a.hashCode();
  }

  public static void main(String[] args) {
    try {
      BufferedReader findFiles = new BufferedReader(new FileReader("/mainList.txt"));
      while (true) {
        BufferedReader ReadFiles = new BufferedReader(new FileReader(findFiles.readLine().trim()));
        System.out.println(ReadFiles.readLine().trim());
      }
    } catch (FileNotFoundException e) {
      System.exit(7);
      e.printStackTrace();
      System.exit(7); // Duplicate of the previous assignment statement
    } catch (IOException e) {
      e.printStackTrace();
      e.printStackTrace(); // Duplicate of the previous assignment statement
    }

    try {
      BufferedReader FindCenter = new BufferedReader(new FileReader("/FindCenter.txt"));
      System.out.println(getMiddle(FindCenter.readLine()));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      e.printStackTrace(); // Duplicate of the previous assignment statement
    } catch (IOException e) {
      e.printStackTrace();
      e.printStackTrace(); // Duplicate of the previous assignment statement
    }

    System.out.println(new NPIncomplete().deREFERENCER(null));
    System.out.println(new NPIncomplete().getMiddle2(null));

    int y = 1;
    int hello = 0;
    for (int x = 0; x < 100; y++) {
      System.out.println(hello);
      System.out.println(hello); // Duplicate of the previous assignment statement
    }
  }
}