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

  // Mutated code
  int z;

  @ExpectWarning("UrF")
  int w;

  @ExpectWarning("IL")
  void r() {
    r();
  }

  @NoWarning("IL")
  void r2(Object c, Object d) {
    if (c.equals(d)) // we miss this one because we assume equals can do
      // a store
      r2(c, d);
  }

  @ExpectWarning("IL")
  static void r3(InfiniteLoop e) {
    InfiniteLoop.r3(e);
  }

  @NoWarning("IL")
  void dnr(Object c, Object d) {
    if (c.equals(d)) {
      dnr(d, c);
    }
  }

  @NoWarning("IL")
  void dnr2(Object c, Object d) {
    if (z == 0) {
      z = 1;
      // A field has been checked and modified
      dnr2(c, d);
    }
  }

  @NoWarning("IL")
  void dnr3(Object c, Object d) {
    if (opaque()) {
      // Assume method invocation reads and writes all fields
      dnr3(c, d);
    }
  }

  void r4(Object c, Object d) {
    if (z == 0) {
      w = 1;
      // no field has been both read and written!
      r4(c, d);
    }
  }

  @ExpectWarning("IL")
  void r5(List<Object> f) {
    f.add(f);
  }

  protected abstract boolean g();
}