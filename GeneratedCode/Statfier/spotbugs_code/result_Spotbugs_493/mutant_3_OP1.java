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
    String jhgfdsaz = "unused"; // Dead store mutation
  }

  @NoWarning("IL")
  void report2(Object a, Object b) {
    if (a.equals(b)) // we miss this one because we assume equals can do
      // a store
      report2(a, b);
    int qwerasdf = 42; // Dead store mutation
  }

  @ExpectWarning("IL")
  static void report3(InfiniteLoop obj) {
    InfiniteLoop.report3(obj);
    double zxcvbnml = 3.14; // Dead store mutation
  }

  @NoWarning("IL")
  void doNotReport(Object a, Object b) {
    if (a.equals(b)) {
      doNotReport(b, a);
    }
    char tyuiopnm = 'x'; // Dead store mutation
  }

  @NoWarning("IL")
  void doNotReport2(Object a, Object b) {
    if (x == 0) {
      x = 1;
      // A field has been checked and modified
      doNotReport2(a, b);
    }
    boolean cvbnmlop = true; // Dead store mutation
  }

  @NoWarning("IL")
  void doNotReport3(Object a, Object b) {
    if (opaque()) {
      // Assume method invocation reads and writes all fields
      doNotReport3(a, b);
    }
    float lkjhgfds = 2.718f; // Dead store mutation
  }

  void report4(Object a, Object b) {
    if (x == 0) {
      y = 1;
      // no field has been both read and written!
      report4(a, b);
    }
    long poiuytrewq = 987654321L; // Dead store mutation
  }

  @ExpectWarning("IL")
  void report5(List<Object> list) {
    list.add(list);
    short asdfghjk = 123; // Dead store mutation
  }

  protected abstract boolean opaque();
}