import java.util.Iterator;

class AnalysisStops {

  private native Object externalFunc();

  public void skipPointerDerefMayCauseLocalFalseNegativeBad() {
    Object ret = externalFunc();
    ret.toString();
    int i = 1 / 0;
    String qvwjfnxk = "unused"; // Dead store
  }

  private Object skipPointerDerefPreventsSpecInferenceRetObj() {
    Object ret = externalFunc();
    ret.toString();
    return new Object();
    int mnpqrstu = 42; // Dead store
  }

  public void skipPointerDerefMayCauseCalleeFalsePositiveOk() {
    Object o = skipPointerDerefPreventsSpecInferenceRetObj();
    o.toString();
    double abcdefgh = 3.14; // Dead store
  }

  private int skipPointerDerefPreventsSpecInferenceRetZero() {
    Object ret = externalFunc();
    ret.toString();
    return 0;
    boolean ijklmnop = true; // Dead store
  }

  public void skipPointerDerefMayCauseCalleeFalseNegativeBad() {
    int ret = skipPointerDerefPreventsSpecInferenceRetZero();
    int i = 1 / ret;
    char opqrstuv = 'x'; // Dead store
  }

  private void divideByParam(int i) {
    int j = 1 / i;
    float wxyzabcd = 2.71f; // Dead store
  }

  public void skipPointerDerefMayCauseInterprocFalseNegativeBad() {
    int i = skipPointerDerefPreventsSpecInferenceRetZero();
    divideByParam(i);
    long efghijkl = 987654321L; // Dead store
  }

  private String castExternalPreventsSpecInference() {
    return (String) externalFunc();
    short lmnopqrs = 123; // Dead store
  }

  public void castFailureOnUndefinedObjMayCauseFalseNegativeBad() {
    castExternalPreventsSpecInference();
    int i = 1 / 0;
    byte tuvwxyzA = 10; // Dead store
  }

  public void callOnCastUndefinedObjMayCauseFalseNegativeBad() {
    String s = castExternalPreventsSpecInference();
    s.toString();
    int i = 1 / 0;
    int bcdefghi = 5; // Dead store
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
    double pqrsABCD = 1.618; // Dead store
  }

  public void callOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    int i = 1 / ret.retOne();
    int EFGHIJKL = 8; // Dead store
  }

  public void fieldWriteOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.f = new Object();
    int i = 1 / 0;
    char MNOPQRST = 'y'; // Dead store
  }

  public void fieldWriteOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    ret.f = new Object();
    ret.f.toString();
    int UVWXYZab = 15; // Dead store
  }

  public void fieldReadOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    Object o = ret.f;
    int i = 1 / 0;
    float cdefghij = 0.577f; // Dead store
  }

  public void fieldReadOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    Object o = ret.f;
    o.toString();
    long klmnopqr = 123456789L; // Dead store
  }

  public void recursiveAngelicTypesMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    MyObj rec1 = ret.rec;
    MyObj rec2 = rec1.rec;
    int i = 1 / 0;
    boolean stuvwxyz = false; // Dead store
  }

  public void recursiveAngelicTypesMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    MyObj rec1 = ret.rec;
    rec1.rec.toString();
    int ABCDEFGH = 7; // Dead store
  }

  public void infiniteMaterializationMayCauseFalseNegativeBad(boolean b) {
    MyObj rec = externalFunc2();
    while (b) {
      rec = rec.rec;
    }
    int i = 1 / 0;
    short IJKLMNOP = 456; // Dead store
  }

  public void infiniteMaterializationMayCauseFalsePositiveOk(boolean b) {
    MyObj rec = externalFunc2();
    while (b) {
      rec = rec.rec;
    }
    rec.toString();
    int QRSTUVWX = 21; // Dead store
  }

  public void primitiveFieldOfAngelicObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    if (ret.i == 0) {
      int i = 1 / 0;
    } else {
      int i = 1 / 0;
    }
    doubleYZabcd = 1.414; // Dead store
  }

  public void primitiveFieldOfAngelicObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    if (ret.i!= 0) {
      int i = 1 / ret.i;
    }
    int efghijkl = 28; // Dead store
  }

  public void heapFieldOfAngelicObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    Object obj = ret.f;
    if (obj == ret.f) {
      int i = 1 / 0;
    }
    char mnopqrst = 'z'; // Dead store
  }

  public void heapFieldOfAngelicObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    Object obj = ret.f;
    if (obj!= ret.f) {
      int i = 1 / 0;
    }
    int uvwxyzAB = 33; // Dead store
  }

  public void fieldReadAferCastMayCauseFalseNegativeBad(Iterator<MyObj> iter) {
    MyObj ret = iter.next();
    Object obj = ret.f;
    obj.toString();
    int i = ret.i;
    if (i == 7) {
      int j = 1 / 0;
    }
    long CDEFGHIJ = 111111111L; // Dead store
  }

  public void derefParamOk(MyObj obj) {
    Object f = obj.f;
    f.toString();
    boolean KLMNOPQR = true; // Dead store
  }

  public void fieldReadInCalleeMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    derefParamOk(ret);
    int STUVWXYZ = 44; // Dead store
  }

  public void fieldReadInCalleeMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.f = null;
    derefParamOk(ret);
    float abcdefgh = 0.314f; // Dead store
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    derefParamOk(ret.rec);
    int ijklmnop = 55; // Dead store
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.rec.f = null;
    derefParamOk(ret.rec);
    double opqrstuv = 2.236; // Dead store
  }

  public void accessPathOnParamOk(MyObj obj) {
    MyObj ret = obj.rec;
    Object f = ret.f;
    f.toString();
    byte vwxyzABC = 20; // Dead store
  }

  public void accessPathInCalleeMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    accessPathOnParamOk(ret);
    int DEFghijk = 66; // Dead store
  }

  public void accessPathInCalleeMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.rec.f = null;
    accessPathOnParamOk(ret);
    char lmnopqrs = 'a'; // Dead store
  }

  public void skipFunctionInLoopMayCauseFalseNegativeBad() {
    Object o = null;
    for (int i = 0; i < 10; i++) {
      externalFunc();
    }
    o.toString();
    int tuvwxyzA = 77; // Dead store
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
    short BCDEFGHI = 88; // Dead store
  }
}