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
    int a = 0;
    if (x!= null) a = 1;
    return a + x.hashCode();
  }

  int nullComplexPathStatementCovered(Object x, boolean b) {
    int tmp = 0;
    if (x == null) tmp = 1;
    if (b) tmp++;
    return tmp + x.hashCode();
  }

  int nullComplexPathBranchCovered(Object x, boolean b) {
    int c = 0;
    if (x!= null) c = 1;
    if (b) c++;
    return c + x.hashCode();
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
    Object d = null;
    int e = 0;
    try {
      int f = in.read();
      d = Integer.valueOf(f);
    } catch (IOException g) {

    }

    return e + d.hashCode();
  }

  int nullComplexNonExceptionPathStatementCovered(Object x, boolean b, boolean c) {
    int tmp = 0;
    if (x == null) tmp = 1;
    if (b) tmp++;
    if (c) throw new IllegalArgumentException();
    return tmp + x.hashCode();
  }

  int nullComplexNonExceptionPathBranchCovered(Object x, boolean b, boolean c) {
    int h = 0;
    if (x!= null) h = 1;
    if (b) h++;
    if (c) throw new IllegalArgumentException();
    return h + x.hashCode();
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
    Object i = null;
    int j = 0;
    try {
      int k = in.read();
      i = Integer.valueOf(k);
    } catch (IOException l) {

    }
    if (c) throw new IllegalArgumentException();

    return j + i.hashCode();
  }
}