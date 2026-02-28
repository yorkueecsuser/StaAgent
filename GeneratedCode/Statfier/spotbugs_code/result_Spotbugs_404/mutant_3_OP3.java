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
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is an unreachable statement");
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
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is an unreachable statement");
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
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is an unreachable statement");
        }
      } catch (IOException ioe) {
      }
    }
  }

  // Helper method to simulate a dynamic condition
  private boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}