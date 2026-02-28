import java.util.Iterator;

class AnalysisStops {

  private native Object externalFunc();

  public void skipPointerDerefMayCauseLocalFalseNegativeBad() {
    Object ret = externalFunc();
    ret.toString();
    int i = 1 / 0;
  }

  private Object skipPointerDerefPreventsSpecInferenceRetObj() {
    Object x = externalFunc(); // Mutated variable name from'ret' to 'x'
    x.toString();
    return new Object();
  }

  public void skipPointerDerefMayCauseCalleeFalsePositiveOk() {
    Object o = skipPointerDerefPreventsSpecInferenceRetObj();
    o.toString();
  }

  private int skipPointerDerefPreventsSpecInferenceRetZero() {
    Object y = externalFunc(); // Mutated variable name from'ret' to 'y'
    y.toString();
    return 0;
  }

  public void skipPointerDerefMayCauseCalleeFalseNegativeBad() {
    int z = skipPointerDerefPreventsSpecInferenceRetZero(); // Mutated variable name from'ret' to 'z'
    int i = 1 / z;
  }

  private void divideByParam(int a) { // Mutated parameter name from 'i' to 'a'
    int j = 1 / a;
  }

  public void skipPointerDerefMayCauseInterprocFalseNegativeBad() {
    int i = skipPointerDerefPreventsSpecInferenceRetZero();
    divideByParam(i);
  }

  private String castExternalPreventsSpecInference() {
    return (String) externalFunc();
  }

  public void castFailureOnUndefinedObjMayCauseFalseNegativeBad() {
    castExternalPreventsSpecInference();
    int i = 1 / 0;
  }

  public void callOnCastUndefinedObjMayCauseFalseNegativeBad() {
    String s = castExternalPreventsSpecInference();
    s.toString();
    int i = 1 / 0;
  }

  private static class MyObj {
    Object f;
    MyObj rec;
    int i;

    public int retOne() {
      return 1;
    }

    public int retZero() {
      return 0;
    }
  }

  private native MyObj externalFunc2();

