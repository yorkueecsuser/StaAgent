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
    
    // Mutant
    Object[] b = new Object[1];
    b[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(b[0]);
  }

  void viaArrayThenFieldBad() {
    Obj[] arr = new Obj[1];
    arr[0].f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(arr[0].f);
    
    // Mutant
    Obj[] c = new Obj[1];
    c[0].f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(c[0].f);
  }

  void viaFieldThenArrayBad1(Obj obj) {
    obj.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.arr[0]);
    
    // Mutant
    Obj x = new Obj();
    x.arr = new Obj[1];
    x.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(x.arr[0]);
  }

  void viaFieldThenArrayBad2() {
    Obj obj = new Obj();
    obj.arr = new Obj[1];
    obj.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.arr[0]);
    
    // Mutant
    Obj q = new Obj();
    q.arr = new Obj[1];
    q.arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(q.arr[0]);
  }

  /** should not report on these tests */
  void viaArrayOk() {
    Object[] arr = new Object[1];
    arr[0] = new Object();
    InferTaint.inferSensitiveSink(arr[0]);
    
    // Mutant
    Object[] d = new Object[1];
    d[0] = new Object();
    InferTaint.inferSensitiveSink(d[0]);
  }

  /** false positives: an ideal analysis would not report on these, but we do */

  // we don't track array indices precisely
  void FP_viaArrayOk1(Object y, Object[] z) {
    Object[] arr = new Object[2];
    arr[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(arr[1]);
    
    // Mutant
    Object[] e = new Object[2];
    e[0] = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(e[1]);
  }

  // we use weak update semantics on arrays
  void FP_viaArrayOk2(Object y, Object[] z) {
    Object[] arr = new Object[1];
    arr[0] = InferTaint.inferSecretSource();
    arr[0] = null;
    InferTaint.inferSensitiveSink(arr[0]);
    
    // Mutant
    Object[] f = new Object[1];
    f[0] = InferTaint.inferSecretSource();
    f[0] = null;
    InferTaint.inferSensitiveSink(f[0]);
  }
}