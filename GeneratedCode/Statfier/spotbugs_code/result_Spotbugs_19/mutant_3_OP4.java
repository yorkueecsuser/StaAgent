import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class AppendingToAnObjectOutputStream {

  @ExpectWarning("IO")
  public static void appendObject1(File f, Object o) throws FileNotFoundException, IOException {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if the condition is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in appendObject1");
    }
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f, true));
    out.writeObject(o);
    out.close();
  }

  @ExpectWarning("IO")
  public static void appendObject2(File f, Object o) throws FileNotFoundException, IOException {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if the condition is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in appendObject2");
    }
    ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    out.writeObject(o);
    out.close();
  }

  @ExpectWarning("IO")
  public static void appendObject3(String f, Object o) throws FileNotFoundException, IOException {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if the condition is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in appendObject3");
    }
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f, true));
    out.writeObject(o);
    out.close();
  }

  @ExpectWarning("IO")
  public static void appendObject4(String f, Object o) throws FileNotFoundException, IOException {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if the condition is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in appendObject4");
    }
    ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    out.writeObject(o);
    out.close();
  }

  private static boolean getCondition() {
    return true; // This ensures the else block is unreachable
  }
}