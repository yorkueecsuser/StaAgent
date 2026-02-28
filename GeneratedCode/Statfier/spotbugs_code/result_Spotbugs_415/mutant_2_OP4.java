import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class IO_APPENDING_TO_OBJECT_OUTPUT_STREAM {

  @ExpectWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void bug1(File anyFile) throws Exception {
    OutputStream out = new FileOutputStream(anyFile, true);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
    new ObjectOutputStream(out);
  }

  @ExpectWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void bug1(String anyFile) throws Exception {
    OutputStream out = new FileOutputStream(anyFile, true);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
    new ObjectOutputStream(out);
  }

  @ExpectWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void bug2(File anyFile) throws Exception {
    OutputStream out = new FileOutputStream(anyFile, true);
    out = new BufferedOutputStream(out);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
    new ObjectOutputStream(out);
  }

  @ExpectWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void bug2(String anyFile) throws Exception {
    OutputStream out = new FileOutputStream(anyFile, true);
    out = new BufferedOutputStream(out);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
    new ObjectOutputStream(out);
  }

  @NoWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void notBug1(File anyFile) throws Exception {
    OutputStream out = new FileOutputStream(anyFile, false);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
    new ObjectOutputStream(out);
  }

  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically
  }
}