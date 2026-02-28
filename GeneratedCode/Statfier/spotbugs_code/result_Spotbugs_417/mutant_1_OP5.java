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

      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          System.out.println("This will never be printed");
          break;
        case 1:
          // This is the default reachable case
          break;
      }

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}