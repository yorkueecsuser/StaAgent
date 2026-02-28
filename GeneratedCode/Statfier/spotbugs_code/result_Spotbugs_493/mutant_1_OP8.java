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

  int z; // Renamed from x to z

  @ExpectWarning("UrF")
  int w; // Renamed from y to w

  @ExpectWarning("IL")
  void repot() { // Renamed from report to repot
    repot();
  }

  @NoWarning("IL")
  void repot2(Object c, Object d) { // Renamed from report2 to repot2, a to c, b to d
    if (c.equals(d)) // we miss this one because we assume equals can do
      // a store
      repot2(c, d);
  }

  @ExpectWarning("IL")
  static void repot3(InfiniteLoop obj) { // Renamed from report3 to repot3
    InfiniteLoop.repot3(obj);
  }

  @NoWarning("IL")
  void doNtReport(Object e, Object f) { // Renamed from doNotReport to doNtReport, a to e, b to f
    if (e.equals(f)) {
      doNtReport(f, e);
    }
  }

  @NoWarning("IL")
  void doNtReport2(Object g, Object h) { // Renamed from doNotReport2 to doNtReport2, a to g, b to h
    if (z == 0) { // Renamed x to z
      z = 1; // Renamed x to z
      // A field has been checked and modified
      doNtReport2(g, h);
    }
  }

  @NoWarning("IL")
  void doNtReport3(Object i, Object j) { // Renamed from doNotReport3 to doNtReport3, a to i, b to j
    if (opaque()) {
      // Assume method invocation reads and writes all fields
      doNtReport3(i, j);
    }
  }

  void repot4(Object k, Object l) { // Renamed from report4 to repot4, a to k, b to l
    if (z == 0) { // Renamed x to z
      w = 1; // Renamed y to w
      // no field has been both read and written!
      repot4(k, l);
    }
  }

  @ExpectWarning("IL")
  void repot5(List<Object> m) { // Renamed from report5 to repot5, list to m
    m.add(m);
  }
}