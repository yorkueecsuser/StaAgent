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
      // Mutant: Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        System.out.println("This is an unreachable block");
      } else {
        // This block will also never execute because shouldRun is always false
        System.out.println("This is another unreachable block");
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

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}