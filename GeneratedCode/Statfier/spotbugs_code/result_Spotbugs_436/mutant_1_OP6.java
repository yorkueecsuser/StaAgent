import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Bug2118411 {

  public static String foo(File file) {

    Scanner s = null;
    try {
      s = new Scanner(new BufferedReader(new FileReader(file)));
      // Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() will always return false
      }
      return s.next();
    } catch (IOException e) {
      return null;
    } finally {
      if (s!= null) {
        s.close();
      }
    }
  }

  private static boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}