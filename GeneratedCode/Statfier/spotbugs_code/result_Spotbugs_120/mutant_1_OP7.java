import java.io.IOException;
import java.io.InputStream;

class NullPointerCategories {

  int alwaysNull() {
    Object x = null;
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
    return x.hashCode();
  }

  int nullSimplePathStatementCovered(Object x) {
    int tmp = 0;
    if (x == null) tmp = 1;
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
    return tmp + x.hashCode();
  }

  int nullSimplePathBranchCovered(Object x) {
    int tmp = 0;
    if (x!= null) tmp = 1;
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
    return tmp + x.hashCode();
  }

  int nullComplexPathStatementCovered(Object x, boolean b) {
    int tmp = 0;
    if (x == null) tmp = 1;
    if (b) tmp++;
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
    return tmp + x.hashCode();
  }

  int nullComplexPathBranchCovered(Object x, boolean b) {
    int tmp = 0;
    if (x!= null) tmp = 1;
    if (b) tmp++;
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
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
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
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
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
    return tmp + x.hashCode();
  }

  int nullComplexNonExceptionPathStatementCovered(Object x, boolean b, boolean c) {
    int tmp = 0;
    if (x == null) tmp = 1;
    if (b) tmp++;
    if (c) throw new IllegalArgumentException();
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
    return tmp + x.hashCode();
  }

  int nullComplexNonExceptionPathBranchCovered(Object x, boolean b, boolean c) {
    int tmp = 0;
    if (x!= null) tmp = 1;
    if (b) tmp++;
    if (c) throw new IllegalArgumentException();
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
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
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
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
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
    return tmp + x.hashCode();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}