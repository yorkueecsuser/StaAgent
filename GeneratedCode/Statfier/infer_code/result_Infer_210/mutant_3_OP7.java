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

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  void viaArrayThenFieldBad() {
    Obj[] arr = new Obj[1];
    arr[0].f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(arr[0].f);

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  void viaFieldThenArrayBad1(Obj obj) {
    obj.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.arr[0]);

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  void viaFieldThenArrayBad2() {
    Obj obj = new Obj();
    obj.arr = new Obj[1];
    obj.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.arr[0]);

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  /** should not report on these tests */
  void viaArrayOk() {
    Object[] arr = new Object[1];
    arr[0] = new Object();
    InferTaint.inferSensitiveSink(arr[0]);

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  /** false positives: an ideal analysis would not report on these, but we do */

  // we don't track array indices precisely
  void FP_viaArrayOk1(Object y, Object[] z) {
    Object[] arr = new Object[2];
    arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(arr[1]);

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  // we use weak update semantics on arrays
  void FP_viaArrayOk2(Object y, Object[] z) {
    Object[] arr = new Object[1];
    arr[0] = InferTaint.inferSecretSource();
    arr[0] = null;
    InferTaint.inferSensitiveSink(arr[0]);

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}