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
      } catch (IOException ioe) {
      }
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // unreachable while loop
      // This loop is unreachable because getCondition() will never return true
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
      } catch (IOException ioe) {
      }
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // unreachable while loop
      // This loop is unreachable because getCondition() will never return true
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
      } catch (IOException ioe) {
      }
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // unreachable while loop
      // This loop is unreachable because getCondition() will never return true
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the loops are unreachable
  }
}