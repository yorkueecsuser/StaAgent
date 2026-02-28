import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Bug1844671 {
  @NoWarning("OS_OPEN_STREAM")
  public void falsePositive1() {
    FileWriter fw = null;
    try {
      fw = new FileWriter(new File(""));
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      try {
        if (fw!= null) { // no false positive
          fw.close();
        }
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is an unreachable statement in falsePositive1");
        }
      } catch (IOException ioe) {
      }
    }
  }

  @NoWarning("OS_OPEN_STREAM")
  public void falsePositive2() {
    FileWriter fw = null;
    try {
      fw = new FileWriter(new File(""));
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      try {
        if (null!= fw) { // false positive
          fw.close();
        }
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is an unreachable statement in falsePositive2");
        }
      } catch (IOException ioe) {
      }
    }
  }

  public void complicated() {
    FileWriter tmp = null;
    FileWriter fw = null;
    try {
      tmp = new FileWriter(new File(""));
      fw = new FileWriter(new File(""));
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      try {
        if (tmp!= fw) {
          if (fw!= null) fw.close();
          tmp.close();
        }
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is an unreachable statement in complicated");
        }
      } catch (IOException ioe) {
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}