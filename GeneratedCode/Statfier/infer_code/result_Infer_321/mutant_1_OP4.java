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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      this.mFld = null;
    } else {
      // Another unreachable code
      this.mFld = new Object();
    }
  }

  void staticFieldBad() {
    sFld = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(sFld);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      sFld = null;
    } else {
      // Another unreachable code
      sFld = new Object();
    }
  }

  void viaFieldBad1(Obj obj) {
    obj.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.f);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj.f = null;
    } else {
      // Another unreachable code
      obj.f = new Object();
    }
  }

  void viaFieldBad2() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.f);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj.f = null;
    } else {
      // Another unreachable code
      obj.f = new Object();
    }
  }

  void viaFieldBad3() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    Object src = obj.f;
    InferTaint.inferSensitiveSink(src);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      src = null;
    } else {
      // Another unreachable code
      src = new Object();
    }
  }

  void viaNestedFieldBad1(Obj obj) {
    obj.g.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.g.f);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj.g.f = null;
    } else {
      // Another unreachable code
      obj.g.f = new Object();
    }
  }

  void viaNestedFieldBad2() {
    Obj obj = new Obj();
    obj.g = new Obj();
    obj.g.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.g.f);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj.g.f = null;
    } else {
      // Another unreachable code
      obj.g.f = new Object();
    }
  }

  /** should not report on these tests */
  void viaFieldOk() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    obj.g = new Obj();
    InferTaint.inferSensitiveSink(obj.g);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj.f = null;
    } else {
      // Another unreachable code
      obj.f = new Object();
    }
  }

  void viaFieldStrongUpdateOk() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    obj.f = null;
    InferTaint.inferSensitiveSink(obj.f);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj.f = new Object();
    } else {
      // Another unreachable code
      obj.f = null;
    }
  }

  void viaNestedFieldOK1(Obj obj) {
    obj.g.f = InferTaint.inferSecretSource();
    obj.g.f = null;
    InferTaint.inferSensitiveSink(obj.g.f);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj.g.f = new Object();
    } else {
      // Another unreachable code
      obj.g.f = null;
    }
  }

  void viaNestedFieldOK2() {
    Obj obj = new Obj();
    obj.g = new Obj();
    obj.g.f = InferTaint.inferSecretSource();
    obj.g.f = null;
    InferTaint.inferSensitiveSink(obj.g.f);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj.g.f = new Object();
    } else {
      // Another unreachable code
      obj.g.f = null;
    }
  }

  /** an ideal analysis would report on these tests, but we currently do not */

  // need to soundly handle aliasing to get these examples

  void FN_aliasBad1() {
    Obj obj1 = new Obj();
    Obj obj2 = obj1;
    obj2.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj1.f);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj1.f = null;
    } else {
      // Another unreachable code
      obj1.f = new Object();
    }
  }

  void FN_aliasBad2(Obj obj) {
    Obj x = obj.g;
    x.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.g.f);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj.g.f = null;
    } else {
      // Another unreachable code
      obj.g.f = new Object();
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj.f = null;
    } else {
      // Another unreachable code
      obj.f = new Object();
    }
  }

  private boolean getCondition() {
    return false; // This method can be used to simulate a dynamic condition
  }
}