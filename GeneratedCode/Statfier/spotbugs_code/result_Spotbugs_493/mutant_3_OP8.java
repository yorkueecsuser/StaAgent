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
  }

  @NoWarning("IL")
  void report2(Object a, Object b) {
    if (a.equals(b)) // we miss this one because we assume equals can do
      // a store
      report2(a, b);
  }

  @ExpectWarning("IL")
  static void report3(InfiniteLoop obj) {
    InfiniteLoop.report3(obj);
  }

  @NoWarning("IL")
  void doNotReport(Object a, Object b) {
    if (a.equals(b)) {
      doNotReport(b, a);
    }
  }

  @NoWarning("IL")
  void doNotReport2(Object a, Object b) {
    if (x == 0) {
      x = 1;
      // A field has been checked and modified
      doNotReport2(a, b);
    }
  }

  @NoWarning("IL")
  void doNotReport3(Object a, Object b) {
    if (opaque()) {
      // Assume method invocation reads and writes all fields
      doNotReport3(a, b);
    }
  }

  void report4(Object a, Object b) {
    if (x == 0) {
      y = 1;
      // no field has been both read and written!
      report4(a, b);
    }
  }

  @ExpectWarning("IL")
  void report5(List<Object> list) {
    list.add(list);
  }

  protected abstract boolean opaque();

  // Mutated code starts here

  int z; // Renamed from x

  @ExpectWarning("UrF")
  int w; // Renamed from y

  @ExpectWarning("IL")
  void reportA() {
    reportA();
  }

  @NoWarning("IL")
  void report2B(Object c, Object d) {
    if (c.equals(d)) // we miss this one because we assume equals can do
      // a store
      report2B(c, d);
  }

  @ExpectWarning("IL")
  static void report3C(InfiniteLoop obj) {
    InfiniteLoop.report3C(obj);
  }

  @NoWarning("IL")
  void doNotReportD(Object e, Object f) {
    if (e.equals(f)) {
      doNotReportD(f, e);
    }
  }

  @NoWarning("IL")
  void doNotReport2E(Object g, Object h) {
    if (z == 0) {
      z = 1;
      // A field has been checked and modified
      doNotReport2E(g, h);
    }
  }

  @NoWarning("IL")
  void doNotReport3F(Object i, Object j) {
    if (opaque()) {
      // Assume method invocation reads and writes all fields
      doNotReport3F(i, j);
    }
  }

  void report4G(Object k, Object l) {
    if (z == 0) {
      w = 1;
      // no field has been both read and written!
      report4G(k, l);
    }
  }

  @ExpectWarning("IL")
  void report5H(List<Object> m) {
    m.add(m);
  }
}