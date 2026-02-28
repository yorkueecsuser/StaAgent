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
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This will never be printed");
        break;
    }
    
    out.close();
  }

  @ExpectWarning("IO")
  public static void appendObject2(File f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    out.writeObject(o);
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This will never be printed");
        break;
    }
    
    out.close();
  }

  @ExpectWarning("IO")
  public static void appendObject3(String f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f, true));
    out.writeObject(o);
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This will never be printed");
        break;
    }
    
    out.close();
  }

  @ExpectWarning("IO")
  public static void appendObject4(String f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    out.writeObject(o);
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This will never be printed");
        break;
    }
    
    out.close();
  }

  private static boolean getCondition() {
    return false;
  }
}