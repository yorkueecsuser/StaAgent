import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.List;

public abstract class InfiniteLoop {

  int x;

  @ExpectWarning("UrF")
  int y;

  @ExpectWarning("IL")
  void report() {
    report();
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable");
    }
  }

  @NoWarning("IL")
  void report2(Object a, Object b) {
    if (a.equals(b)) // we miss this one because we assume equals can do
      // a store
      report2(a, b);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable");
    }
  }

  @ExpectWarning("IL")
  static void report3(InfiniteLoop obj) {
    InfiniteLoop.report3(obj);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable");
    }
  }

  @NoWarning("IL")
  void doNotReport(Object a, Object b) {
    if (a.equals(b)) {
      doNotReport(b, a);
    }
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable");
    }
  }

  @NoWarning("IL")
  void doNotReport2(Object a, Object b) {
    if (x == 0) {
      x = 1;
      // A field has been checked and modified
      doNotReport2(a, b);
    }
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable");
    }
  }

  @NoWarning("IL")
  void doNotReport3(Object a, Object b) {
    if (opaque()) {
      // Assume method invocation reads and writes all fields
      doNotReport3(a, b);
    }
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable");
    }
  }

  void report4(Object a, Object b) {
    if (x == 0) {
      y = 1;
      // no field has been both read and written!
      report4(a, b);
    }
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable");
    }
  }

  @ExpectWarning("IL")
  void report5(List<Object> list) {
    list.add(list);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable");
    }
  }

  protected abstract boolean opaque();

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be further customized to return a dynamic condition
  }
}