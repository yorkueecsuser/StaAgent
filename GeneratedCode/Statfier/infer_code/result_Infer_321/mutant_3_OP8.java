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
    this.a = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(this.a);
  }

  void staticFieldBad_mutated() {
    b = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(b);
  }

  void viaFieldBad1_mutated(Obj c) {
    c.d = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(c.d);
  }

  void viaFieldBad2_mutated() {
    Obj e = new Obj();
    e.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(e.f);
  }

  void viaFieldBad3_mutated() {
    Obj g = new Obj();
    g.h = InferTaint.inferSecretSource();
    Object i = g.h;
    InferTaint.inferSensitiveSink(i);
  }

  void viaNestedFieldBad1_mutated(Obj j) {
    j.k.l = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(j.k.l);
  }

  void viaNestedFieldBad2_mutated() {
    Obj m = new Obj();
    m.n = new Obj();
    m.n.o = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(m.n.o);
  }

  void viaFieldOk_mutated() {
    Obj p = new Obj();
    p.q = InferTaint.inferSecretSource();
    p.r = new Obj();
    InferTaint.inferSensitiveSink(p.r);
  }

  void viaFieldStrongUpdateOk_mutated() {
    Obj s = new Obj();
    s.t = InferTaint.inferSecretSource();
    s.t = null;
    InferTaint.inferSensitiveSink(s.t);
  }

  void viaNestedFieldOK1_mutated(Obj u) {
    u.v.w = InferTaint.inferSecretSource();
    u.v.w = null;
    InferTaint.inferSensitiveSink(u.v.w);
  }

  void viaNestedFieldOK2_mutated() {
    Obj x = new Obj();
    x.y = new Obj();
    x.y.z = InferTaint.inferSecretSource();
    x.y.z = null;
    InferTaint.inferSensitiveSink(x.y.z);
  }

  void FN_aliasBad1_mutated() {
    Obj aa = new Obj();
    Obj bb = aa;
    bb.cc = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(aa.cc);
  }

  void FN_aliasBad2_mutated(Obj dd) {
    Obj ee = dd.ff;
    ee.gg = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(dd.ff.gg);
  }

  void FN_loopFieldBad_mutated(Obj hh, int ii) {
    Obj jj = hh;
    while (ii < 10) {
      jj.kk = InferTaint.inferSecretSource();
      jj = jj.ll;
      ii++;
    }
    InferTaint.inferSensitiveSink(hh.ll.ll.mm);
  }
}