import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Nonserializable {

  /**
   * @param args
   */
  @ExpectWarning("DMI")
  public static void main(String[] args) {
    FileOutputStream fos = null;
    try {
      fos = new FileOutputStream("t.tmp");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(new Thread());
      
      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement.");
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  // Method to provide a dynamically determined condition
  private static boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}