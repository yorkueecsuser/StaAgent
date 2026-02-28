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

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  void staticFieldBad() {
    sFld = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(sFld);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  void viaFieldBad1(Obj obj) {
    obj.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.f);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  void viaFieldBad2() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.f);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  void viaFieldBad3() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    Object src = obj.f;
    InferTaint.inferSensitiveSink(src);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  void viaNestedFieldBad1(Obj obj) {
    obj.g.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.g.f);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  void viaNestedFieldBad2() {
    Obj obj = new Obj();
    obj.g = new Obj();
    obj.g.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.g.f);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  /** should not report on these tests */
  void viaFieldOk() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    obj.g = new Obj();
    InferTaint.inferSensitiveSink(obj.g);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  void viaFieldStrongUpdateOk() {
    Obj obj = new Obj();
    obj.f = InferTaint.inferSecretSource();
    obj.f = null;
    InferTaint.inferSensitiveSink(obj.f);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  void viaNestedFieldOK1(Obj obj) {
    obj.g.f = InferTaint.inferSecretSource();
    obj.g.f = null;
    InferTaint.inferSensitiveSink(obj.g.f);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  void viaNestedFieldOK2() {
    Obj obj = new Obj();
    obj.g = new Obj();
    obj.g.f = InferTaint.inferSecretSource();
    obj.g.f = null;
    InferTaint.inferSensitiveSink(obj.g.f);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  /** an ideal analysis would report on these tests, but we currently do not */

  // need to soundly handle aliasing to get these examples

  void FN_aliasBad1() {
    Obj obj1 = new Obj();
    Obj obj2 = obj1;
    obj2.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj1.f);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  void FN_aliasBad2(Obj obj) {
    Obj x = obj.g;
    x.f = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(obj.g.f);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
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

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, making the loops unreachable
  }
}