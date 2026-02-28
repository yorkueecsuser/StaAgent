import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Bug1936055 {
  public static void main(String args[]) {
    try {
      String id = (new BufferedReader(new FileReader("tmp"))).readLine();
      System.out.println("CourseMembership " + id + " not found (ignored)");

      // Mutant code: Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This will never be printed");
          break;
        case 1:
          // This case is always executed
          System.out.println("This will always be printed");
          break;
      }
    } catch (IOException e) {
      // comment (no warning reported here *unless*
      // -Dfindbugs.de.comment=true)
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}