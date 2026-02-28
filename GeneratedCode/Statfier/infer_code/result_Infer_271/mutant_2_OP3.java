import java.util.Iterator;

class AnalysisStops {

  private native Object externalFunc();

  public void skipPointerDerefMayCauseLocalFalseNegativeBad() {
    Object ret = externalFunc();
    ret.toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      int unreachableVar = 1;
    }
    int i = 1 / 0;
  }

  private Object skipPointerDerefPreventsSpecInferenceRetObj() {
    Object ret = externalFunc();
    ret.toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      Object unreachableObj = new Object();
    }
    return new Object();
  }

  public void skipPointerDerefMayCauseCalleeFalsePositiveOk() {
    Object o = skipPointerDerefPreventsSpecInferenceRetObj();
    o.toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      o.toString();
    }
  }

  private int skipPointerDerefPreventsSpecInferenceRetZero() {
    Object ret = externalFunc();
    ret.toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      int unreachableInt = 0;
    }
    return 0;
  }

  public void skipPointerDerefMayCauseCalleeFalseNegativeBad() {
    int ret = skipPointerDerefPreventsSpecInferenceRetZero();
    int i = 1 / ret;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = 1 / 1;
    }
  }

  private void divideByParam(int i) {
    int j = 1 / i;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      j = 1 / 2;
    }
  }

  public void skipPointerDerefMayCauseInterprocFalseNegativeBad() {
    int i = skipPointerDerefPreventsSpecInferenceRetZero();
    divideByParam(i);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = 1 / 3;
    }
  }

  private String castExternalPreventsSpecInference() {
    return (String) externalFunc();
  }

  public void castFailureOnUndefinedObjMayCauseFalseNegativeBad() {
    castExternalPreventsSpecInference();
    int i = 1 / 0;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = 1 / 4;
    }
  }

  public void callOnCastUndefinedObjMayCauseFalseNegativeBad() {
    String s = castExternalPreventsSpecInference();
    s.toString();
    int i = 1 / 0;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = 1 / 5;
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = 1 / 6;
    }
  }

  public void callOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    int i = 1 / ret.retOne();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = 1 / 7;
    }
  }

  public void fieldWriteOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.f = new Object();
    int i = 1 / 0;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      ret.f.toString();
    }
  }

  public void fieldWriteOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    ret.f = new Object();
    ret.f.toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      ret.f.toString();
    }
  }

  public void fieldReadOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    Object o = ret.f;
    int i = 1 / 0;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      o.toString();
    }
  }

  public void fieldReadOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    Object o = ret.f;
    o.toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      o.toString();
    }
  }

  public void recursiveAngelicTypesMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    MyObj rec1 = ret.rec;
    MyObj rec2 = rec1.rec;
    int i = 1 / 0;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      rec2.toString();
    }
  }

  public void recursiveAngelicTypesMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    MyObj rec1 = ret.rec;
    rec1.rec.toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      rec1.toString();
    }
  }

  public void infiniteMaterializationMayCauseFalseNegativeBad(boolean b) {
    MyObj rec = externalFunc2();
    while (b) {
      rec = rec.rec;
    }
    int i = 1 / 0;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      rec.toString();
    }
  }

  public void infiniteMaterializationMayCauseFalsePositiveOk(boolean b) {
    MyObj rec = externalFunc2();
    while (b) {
      rec = rec.rec;
    }
    rec.toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      rec.toString();
    }
  }

  public void primitiveFieldOfAngelicObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    if (ret.i == 0) {
      int i = 1 / 0;
    } else {
      int i = 1 / 0;
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      ret.i = 1;
    }
  }

  public void primitiveFieldOfAngelicObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    if (ret.i!= 0) {
      int i = 1 / ret.i;
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      ret.i = 2;
    }
  }

  public void heapFieldOfAngelicObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    Object obj = ret.f;
    if (obj == ret.f) {
      int i = 1 / 0;
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj.toString();
    }
  }

  public void heapFieldOfAngelicObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    Object obj = ret.f;
    if (obj!= ret.f) {
      int i = 1 / 0;
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      obj.toString();
    }
  }

  public void fieldReadAferCastMayCauseFalseNegativeBad(Iterator<MyObj> iter) {
    MyObj ret = iter.next();
    Object obj = ret.f;
    obj.toString();
    int i = ret.i;
    if (i == 7) {
      int j = 1 / 0;
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = 8;
    }
  }

  public void derefParamOk(MyObj obj) {
    Object f = obj.f;
    f.toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f.toString();
    }
  }

  public void fieldReadInCalleeMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    derefParamOk(ret);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      ret.toString();
    }
  }

  public void fieldReadInCalleeMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.f = null;
    derefParamOk(ret);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      ret.toString();
    }
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    derefParamOk(ret.rec);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      ret.rec.toString();
    }
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.rec.f = null;
    derefParamOk(ret.rec);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      ret.rec.toString();
    }
  }

  public void accessPathOnParamOk(MyObj obj) {
    MyObj ret = obj.rec;
    Object f = ret.f;
    f.toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f.toString();
    }
  }

  public void accessPathInCalleeMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    accessPathOnParamOk(ret);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      ret.toString();
    }
  }

  public void accessPathInCalleeMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.rec.f = null;
    accessPathOnParamOk(ret);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      ret.toString();
    }
  }

  public void skipFunctionInLoopMayCauseFalseNegativeBad() {
    Object o = null;
    for (int i = 0; i < 10; i++) {
      externalFunc();
    }
    o.toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      o = new Object();
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = 9;
    }
  }

  private boolean getCondition() {
    return false; // This method can be modified to return true/false based on runtime conditions
  }
}