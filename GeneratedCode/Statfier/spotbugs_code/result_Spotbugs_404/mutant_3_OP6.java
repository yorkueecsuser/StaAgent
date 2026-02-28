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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
          // This loop is unreachable because conditionFor will always be false
        }
        if (fw!= null) { // no false positive
          fw.close();
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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
          // This loop is unreachable because conditionFor will always be false
        }
        if (null!= fw) { // false positive
          fw.close();
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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
          // This loop is unreachable because conditionFor will always be false
        }
        if (tmp!= fw) {
          if (fw!= null) fw.close();
          tmp.close();
        }
      } catch (IOException ioe) {
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is always false
  }
}