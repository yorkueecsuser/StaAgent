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

      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          System.out.println("This is unreachable code.");
          break;
        case 1:
          // This is the reachable case
          break;
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // This will ensure the switch evaluates to the reachable case
  }
}