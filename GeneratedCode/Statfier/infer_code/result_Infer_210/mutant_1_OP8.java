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
  }

  void viaArrayThenFieldBad() {
    Obj[] arr = new Obj[1];
    arr[0].f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(arr[0].f);
  }

  void viaFieldThenArrayBad1(Obj obj) {
    obj.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.arr[0]);
  }

  void viaFieldThenArrayBad2() {
    Obj obj = new Obj();
    obj.arr = new Obj[1];
    obj.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.arr[0]);
  }

  /** should not report on these tests */
  void viaArrayOk() {
    Object[] arr = new Object[1];
    arr[0] = new Object();
    InferTaint.inferSensitiveSink(arr[0]);
  }

  /** false positives: an ideal analysis would not report on these, but we do */

  // we don't track array indices precisely
  void FP_viaArrayOk1(Object y, Object[] z) {
    Object[] arr = new Object[2];
    arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(arr[1]);
  }

  // we use weak update semantics on arrays
  void FP_viaArrayOk2(Object y, Object[] z) {
    Object[] arr = new Object[1];
    arr[0] = InferTaint.inferSecretSource();
    arr[0] = null;
    InferTaint.inferSensitiveSink(arr[0]);
  }

  // Mutants
  void viaArrayBad() {
    Object[] b = new Object[1];
    b[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(b[0]);
  }

  void viaArrayThenFieldBad() {
    Obj[] c = new Obj[1];
    c[0].f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(c[0].f);
  }

  void viaFieldThenArrayBad1(Obj d) {
    d.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(d.arr[0]);
  }

  void viaFieldThenArrayBad2() {
    Obj e = new Obj();
    e.arr = new Obj[1];
    e.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(e.arr[0]);
  }

  /** should not report on these tests */
  void viaArrayOk() {
    Object[] f = new Object[1];
    f[0] = new Object();
    InferTaint.inferSensitiveSink(f[0]);
  }

  /** false positives: an ideal analysis would not report on these, but we do */

  // we don't track array indices precisely
  void FP_viaArrayOk1(Object g, Object[] h) {
    Object[] i = new Object[2];
    i[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(i[1]);
  }

  // we use weak update semantics on arrays
  void FP_viaArrayOk2(Object j, Object[] k) {
    Object[] l = new Object[1];
    l[0] = InferTaint.inferSecretSource();
    l[0] = null;
    InferTaint.inferSensitiveSink(l[0]);
  }
}