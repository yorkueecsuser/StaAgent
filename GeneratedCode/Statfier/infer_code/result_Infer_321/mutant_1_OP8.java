import codetoanalyze.java.InferTaint;

class Fields {

  static class Obj {
    Object f;
    Obj g;
  }

  Object mFld;
  static Object sFld;

  /** should report on these tests */
  void instanceFieldBad() {
    this.mFld = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(this.mFld);
  }

  void staticFieldBad() {
    sFld = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(sFld);
  }

  void viaFieldBad1(Obj obj) {
    obj.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.f);
  }

  void viaFieldBad2() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.f);
  }

  void viaFieldBad3() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    Object src = obj.f;
    InferTaint.inferSensitiveSink(src);
  }

  void viaNestedFieldBad1(Obj obj) {
    obj.g.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.g.f);
  }

  void viaNestedFieldBad2() {
    Obj obj = new Obj();
    obj.g = new Obj();
    obj.g.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.g.f);
  }

  /** should not report on these tests */
  void viaFieldOk() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    obj.g = new Obj();
    InferTaint.inferSensitiveSink(obj.g);
  }

  void viaFieldStrongUpdateOk() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    obj.f = null;
    InferTaint.inferSensitiveSink(obj.f);
  }

  void viaNestedFieldOK1(Obj obj) {
    obj.g.f = InferTaint.inferSecretSource();
    obj.g.f = null;
    InferTaint.inferSensitiveSink(obj.g.f);
  }

  void viaNestedFieldOK2() {
    Obj obj = new Obj();
    obj.g = new Obj();
    obj.g.f = InferTaint.inferSecretSource();
    obj.g.f = null;
    InferTaint.inferSensitiveSink(obj.g.f);
  }

  /** an ideal analysis would report on these tests, but we currently do not */

  // need to soundly handle aliasing to get these examples

  void FN_aliasBad1() {
    Obj obj1 = new Obj();
    Obj obj2 = obj1;
    obj2.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj1.f);
  }

  void FN_aliasBad2(Obj obj) {
    Obj x = obj.g;
    x.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.g.f);
  }

  // need to fix our widening in order to report on this

  void FN_loopFieldBad(Obj obj, int i) {
    Obj loopObj = obj;
    while (i < 10) {
      loopObj.f = InferTaint.inferSecretSource();
      loopObj = loopObj.g;
      i++;
    }
    InferTaint.inferSensitiveSink(obj.g.g.f);
  }

  // Mutated code starts here

  void instanceFieldBad_mutated() {
    this.mFld = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(this.mFld);
  }

  void staticFieldBad_mutated() {
    sFld = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(sFld);
  }

  void viaFieldBad1_mutated(Obj a) {
    a.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(a.f);
  }

  void viaFieldBad2_mutated() {
    Obj b = new Obj();
    b.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(b.f);
  }

  void viaFieldBad3_mutated() {
    Obj c = new Obj();
    c.f = InferTaint.inferSecretSource();
    Object d = c.f;
    InferTaint.inferSensitiveSink(d);
  }

  void viaNestedFieldBad1_mutated(Obj e) {
    e.g.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(e.g.f);
  }

  void viaNestedFieldBad2_mutated() {
    Obj f = new Obj();
    f.g = new Obj();
    f.g.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(f.g.f);
  }

  void viaFieldOk_mutated() {
    Obj g = new Obj();
    g.f = InferTaint.inferSecretSource();
    g.g = new Obj();
    InferTaint.inferSensitiveSink(g.g);
  }

  void viaFieldStrongUpdateOk_mutated() {
    Obj h = new Obj();
    h.f = InferTaint.inferSecretSource();
    h.f = null;
    InferTaint.inferSensitiveSink(h.f);
  }

  void viaNestedFieldOK1_mutated(Obj i) {
    i.g.f = InferTaint.inferSecretSource();
    i.g.f = null;
    InferTaint.inferSensitiveSink(i.g.f);
  }

  void viaNestedFieldOK2_mutated() {
    Obj j = new Obj();
    j.g = new Obj();
    j.g.f = InferTaint.inferSecretSource();
    j.g.f = null;
    InferTaint.inferSensitiveSink(j.g.f);
  }

  void FN_aliasBad1_mutated() {
    Obj k = new Obj();
    Obj l = k;
    l.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(k.f);
  }

  void FN_aliasBad2_mutated(Obj m) {
    Obj n = m.g;
    n.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(m.g.f);
  }

  void FN_loopFieldBad_mutated(Obj o, int p) {
    Obj q = o;
    while (p < 10) {
      q.f = InferTaint.inferSecretSource();
      q = q.g;
      p++;
    }
    InferTaint.inferSensitiveSink(o.g.g.f);
  }
}