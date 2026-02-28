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

  // Mutated methods
  int alwaysNull() {
    Object a = null;
    return a.hashCode();
  }

  int nullSimplePathStatementCovered(Object y) {
    int z = 0;
    if (y == null) z = 1;
    return z + y.hashCode();
  }

  int nullSimplePathBranchCovered(Object w) {
    int v = 0;
    if (w!= null) v = 1;
    return v + w.hashCode();
  }

  int nullComplexPathStatementCovered(Object q, boolean r) {
    int p = 0;
    if (q == null) p = 1;
    if (r) p++;
    return p + q.hashCode();
  }

  int nullComplexPathBranchCovered(Object s, boolean t) {
    int u = 0;
    if (s!= null) u = 1;
    if (t) u++;
    return u + s.hashCode();
  }

  int nullExceptionPathStatementCovered(InputStream j) {
    Object k = null;
    int l = 0;
    try {
      int m = j.read();
      k = Integer.valueOf(m);
    } catch (IOException n) {
      l = 2;
    }

    return l + k.hashCode();
  }

  int nullExceptionPathBranchCovered(InputStream o) {
    Object p = null;
    int q = 0;
    try {
      int r = o.read();
      p = Integer.valueOf(r);
    } catch (IOException s) {

    }

    return q + p.hashCode();
  }

  int nullComplexNonExceptionPathStatementCovered(Object d, boolean e, boolean f) {
    int g = 0;
    if (d == null) g = 1;
    if (e) g++;
    if (f) throw new IllegalArgumentException();
    return g + d.hashCode();
  }

  int nullComplexNonExceptionPathBranchCovered(Object h, boolean i, boolean j) {
    int k = 0;
    if (h!= null) k = 1;
    if (i) k++;
    if (j) throw new IllegalArgumentException();
    return k + h.hashCode();
  }

  int nullExceptionNonExceptionPathStatementCovered(InputStream n, boolean o) {
    Object p = null;
    int q = 0;
    try {
      int r = n.read();
      p = Integer.valueOf(r);
    } catch (IOException s) {
      q = 2;
    }

    if (o) throw new IllegalArgumentException();

    return q + p.hashCode();
  }

  int nullExceptionNonExceptionPathBranchCovered(InputStream t, boolean u) {
    Object v = null;
    int w = 0;
    try {
      int x = t.read();
      v = Integer.valueOf(x);
    } catch (IOException y) {

    }
    if (u) throw new IllegalArgumentException();

    return w + v.hashCode();
  }
}