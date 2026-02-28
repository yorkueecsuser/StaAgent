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

  void instanceFieldBad_b() {
    this.mFld = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(this.mFld);
  }

  void staticFieldBad_c() {
    sFld = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(sFld);
  }

  void viaFieldBad1_d(Obj a) {
    a.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(a.f);
  }

  void viaFieldBad2_e() {
    Obj b = new Obj();
    b.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(b.f);
  }

  void viaFieldBad3_f() {
    Obj c = new Obj();
    c.f = InferTaint.inferSecretSource();
    Object d = c.f;
    InferTaint.inferSensitiveSink(d);
  }

  void viaNestedFieldBad1_g(Obj h) {
    h.g.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(h.g.f);
  }

  void viaNestedFieldBad2_i() {
    Obj j = new Obj();
    j.g = new Obj();
    j.g.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(j.g.f);
  }

  void viaFieldOk_k() {
    Obj l = new Obj();
    l.f = InferTaint.inferSecretSource();
    l.g = new Obj();
    InferTaint.inferSensitiveSink(l.g);
  }

  void viaFieldStrongUpdateOk_m() {
    Obj n = new Obj();
    n.f = InferTaint.inferSecretSource();
    n.f = null;
    InferTaint.inferSensitiveSink(n.f);
  }

  void viaNestedFieldOK1_o(Obj p) {
    p.g.f = InferTaint.inferSecretSource();
    p.g.f = null;
    InferTaint.inferSensitiveSink(p.g.f);
  }

  void viaNestedFieldOK2_q() {
    Obj r = new Obj();
    r.g = new Obj();
    r.g.f = InferTaint.inferSecretSource();
    r.g.f = null;
    InferTaint.inferSensitiveSink(r.g.f);
  }

  void FN_aliasBad1_s() {
    Obj t = new Obj();
    Obj u = t;
    u.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(t.f);
  }

  void FN_aliasBad2_v(Obj w) {
    Obj x = w.g;
    x.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(w.g.f);
  }

  void FN_loopFieldBad_y(Obj z, int aa) {
    Obj ab = z;
    while (aa < 10) {
      ab.f = InferTaint.inferSecretSource();
      ab = ab.g;
      aa++;
    }
    InferTaint.inferSensitiveSink(z.g.g.f);
  }
}