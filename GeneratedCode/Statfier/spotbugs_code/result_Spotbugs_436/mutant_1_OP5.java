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
      return s.next();
    } catch (IOException e) {
      return null;
    } finally {
      if (s!= null) {
        s.close();
        
        // Inserting unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
          case true:
            System.out.println("This is an unreachable case.");
            break;
          default:
            System.out.println("This is also unreachable.");
            break;
        }
      }
    }
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}