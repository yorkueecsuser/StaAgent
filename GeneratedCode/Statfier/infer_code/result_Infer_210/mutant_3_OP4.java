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

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      arr[0] = new Object();
    } else {
      // This block also should never execute
      arr[0] = new Object();
    }
  }

  void viaArrayThenFieldBad() {
    Obj[] arr = new Obj[1];
    arr[0].f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(arr[0].f);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      arr[0].f = new Object();
    } else {
      // This block also should never execute
      arr[0].f = new Object();
    }
  }

  void viaFieldThenArrayBad1(Obj obj) {
    obj.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.arr[0]);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      obj.arr[0] = new Object();
    } else {
      // This block also should never execute
      obj.arr[0] = new Object();
    }
  }

  void viaFieldThenArrayBad2() {
    Obj obj = new Obj();
    obj.arr = new Obj[1];
    obj.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.arr[0]);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      obj.arr[0] = new Object();
    } else {
      // This block also should never execute
      obj.arr[0] = new Object();
    }
  }

  /** should not report on these tests */
  void viaArrayOk() {
    Object[] arr = new Object[1];
    arr[0] = new Object();
    InferTaint.inferSensitiveSink(arr[0]);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      arr[0] = InferTaint.inferSecretSource();
    } else {
      // This block also should never execute
      arr[0] = InferTaint.inferSecretSource();
    }
  }

  /** false positives: an ideal analysis would not report on these, but we do */

  // we don't track array indices precisely
  void FP_viaArrayOk1(Object y, Object[] z) {
    Object[] arr = new Object[2];
    arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(arr[1]);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      arr[0] = new Object();
    } else {
      // This block also should never execute
      arr[0] = new Object();
    }
  }

  // we use weak update semantics on arrays
  void FP_viaArrayOk2(Object y, Object[] z) {
    Object[] arr = new Object[1];
    arr[0] = InferTaint.inferSecretSource();
    arr[0] = null;
    InferTaint.inferSensitiveSink(arr[0]);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      arr[0] = InferTaint.inferSecretSource();
    } else {
      // This block also should never execute
      arr[0] = InferTaint.inferSecretSource();
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}