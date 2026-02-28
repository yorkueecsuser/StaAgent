import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Bug1936055 {
  public static void main(String args[]) {
    try {
      String id = (new BufferedReader(new FileReader("tmp"))).readLine();
      System.out.println("CourseMembership " + id + " not found (ignored)");

      // Inserted unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This is a reachable part of the code.");
      } else {
        System.out.println("This is an unreachable part of the code.");
      }
    } catch (IOException e) {
      // comment (no warning reported here *unless*
      // -Dfindbugs.de.comment=true)
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // This will ensure the 'if' branch is taken, making the 'else' branch unreachable
  }
}