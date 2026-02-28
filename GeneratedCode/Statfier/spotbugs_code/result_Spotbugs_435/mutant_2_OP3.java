import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Bug1936055 {
  public static void main(String args[]) {
    try {
      String id = (new BufferedReader(new FileReader("tmp"))).readLine();
      System.out.println("CourseMembership " + id + " not found (ignored)");
      
      // Introduced an unreachable if statement as per mutation operator
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement");
      }
    } catch (IOException e) {
      // comment (no warning reported here *unless*
      // -Dfindbugs.de.comment=true)
    }
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}