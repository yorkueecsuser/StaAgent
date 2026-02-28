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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
    }
  }

  @NoWarning("IL")
  void report2(Object a, Object b) {
    if (a.equals(b)) // we miss this one because we assume equals can do
      // a store
      report2(a, b);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
    }
  }

  @ExpectWarning("IL")
  static void report3(InfiniteLoop obj) {
    InfiniteLoop.report3(obj);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
    }
  }

  @NoWarning("IL")
  void doNotReport(Object a, Object b) {
    if (a.equals(b)) {
      doNotReport(b, a);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
    }
  }

  @NoWarning("IL")
  void doNotReport2(Object a, Object b) {
    if (x == 0) {
      x = 1;
      // A field has been checked and modified
      doNotReport2(a, b);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
    }
  }

  @NoWarning("IL")
  void doNotReport3(Object a, Object b) {
    if (opaque()) {
      // Assume method invocation reads and writes all fields
      doNotReport3(a, b);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
    }
  }

  void report4(Object a, Object b) {
    if (x == 0) {
      y = 1;
      // no field has been both read and written!
      report4(a, b);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
    }
  }

  @ExpectWarning("IL")
  void report5(List<Object> list) {
    list.add(list);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
    }
  }

  protected abstract boolean opaque();

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}