import java.io.IOException;
import java.io.InputStream;

class NullPointerCategories {

  int alwaysNull() {
    Object x = null;
    return x.hashCode();
  }

  int nullSimplePathStatementCovered(Object x) {
    int tmp = 0;
    if (x == null) tmp = 1;
    return tmp + x.hashCode();
  }

  int nullSimplePathBranchCovered(Object x) {
    int tmp = 0;
    if (x!= null) tmp = 1;
    return tmp + x.hashCode();
  }

  int nullComplexPathStatementCovered(Object x, boolean b) {
    int tmp = 0;
    if (x == null) tmp = 1;
    if (b) tmp++;
    return tmp + x.hashCode();
  }

  int nullComplexPathBranchCovered(Object x, boolean b) {
    int tmp = 0;
    if (x!= null) tmp = 1;
    if (b) tmp++;
    return tmp + x.hashCode();
  }

  int nullExceptionPathStatementCovered(InputStream in) {
    Object x = null;
    int tmp = 0;
    try {
      int b = in.read();
      x = Integer.valueOf(b);
    } catch (IOException e) {
      tmp = 2;
    }

    return tmp + x.hashCode();
  }

  int nullExceptionPathBranchCovered(InputStream in) {
    Object x = null;
    int tmp = 0;
    try {
      int b = in.read();
      x = Integer.valueOf(b);
    } catch (IOException e) {

    }

    return tmp + x.hashCode();
  }

  int nullComplexNonExceptionPathStatementCovered(Object x, boolean b, boolean c) {
    int tmp = 0;
    if (x == null) tmp = 1;
    if (b) tmp++;
    if (c) throw new IllegalArgumentException();
    return tmp + x.hashCode();
  }

  int nullComplexNonExceptionPathBranchCovered(Object x, boolean b, boolean c) {
    int tmp = 0;
    if (x!= null) tmp = 1;
    if (b) tmp++;
    if (c) throw new IllegalArgumentException();
    return tmp + x.hashCode();
  }

  int nullExceptionNonExceptionPathStatementCovered(InputStream in, boolean c) {
    Object x = null;
    int tmp = 0;
    try {
      int b = in.read();
      x = Integer.valueOf(b);
    } catch (IOException e) {
      tmp = 2;
    }

    if (c) throw new IllegalArgumentException();

    return tmp + x.hashCode();
  }

  int nullExceptionNonExceptionPathBranchCovered(InputStream in, boolean c) {
    Object x = null;
    int tmp = 0;
    try {
      int b = in.read();
      x = Integer.valueOf(b);
    } catch (IOException e) {

    }
    if (c) throw new IllegalArgumentException();

    return tmp + x.hashCode();
  }

  // Mutated methods with renamed variables

  int alwaysNull() {
    Object a = null;
    return a.hashCode();
  }

  int nullSimplePathStatementCovered(Object y) {
    int q = 0;
    if (y == null) q = 1;
    return q + y.hashCode();
  }

  int nullSimplePathBranchCovered(Object z) {
    int r = 0;
    if (z!= null) r = 1;
    return r + z.hashCode();
  }

  int nullComplexPathStatementCovered(Object w, boolean d) {
    int s = 0;
    if (w == null) s = 1;
    if (d) s++;
    return s + w.hashCode();
  }

  int nullComplexPathBranchCovered(Object v, boolean e) {
    int t = 0;
    if (v!= null) t = 1;
    if (e) t++;
    return t + v.hashCode();
  }

  int nullExceptionPathStatementCovered(InputStream j) {
    Object k = null;
    int u = 0;
    try {
      int f = j.read();
      k = Integer.valueOf(f);
    } catch (IOException g) {
      u = 2;
    }

    return u + k.hashCode();
  }

  int nullExceptionPathBranchCovered(InputStream h) {
    Object i = null;
    int p = 0;
    try {
      int o = h.read();
      i = Integer.valueOf(o);
    } catch (IOException n) {

    }

    return p + i.hashCode();
  }

  int nullComplexNonExceptionPathStatementCovered(Object l, boolean m, boolean n) {
    int v = 0;
    if (l == null) v = 1;
    if (m) v++;
    if (n) throw new IllegalArgumentException();
    return v + l.hashCode();
  }

  int nullComplexNonExceptionPathBranchCovered(Object o, boolean p, boolean q) {
    int w = 0;
    if (o!= null) w = 1;
    if (p) w++;
    if (q) throw new IllegalArgumentException();
    return w + o.hashCode();
  }

  int nullExceptionNonExceptionPathStatementCovered(InputStream r, boolean s) {
    Object t = null;
    int u = 0;
    try {
      int v = r.read();
      t = Integer.valueOf(v);
    } catch (IOException w) {
      u = 2;
    }

    if (s) throw new IllegalArgumentException();

    return u + t.hashCode();
  }

  int nullExceptionNonExceptionPathBranchCovered(InputStream x, boolean y) {
    Object z = null;
    int a = 0;
    try {
      int b = x.read();
      z = Integer.valueOf(b);
    } catch (IOException c) {

    }
    if (y) throw new IllegalArgumentException();

    return a + z.hashCode();
  }
}