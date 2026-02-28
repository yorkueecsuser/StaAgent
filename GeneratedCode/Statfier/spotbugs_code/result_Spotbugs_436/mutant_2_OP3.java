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
      // Inserting an unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        // This block is unreachable
        System.out.println("This is an unreachable block");
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

  // Method to provide a dynamically determined condition that is always false
  private static boolean getUnreachableCondition() {
    return false;
  }
}