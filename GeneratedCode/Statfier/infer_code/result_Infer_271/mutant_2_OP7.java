import java.util.Iterator;

class AnalysisStops {

  private native Object externalFunc();

  public void skipPointerDerefMayCauseLocalFalseNegativeBad() {
    Object ret = externalFunc();
    ret.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
    int i = 1 / 0;
  }

  private Object skipPointerDerefPreventsSpecInferenceRetObj() {
    Object ret = externalFunc();
    ret.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
    return new Object();
  }

  public void skipPointerDerefMayCauseCalleeFalsePositiveOk() {
    Object o = skipPointerDerefPreventsSpecInferenceRetObj();
    o.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  private int skipPointerDerefPreventsSpecInferenceRetZero() {
    Object ret = externalFunc();
    ret.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
    return 0;
  }

  public void skipPointerDerefMayCauseCalleeFalseNegativeBad() {
    int ret = skipPointerDerefPreventsSpecInferenceRetZero();
    int i = 1 / ret;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  private void divideByParam(int i) {
    int j = 1 / i;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void skipPointerDerefMayCauseInterprocFalseNegativeBad() {
    int i = skipPointerDerefPreventsSpecInferenceRetZero();
    divideByParam(i);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  private String castExternalPreventsSpecInference() {
    return (String) externalFunc();
  }

  public void castFailureOnUndefinedObjMayCauseFalseNegativeBad() {
    castExternalPreventsSpecInference();
    int i = 1 / 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void callOnCastUndefinedObjMayCauseFalseNegativeBad() {
    String s = castExternalPreventsSpecInference();
    s.toString();
    int i = 1 / 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
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
    MyObj ret = externalFunc2();
    int i = 1 / ret.retZero();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void callOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    int i = 1 / ret.retOne();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void fieldWriteOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.f = new Object();
    int i = 1 / 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void fieldWriteOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    ret.f = new Object();
    ret.f.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void fieldReadOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    Object o = ret.f;
    int i = 1 / 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void fieldReadOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    Object o = ret.f;
    o.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void recursiveAngelicTypesMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    MyObj rec1 = ret.rec;
    MyObj rec2 = rec1.rec;
    int i = 1 / 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void recursiveAngelicTypesMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    MyObj rec1 = ret.rec;
    rec1.rec.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void infiniteMaterializationMayCauseFalseNegativeBad(boolean b) {
    MyObj rec = externalFunc2();
    while (b) {
      rec = rec.rec;
    }
    int i = 1 / 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void infiniteMaterializationMayCauseFalsePositiveOk(boolean b) {
    MyObj rec = externalFunc2();
    while (b) {
      rec = rec.rec;
    }
    rec.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void primitiveFieldOfAngelicObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    if (ret.i == 0) {
      int i = 1 / 0;
    } else {
      int i = 1 / 0;
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void primitiveFieldOfAngelicObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    if (ret.i!= 0) {
      int i = 1 / ret.i;
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void heapFieldOfAngelicObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    Object obj = ret.f;
    if (obj == ret.f) {
      int i = 1 / 0;
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void heapFieldOfAngelicObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    Object obj = ret.f;
    if (obj!= ret.f) {
      int i = 1 / 0;
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void fieldReadAferCastMayCauseFalseNegativeBad(Iterator<MyObj> iter) {
    MyObj ret = iter.next();
    Object obj = ret.f;
    obj.toString();
    int i = ret.i;
    if (i == 7) {
      int j = 1 / 0;
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void derefParamOk(MyObj obj) {
    Object f = obj.f;
    f.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void fieldReadInCalleeMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    derefParamOk(ret);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void fieldReadInCalleeMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.f = null;
    derefParamOk(ret);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    derefParamOk(ret.rec);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.rec.f = null;
    derefParamOk(ret.rec);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void accessPathOnParamOk(MyObj obj) {
    MyObj ret = obj.rec;
    Object f = ret.f;
    f.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void accessPathInCalleeMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    accessPathOnParamOk(ret);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void accessPathInCalleeMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.rec.f = null;
    accessPathOnParamOk(ret);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  public void skipFunctionInLoopMayCauseFalseNegativeBad() {
    Object o = null;
    for (int i = 0; i < 10; i++) {
      externalFunc();
    }
    o.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable loop */ }
  }

  private boolean getCondition() {
    return false;
  }
}