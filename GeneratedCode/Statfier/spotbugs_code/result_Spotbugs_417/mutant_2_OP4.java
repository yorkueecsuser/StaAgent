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

    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed because condition is always false.");
    } else {
      System.out.println("This will also never be printed because condition is always false.");
    }

    try {
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(new Thread());
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  // Method to return a constant false value
  private static boolean getCondition() {
    return false;
  }
}