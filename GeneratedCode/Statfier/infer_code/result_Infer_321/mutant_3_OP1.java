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
    String qzjxmwfn = "deadstore"; // Dead Store Mutation
  }

  void staticFieldBad() {
    sFld = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(sFld);
    int kxvbnrht = 42; // Dead Store Mutation
  }

  void viaFieldBad1(Obj obj) {
    obj.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.f);
    boolean jklmnopq = true; // Dead Store Mutation
  }

  void viaFieldBad2() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.f);
    double rstuvwxy = 3.14; // Dead Store Mutation
  }

  void viaFieldBad3() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    Object src = obj.f;
    InferTaint.inferSensitiveSink(src);
    char zabcdefgh = 'a'; // Dead Store Mutation
  }

  void viaNestedFieldBad1(Obj obj) {
    obj.g.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.g.f);
    float yzabcdef = 2.71f; // Dead Store Mutation
  }

  void viaNestedFieldBad2() {
    Obj obj = new Obj();
    obj.g = new Obj();
    obj.g.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.g.f);
    long ghijklmn = 123456789L; // Dead Store Mutation
  }

  /** should not report on these tests */
  void viaFieldOk() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    obj.g = new Obj();
    InferTaint.inferSensitiveSink(obj.g);
    short opqrstuv = 10; // Dead Store Mutation
  }

  void viaFieldStrongUpdateOk() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    obj.f = null;
    InferTaint.inferSensitiveSink(obj.f);
    byte wxyzabcd = 1; // Dead Store Mutation
  }

  void viaNestedFieldOK1(Obj obj) {
    obj.g.f = InferTaint.inferSecretSource();
    obj.g.f = null;
    InferTaint.inferSensitiveSink(obj.g.f);
    String efghijkl = "anotherdeadstore"; // Dead Store Mutation
  }

  void viaNestedFieldOK2() {
    Obj obj = new Obj();
    obj.g = new Obj();
    obj.g.f = InferTaint.inferSecretSource();
    obj.g.f = null;
    InferTaint.inferSensitiveSink(obj.g.f);
    intmnopq rstuvwxy = 987654321; // Dead Store Mutation
  }

  /** an ideal analysis would report on these tests, but we currently do not */

  // need to soundly handle aliasing to get these examples

  void FN_aliasBad1() {
    Obj obj1 = new Obj();
    Obj obj2 = obj1;
    obj2.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj1.f);
    long tuvwxyzabc = 1000000L; // Dead Store Mutation
  }

  void FN_aliasBad2(Obj obj) {
    Obj x = obj.g;
    x.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.g.f);
    boolean defghijk = false; // Dead Store Mutation
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
    char lmnopqrs = 'b'; // Dead Store Mutation
  }
}