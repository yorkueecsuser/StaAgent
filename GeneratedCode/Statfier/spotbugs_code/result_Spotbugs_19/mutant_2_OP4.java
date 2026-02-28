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
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable");
    }
    
    out.close();
  }

  @ExpectWarning("IO")
  public static void appendObject2(File f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    out.writeObject(o);
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable");
    }
    
    out.close();
  }

  @ExpectWarning("IO")
  public static void appendObject3(String f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f, true));
    out.writeObject(o);
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable");
    }
    
    out.close();
  }

  @ExpectWarning("IO")
  public static void appendObject4(String f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    out.writeObject(o);
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable");
    }
    
    out.close();
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // This can be changed to false or any other logic to determine the condition at runtime
  }
}