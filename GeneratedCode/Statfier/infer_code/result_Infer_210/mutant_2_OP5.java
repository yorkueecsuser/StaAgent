import codetoanalyze.java.InferTaint;

class Arrays {

  static class Obj {
    Object f;
    Object[] arr;
  }

  /** should report on these tests */
  void viaArrayBad() {
    Object[] arr = new Object[1];
    arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(arr[0]);

    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  void viaArrayThenFieldBad() {
    Obj[] arr = new Obj[1];
    arr[0].f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(arr[0].f);

    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  void viaFieldThenArrayBad1(Obj obj) {
    obj.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.arr[0]);

    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  void viaFieldThenArrayBad2() {
    Obj obj = new Obj();
    obj.arr = new Obj[1];
    obj.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.arr[0]);

    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  /** should not report on these tests */
  void viaArrayOk() {
    Object[] arr = new Object[1];
    arr[0] = new Object();
    InferTaint.inferSensitiveSink(arr[0]);

    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  /** false positives: an ideal analysis would not report on these, but we do */

  // we don't track array indices precisely
  void FP_viaArrayOk1(Object y, Object[] z) {
    Object[] arr = new Object[2];
    arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(arr[1]);

    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  // we use weak update semantics on arrays
  void FP_viaArrayOk2(Object y, Object[] z) {
    Object[] arr = new Object[1];
    arr[0] = InferTaint.inferSecretSource();
    arr[0] = null;
    InferTaint.inferSensitiveSink(arr[0]);

    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to simulate a dynamic condition
  private boolean getCondition() {
    return false;
  }
}