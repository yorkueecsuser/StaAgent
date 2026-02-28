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
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f, true));
    out.writeObject(o);
    out.close();

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
    }
  }

  @ExpectWarning("IO")
  public static void appendObject2(File f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    out.writeObject(o);
    out.close();

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
    }
  }

  @ExpectWarning("IO")
  public static void appendObject3(String f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f, true));
    out.writeObject(o);
    out.close();

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
    }
  }

  @ExpectWarning("IO")
  public static void appendObject4(String f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    out.writeObject(o);
    out.close();

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}