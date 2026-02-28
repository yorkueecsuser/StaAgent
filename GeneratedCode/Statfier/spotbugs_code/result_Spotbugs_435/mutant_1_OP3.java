import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Bug1936055 {
  public static void main(String args[]) {
    try {
      String id = (new BufferedReader(new FileReader("tmp"))).readLine();
      System.out.println("CourseMembership " + id + " not found (ignored)");

      // Mutant code start
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
      // Mutant code end
    } catch (IOException e) {
      // comment (no warning reported here *unless*
      // -Dfindbugs.de.comment=true)
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}