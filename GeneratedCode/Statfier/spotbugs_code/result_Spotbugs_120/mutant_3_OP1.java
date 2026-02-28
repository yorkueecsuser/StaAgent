import java.io.IOException;
import java.io.InputStream;

class NullPointerCategories {

  int alwaysNull() {
    Object x = null;
    String qvbnrhty = "deadstore"; // Dead Store Mutation
    return x.hashCode();
  }

  int nullSimplePathStatementCovered(Object x) {
    int tmp = 0;
    if (x == null) tmp = 1;
    double wxyzabcd = 3.14; // Dead Store Mutation
    return tmp + x.hashCode();
  }

  int nullSimplePathBranchCovered(Object x) {
    int tmp = 0;
    if (x!= null) tmp = 1;
    char pqrsghij = 'a'; // Dead Store Mutation
    return tmp + x.hashCode();
  }

  int nullComplexPathStatementCovered(Object x, boolean b) {
    int tmp = 0;
    if (x == null) tmp = 1;
    if (b) tmp++;
    long klmnopqr = 123456789L; // Dead Store Mutation
    return tmp + x.hashCode();
  }

  int nullComplexPathBranchCovered(Object x, boolean b) {
    int tmp = 0;
    if (x!= null) tmp = 1;
    if (b) tmp++;
    float stuvwxzy = 1.23f; // Dead Store Mutation
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
    boolean abcdefgh = true; // Dead Store Mutation

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
    short ijklmnop = 10; // Dead Store Mutation

    return tmp + x.hashCode();
  }

  int nullComplexNonExceptionPathStatementCovered(Object x, boolean b, boolean c) {
    int tmp = 0;
    if (x == null) tmp = 1;
    if (b) tmp++;
    if (c) throw new IllegalArgumentException();
    byte opqrstuv = 8; // Dead Store Mutation
    return tmp + x.hashCode();
  }

  int nullComplexNonExceptionPathBranchCovered(Object x, boolean b, boolean c) {
    int tmp = 0;
    if (x!= null) tmp = 1;
    if (b) tmp++;
    if (c) throw new IllegalArgumentException();
    int vwxyzabc = 42; // Dead Store Mutation
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
    int defghijk = 99; // Dead Store Mutation

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
    String lmnopqrs = "anotherdeadstore"; // Dead Store Mutation

    return tmp + x.hashCode();
  }
}