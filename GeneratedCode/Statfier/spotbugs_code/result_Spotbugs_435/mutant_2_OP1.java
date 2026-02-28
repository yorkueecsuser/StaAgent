import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Bug1936055 {
  public static void main(String args[]) {
    try {
      String id = (new BufferedReader(new FileReader("tmp"))).readLine();
      System.out.println("CourseMembership " + id + " not found (ignored)");
      // Dead Store Mutation
      String qvbnrhty = "unusedVariable";
    } catch (IOException e) {
      // comment (no warning reported here *unless*
      // -Dfindbugs.de.comment=true)
    }
  }
}