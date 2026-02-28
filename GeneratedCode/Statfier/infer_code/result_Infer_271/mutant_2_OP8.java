import java.util.Iterator;

class AnalysisStops {

  private native Object externalFunc();

  public void skipPointerDerefMayCauseLocalFalseNegativeBad() {
    Object ret = externalFunc();
    ret.toString();
    int i = 1 / 0;
  }

  private Object skipPointerDerefPreventsSpecInferenceRetObj() {
    Object ret = externalFunc();
    ret.toString();
    return new Object();
  }

  public void skipPointerDerefMayCauseCalleeFalsePositiveOk() {
    Object o = skipPointerDerefPreventsSpecInferenceRetObj();
    o.toString();
  }

  private int skipPointerDerefPreventsSpecInferenceRetZero() {
    Object ret = externalFunc();
    ret.toString();
    return 0;
  }

  public void skipPointerDerefMayCauseCalleeFalseNegativeBad() {
    int ret = skipPointerDerefPreventsSpecInferenceRetZero();
    int i = 1 / ret;
  }

  private void divideByParam(int i) {
    int j = 1 / i;
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
    MyObj ret = externalFunc2();
    int i = 1 / ret.retZero();
  }

  public void callOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    int i = 1 / ret.retOne();
  }

  public void fieldWriteOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.f = new Object();
    int i = 1 / 0;
  }

  public void fieldWriteOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    ret.f = new Object();
    ret.f.toString();
  }

  public void fieldReadOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    Object o = ret.f;
    int i = 1 / 0;
  }

  public void fieldReadOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    Object o = ret.f;
    o.toString();
  }

  public void recursiveAngelicTypesMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    MyObj rec1 = ret.rec;
    MyObj rec2 = rec1.rec;
    int i = 1 / 0;
  }

  public void recursiveAngelicTypesMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    MyObj rec1 = ret.rec;
    rec1.rec.toString();
  }

  public void infiniteMaterializationMayCauseFalseNegativeBad(boolean b) {
    MyObj rec = externalFunc2();
    while (b) {
      rec = rec.rec;
    }
    int i = 1 / 0;
  }

  public void infiniteMaterializationMayCauseFalsePositiveOk(boolean b) {
    MyObj rec = externalFunc2();
    while (b) {
      rec = rec.rec;
    }
    rec.toString();
  }

  public void primitiveFieldOfAngelicObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    if (ret.i == 0) {
      int i = 1 / 0;
    } else {
      int i = 1 / 0;
    }
  }

  public void primitiveFieldOfAngelicObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    if (ret.i!= 0) {
      int i = 1 / ret.i;
    }
  }

  public void heapFieldOfAngelicObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    Object obj = ret.f;
    if (obj == ret.f) {
      int i = 1 / 0;
    }
  }

  public void heapFieldOfAngelicObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    Object obj = ret.f;
    if (obj!= ret.f) {
      int i = 1 / 0;
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
  }

  public void derefParamOk(MyObj obj) {
    Object f = obj.f;
    f.toString();
  }

  public void fieldReadInCalleeMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    derefParamOk(ret);
  }

  public void fieldReadInCalleeMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.f = null;
    derefParamOk(ret);
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    derefParamOk(ret.rec);
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.rec.f = null;
    derefParamOk(ret.rec);
  }

  public void accessPathOnParamOk(MyObj obj) {
    MyObj ret = obj.rec;
    Object f = ret.f;
    f.toString();
  }

  public void accessPathInCalleeMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    accessPathOnParamOk(ret);
  }

  public void accessPathInCalleeMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.rec.f = null;
    accessPathOnParamOk(ret);
  }

  public void skipFunctionInLoopMayCauseFalseNegativeBad() {
    Object o = null;
    for (int i = 0; i < 10; i++) {
      externalFunc();
    }
    o.toString();
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

  // Mutated code
  public void skipPointerDerefMayCauseLocalFalseNegativeBadMutant() {
    Object x = externalFunc();
    x.toString();
    int y = 1 / 0;
  }

  private Object skipPointerDerefPreventsSpecInferenceRetObjMutant() {
    Object x = externalFunc();
    x.toString();
    return new Object();
  }

  public void skipPointerDerefMayCauseCalleeFalsePositiveOkMutant() {
    Object z = skipPointerDerefPreventsSpecInferenceRetObjMutant();
    z.toString();
  }

  private int skipPointerDerefPreventsSpecInferenceRetZeroMutant() {
    Object x = externalFunc();
    x.toString();
    return 0;
  }

  public void skipPointerDerefMayCauseCalleeFalseNegativeBadMutant() {
    int x = skipPointerDerefPreventsSpecInferenceRetZeroMutant();
    int y = 1 / x;
  }

  private void divideByParamMutant(int x) {
    int y = 1 / x;
  }

  public void skipPointerDerefMayCauseInterprocFalseNegativeBadMutant() {
    int x = skipPointerDerefPreventsSpecInferenceRetZeroMutant();
    divideByParamMutant(x);
  }

  private String castExternalPreventsSpecInferenceMutant() {
    return (String) externalFunc();
  }

  public void castFailureOnUndefinedObjMayCauseFalseNegativeBadMutant() {
    castExternalPreventsSpecInferenceMutant();
    int x = 1 / 0;
  }

  public void callOnCastUndefinedObjMayCauseFalseNegativeBadMutant() {
    String y = castExternalPreventsSpecInferenceMutant();
    y.toString();
    int x = 1 / 0;
  }

  private static class MyObjMutant {
    Object g;
    MyObjMutant h;
    int j;

    public int retOneMutant() {
      return 1;
    }

    public int retZeroMutant() {
      return 0;
    }
  }

  private native MyObjMutant externalFunc2Mutant();

  public void callOnUndefinedObjMayCauseFalseNegativeBadMutant() {
    MyObjMutant x = externalFunc2Mutant();
    int y = 1 / x.retZeroMutant();
  }

  public void callOnUndefinedObjMayCauseFalsePositiveOkMutant() {
    MyObjMutant x = externalFunc2Mutant();
    int y = 1 / x.retOneMutant();
  }

  public void fieldWriteOnUndefinedObjMayCauseFalseNegativeBadMutant() {
    MyObjMutant x = externalFunc2Mutant();
    x.g = new Object();
    int y = 1 / 0;
  }

  public void fieldWriteOnUndefinedObjMayCauseFalsePositiveOkMutant() {
    MyObjMutant x = externalFunc2Mutant();
    x.g = new Object();
    x.g.toString();
  }

  public void fieldReadOnUndefinedObjMayCauseFalseNegativeBadMutant() {
    MyObjMutant x = externalFunc2Mutant();
    Object y = x.g;
    int z = 1 / 0;
  }

  public void fieldReadOnUndefinedObjMayCauseFalsePositiveOkMutant() {
    MyObjMutant x = externalFunc2Mutant();
    Object y = x.g;
    y.toString();
  }

  public void recursiveAngelicTypesMayCauseFalseNegativeBadMutant() {
    MyObjMutant x = externalFunc2Mutant();
    MyObjMutant y = x.h;
    MyObjMutant z = y.h;
    int w = 1 / 0;
  }

  public void recursiveAngelicTypesMayCauseFalsePositiveOkMutant() {
    MyObjMutant x = externalFunc2Mutant();
    MyObjMutant y = x.h;
    y.h.toString();
  }

  public void infiniteMaterializationMayCauseFalseNegativeBadMutant(boolean x) {
    MyObjMutant y = externalFunc2Mutant();
    while (x) {
      y = y.h;
    }
    int z = 1 / 0;
  }

  public void infiniteMaterializationMayCauseFalsePositiveOkMutant(boolean x) {
    MyObjMutant y = externalFunc2Mutant();
    while (x) {
      y = y.h;
    }
    y.toString();
  }

  public void primitiveFieldOfAngelicObjMayCauseFalseNegativeBadMutant() {
    MyObjMutant x = externalFunc2Mutant();
    if (x.j == 0) {
      int y = 1 / 0;
    } else {
      int y = 1 / 0;
    }
  }

  public void primitiveFieldOfAngelicObjMayCauseFalsePositiveOkMutant() {
    MyObjMutant x = externalFunc2Mutant();
    if (x.j!= 0) {
      int y = 1 / x.j;
    }
  }

  public void heapFieldOfAngelicObjMayCauseFalseNegativeBadMutant() {
    MyObjMutant x = externalFunc2Mutant();
    Object y = x.g;
    if (y == x.g) {
      int z = 1 / 0;
    }
  }

  public void heapFieldOfAngelicObjMayCauseFalsePositiveOkMutant() {
    MyObjMutant x = externalFunc2Mutant();
    Object y = x.g;
    if (y!= x.g) {
      int z = 1 / 0;
    }
  }

  public void fieldReadAferCastMayCauseFalseNegativeBadMutant(Iterator<MyObjMutant> x) {
    MyObjMutant y = x.next();
    Object z = y.g;
    z.toString();
    int w = y.j;
    if (w == 7) {
      int v = 1 / 0;
    }
  }

  public void derefParamOkMutant(MyObjMutant x) {
    Object y = x.g;
    y.toString();
  }

  public void fieldReadInCalleeMayCauseFalsePositiveOkMutant() {
    MyObjMutant x = externalFunc2Mutant();
    derefParamOkMutant(x);
  }

  public void fieldReadInCalleeMayCauseFalseNegativeBadMutant() {
    MyObjMutant x = externalFunc2Mutant();
    x.g = null;
    derefParamOkMutant(x);
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalsePositiveOkMutant() {
    MyObjMutant x = externalFunc2Mutant();
    derefParamOkMutant(x.h);
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalseNegativeBadMutant() {
    MyObjMutant x = externalFunc2Mutant();
    x.h.g = null;
    derefParamOkMutant(x.h);
  }

  public void accessPathOnParamOkMutant(MyObjMutant x) {
    MyObjMutant y = x.h;
    Object z = y.g;
    z.toString();
  }

  public void accessPathInCalleeMayCauseFalsePositiveOkMutant() {
    MyObjMutant x = externalFunc2Mutant();
    accessPathOnParamOkMutant(x);
  }

  public void accessPathInCalleeMayCauseFalseNegativeBadMutant() {
    MyObjMutant x = externalFunc2Mutant();
    x.h.g = null;
    accessPathOnParamOkMutant(x);
  }

  public void skipFunctionInLoopMayCauseFalseNegativeBadMutant() {
    Object x = null;
    for (int y = 0; y < 10; y++) {
      externalFunc();
    }
    x.toString();
  }

  // will fail to find error unless spec inference succeeds for all callees
  public void specInferenceMayFailAndCauseFalseNegativeBadMutant(boolean x, Iterator<MyObjMutant> y) {
    skipPointerDerefMayCauseLocalFalseNegativeBadMutant();
    skipPointerDerefPreventsSpecInferenceRetObjMutant();
    skipPointerDerefPreventsSpecInferenceRetZeroMutant();
    skipPointerDerefMayCauseCalleeFalseNegativeBadMutant();
    skipPointerDerefMayCauseInterprocFalseNegativeBadMutant();
    castFailureOnUndefinedObjMayCauseFalseNegativeBadMutant();
    callOnCastUndefinedObjMayCauseFalseNegativeBadMutant();
    callOnUndefinedObjMayCauseFalseNegativeBadMutant();
    callOnUndefinedObjMayCauseFalsePositiveOkMutant();
    fieldWriteOnUndefinedObjMayCauseFalseNegativeBadMutant();
    fieldWriteOnUndefinedObjMayCauseFalsePositiveOkMutant();
    fieldReadOnUndefinedObjMayCauseFalseNegativeBadMutant();
    fieldReadOnUndefinedObjMayCauseFalsePositiveOkMutant();
    recursiveAngelicTypesMayCauseFalseNegativeBadMutant();
    recursiveAngelicTypesMayCauseFalsePositiveOkMutant();
    infiniteMaterializationMayCauseFalseNegativeBadMutant(x);
    infiniteMaterializationMayCauseFalsePositiveOkMutant(x);
    primitiveFieldOfAngelicObjMayCauseFalsePositiveOkMutant();
    primitiveFieldOfAngelicObjMayCauseFalseNegativeBadMutant();
    heapFieldOfAngelicObjMayCauseFalsePositiveOkMutant();
    heapFieldOfAngelicObjMayCauseFalseNegativeBadMutant();
    fieldReadAferCastMayCauseFalseNegativeBadMutant(y);
    fieldReadInCalleeMayCauseFalsePositiveOkMutant();
    fieldReadInCalleeWithAngelicObjFieldMayCauseFalsePositiveOkMutant();
    accessPathInCalleeMayCauseFalsePositiveOkMutant();
    int z = 1 / 0;
  }
}