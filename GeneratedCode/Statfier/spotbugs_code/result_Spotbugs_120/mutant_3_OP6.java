import java.io.IOException;
import java.io.InputStream;

class NullPointerCategories {

  int alwaysNull() {
    Object x = null;
    return x.hashCode();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  int nullSimplePathStatementCovered(Object x) {
    int tmp = 0;
    if (x == null) tmp = 1;
    return tmp + x.hashCode();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  int nullSimplePathBranchCovered(Object x) {
    int tmp = 0;
    if (x!= null) tmp = 1;
    return tmp + x.hashCode();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  int nullComplexPathStatementCovered(Object x, boolean b) {
    int tmp = 0;
    if (x == null) tmp = 1;
    if (b) tmp++;
    return tmp + x.hashCode();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  int nullComplexPathBranchCovered(Object x, boolean b) {
    int tmp = 0;
    if (x!= null) tmp = 1;
    if (b) tmp++;
    return tmp + x.hashCode();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
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
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
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
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  int nullComplexNonExceptionPathStatementCovered(Object x, boolean b, boolean c) {
    int tmp = 0;
    if (x == null) tmp = 1;
    if (b) tmp++;
    if (c) throw new IllegalArgumentException();
    return tmp + x.hashCode();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  int nullComplexNonExceptionPathBranchCovered(Object x, boolean b, boolean c) {
    int tmp = 0;
    if (x!= null) tmp = 1;
    if (b) tmp++;
    if (c) throw new IllegalArgumentException();
    return tmp + x.hashCode();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
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
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
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
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}