  public void callOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj v = externalFunc2(); // Mutated variable name from'ret' to 'v'
    int i = 1 / v.retZero();
  }

  public void callOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj w = externalFunc2(); // Mutated variable name from'ret' to 'w'
    int i = 1 / w.retOne();
  }

  public void fieldWriteOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj u = externalFunc2(); // Mutated variable name from'ret' to 'u'
    u.f = new Object();
    int i = 1 / 0;
  }

  public void fieldWriteOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj t = externalFunc2(); // Mutated variable name from'ret' to 't'
    t.f = new Object();
    t.f.toString();
  }

  public void fieldReadOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj s = externalFunc2(); // Mutated variable name from'ret' to's'
    Object o = s.f;
    int i = 1 / 0;
  }

  public void fieldReadOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj r = externalFunc2(); // Mutated variable name from'ret' to 'r'
    Object o = r.f;
    o.toString();
  }

  public void recursiveAngelicTypesMayCauseFalseNegativeBad() {
    MyObj q = externalFunc2(); // Mutated variable name from'ret' to 'q'
    MyObj p = q.rec;
    MyObj o = p.rec;
    int i = 1 / 0;
  }

  public void recursiveAngelicTypesMayCauseFalsePositiveOk() {
    MyObj n = externalFunc2(); // Mutated variable name from'ret' to 'n'
    MyObj m = n.rec;
    m.rec.toString();
  }

  public void infiniteMaterializationMayCauseFalseNegativeBad(boolean b) {
    MyObj l = externalFunc2(); // Mutated variable name from'rec' to 'l'
    while (b) {
      l = l.rec;
    }
    int i = 1 / 0;
  }

  public void infiniteMaterializationMayCauseFalsePositiveOk(boolean b) {
    MyObj k = externalFunc2(); // Mutated variable name from'rec' to 'k'
    while (b) {
      k = k.rec;
    }
    k.toString();
  }

  public void primitiveFieldOfAngelicObjMayCauseFalseNegativeBad() {
    MyObj j = externalFunc2(); // Mutated variable name from'ret' to 'j'
    if (j.i == 0) {
      int i = 1 / 0;
    } else {
      int i = 1 / 0;
    }
  }

  public void primitiveFieldOfAngelicObjMayCauseFalsePositiveOk() {
    MyObj h = externalFunc2(); // Mutated variable name from'ret' to 'h'
    if (h.i!= 0) {
      int i = 1 / h.i;
    }
  }

  public void heapFieldOfAngelicObjMayCauseFalseNegativeBad() {
    MyObj g = externalFunc2(); // Mutated variable name from'ret' to 'g'
    Object obj = g.f;
    if (obj == g.f) {
      int i = 1 / 0;
    }
  }

  public void heapFieldOfAngelicObjMayCauseFalsePositiveOk() {
    MyObj f = externalFunc2(); // Mutated variable name from'ret' to 'f'
    Object obj = f.f;
    if (obj!= f.f) {
      int i = 1 / 0;
    }
  }

  public void fieldReadAferCastMayCauseFalseNegativeBad(Iterator<MyObj> iter) {
    MyObj e = iter.next(); // Mutated variable name from'ret' to 'e'
    Object d = e.f;
    d.toString();
    int i = e.i;
    if (i == 7) {
      int j = 1 / 0;
    }
  }

  public void derefParamOk(MyObj obj) {
    Object c = obj.f;
    c.toString();
  }

  public void fieldReadInCalleeMayCauseFalsePositiveOk() {
    MyObj b = externalFunc2(); // Mutated variable name from'ret' to 'b'
    derefParamOk(b);
  }

  public void fieldReadInCalleeMayCauseFalseNegativeBad() {
    MyObj a = externalFunc2(); // Mutated variable name from'ret' to 'a'
    a.f = null;
    derefParamOk(a);
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalsePositiveOk() {
    MyObj z = externalFunc2(); // Mutated variable name from'ret' to 'z'
    derefParamOk(z.rec);
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalseNegativeBad() {
    MyObj y = externalFunc2(); // Mutated variable name from'ret' to 'y'
    y.rec.f = null;
    derefParamOk(y.rec);
  }

  public void accessPathOnParamOk(MyObj obj) {
    MyObj x = obj.rec;
    Object w = x.f;
    w.toString();
  }

  public void accessPathInCalleeMayCauseFalsePositiveOk() {
    MyObj v = externalFunc2(); // Mutated variable name from'ret' to 'v'
    accessPathOnParamOk(v);
  }

  public void accessPathInCalleeMayCauseFalseNegativeBad() {
    MyObj u = externalFunc2(); // Mutated variable name from'ret' to 'u'
    u.rec.f = null;
    accessPathOnParamOk(u);
  }

  public void skipFunctionInLoopMayCauseFalseNegativeBad() {
    Object t = null;
    for (int s = 0; s < 10; s++) { // Mutated loop variable name from 'i' to's'
      externalFunc();
    }
    t.toString();
  }

  // will fail to find error unless spec inference succeeds for all callees
  public void specInferenceMayFailAndCauseFalseNegativeBad(boolean b, Iterator<MyObj> iter) {
    skipPointerDerefMayCauseLocalFalseNegativeBad();
    skipPointerDerefPreventsSpecInferenceRetObj();
    skipPointerDerefPreventsSpecInferenceRetZero();
    skipPointerDerefMayCauseCalleeFalseNegativeBad();
    skipPointerDerefMayCauseInterprocFalseNegativeBad();
    castFailureOnUndefinedObjMayCauseFalseNegativeBad();
    callOnCastUndefinedObjMayCauseFalseNegativeBad();
    callOnUndefinedObjMayCauseFalseNegativeBad();
    callOnUndefinedObjMayCauseFalsePositiveOk();
    fieldWriteOnUndefinedObjMayCauseFalseNegativeBad();
    fieldWriteOnUndefinedObjMayCauseFalsePositiveOk();
    fieldReadOnUndefinedObjMayCauseFalseNegativeBad();
    fieldReadOnUndefinedObjMayCauseFalsePositiveOk();
    recursiveAngelicTypesMayCauseFalseNegativeBad();
    recursiveAngelicTypesMayCauseFalsePositiveOk();
    infiniteMaterializationMayCauseFalseNegativeBad(b);
    infiniteMaterializationMayCauseFalsePositiveOk(b);
    primitiveFieldOfAngelicObjMayCauseFalsePositiveOk();
    primitiveFieldOfAngelicObjMayCauseFalseNegativeBad();
    heapFieldOfAngelicObjMayCauseFalsePositiveOk();
    heapFieldOfAngelicObjMayCauseFalseNegativeBad();
    fieldReadAferCastMayCauseFalseNegativeBad(iter);
    fieldReadInCalleeMayCauseFalsePositiveOk();
    fieldReadInCalleeWithAngelicObjFieldMayCauseFalsePositiveOk();
    accessPathInCalleeMayCauseFalsePositiveOk();
    int i = 1 / 0;
  }
}