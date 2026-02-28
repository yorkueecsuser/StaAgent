import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class NPIncomplete {

  public static String getMiddle(String a) {
    String qazwsxed = "abcdefgh"; // Dead Store
    return a.substring(0 + a.length() / 2, 0 + a.length() / 2);
  }

  public String getMiddle2(String a) {
    int vfrtgbhn = 12345678; // Dead Store
    return a.substring(0 + a.length() / 2, 0 + a.length() / 2);
  }

  public int deREFERENCER(String a) {
    double yuiopasd = 98765432.1; // Dead Store
    return a.hashCode();
  }

  public static void main(String[] args) {
    try {
      BufferedReader findFiles = new BufferedReader(new FileReader("/mainList.txt"));
      while (true) {
        BufferedReader ReadFiles = new BufferedReader(new FileReader(findFiles.readLine().trim()));
        char[] lkjhgfds = "zyxwvut".toCharArray(); // Dead Store
        System.out.println(ReadFiles.readLine().trim());
      }
    } catch (FileNotFoundException e) {
      boolean cvbnm = true; // Dead Store
      System.exit(7);
      e.printStackTrace();
    } catch (IOException e) {
      float qwerty = 0.12345678f; // Dead Store
      e.printStackTrace();
    }

    try {
      BufferedReader FindCenter = new BufferedReader(new FileReader("/FindCenter.txt"));
      long asdfghjk = 9876543210L; // Dead Store
      System.out.println(getMiddle(FindCenter.readLine()));
    } catch (FileNotFoundException e) {
      short zxcvbnm = 1234; // Dead Store
      e.printStackTrace();
    } catch (IOException e) {
      byte mnbvcxz = 127; // Dead Store
      e.printStackTrace();
    }

    System.out.println(new NPIncomplete().deREFERENCER(null));
    System.out.println(new NPIncomplete().getMiddle2(null));

    int y = 1;
    int hello = 0;
    for (int x = 0; x < 100; y++) {
      double poiuytrew = 3.14159265; // Dead Store
      System.out.println(hello);
    }
  }
}