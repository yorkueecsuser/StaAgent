import java.util.Iterator;

class AnalysisStops {

  private native Object externalFunc();

  public void skipPointerDerefMayCauseLocalFalseNegativeBad() {
    Object ret = externalFunc();
    ret.toString();
    int i = 1 / 0;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  private Object skipPointerDerefPreventsSpecInferenceRetObj() {
    Object ret = externalFunc();
    ret.toString();
    return new Object();
  }

  public void skipPointerDerefMayCauseCalleeFalsePositiveOk() {
    Object o = skipPointerDerefPreventsSpecInferenceRetObj();
    o.toString();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  private int skipPointerDerefPreventsSpecInferenceRetZero() {
    Object ret = externalFunc();
    ret.toString();
    return 0;
  }

  public void skipPointerDerefMayCauseCalleeFalseNegativeBad() {
    int ret = skipPointerDerefPreventsSpecInferenceRetZero();
    int i = 1 / ret;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  private void divideByParam(int i) {
    int j = 1 / i;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void skipPointerDerefMayCauseInterprocFalseNegativeBad() {
    int i = skipPointerDerefPreventsSpecInferenceRetZero();
    divideByParam(i);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  private String castExternalPreventsSpecInference() {
    return (String) externalFunc();
  }

  public void castFailureOnUndefinedObjMayCauseFalseNegativeBad() {
    castExternalPreventsSpecInference();
    int i = 1 / 0;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void callOnCastUndefinedObjMayCauseFalseNegativeBad() {
    String s = castExternalPreventsSpecInference();
    s.toString();
    int i = 1 / 0;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
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
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void callOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    int i = 1 / ret.retOne();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void fieldWriteOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.f = new Object();
    int i = 1 / 0;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void fieldWriteOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    ret.f = new Object();
    ret.f.toString();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void fieldReadOnUndefinedObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    Object o = ret.f;
    int i = 1 / 0;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void fieldReadOnUndefinedObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    Object o = ret.f;
    o.toString();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void recursiveAngelicTypesMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    MyObj rec1 = ret.rec;
    MyObj rec2 = rec1.rec;
    int i = 1 / 0;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void recursiveAngelicTypesMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    MyObj rec1 = ret.rec;
    rec1.rec.toString();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void infiniteMaterializationMayCauseFalseNegativeBad(boolean b) {
    MyObj rec = externalFunc2();
    while (b) {
      rec = rec.rec;
    }
    int i = 1 / 0;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void infiniteMaterializationMayCauseFalsePositiveOk(boolean b) {
    MyObj rec = externalFunc2();
    while (b) {
      rec = rec.rec;
    }
    rec.toString();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
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
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void primitiveFieldOfAngelicObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    if (ret.i!= 0) {
      int i = 1 / ret.i;
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void heapFieldOfAngelicObjMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    Object obj = ret.f;
    if (obj == ret.f) {
      int i = 1 / 0;
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void heapFieldOfAngelicObjMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    Object obj = ret.f;
    if (obj!= ret.f) {
      int i = 1 / 0;
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
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
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void derefParamOk(MyObj obj) {
    Object f = obj.f;
    f.toString();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void fieldReadInCalleeMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    derefParamOk(ret);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void fieldReadInCalleeMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.f = null;
    derefParamOk(ret);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    derefParamOk(ret.rec);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void fieldReadInCalleeWithAngelicObjFieldMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.rec.f = null;
    derefParamOk(ret.rec);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void accessPathOnParamOk(MyObj obj) {
    MyObj ret = obj.rec;
    Object f = ret.f;
    f.toString();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void accessPathInCalleeMayCauseFalsePositiveOk() {
    MyObj ret = externalFunc2();
    accessPathOnParamOk(ret);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void accessPathInCalleeMayCauseFalseNegativeBad() {
    MyObj ret = externalFunc2();
    ret.rec.f = null;
    accessPathOnParamOk(ret);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public void skipFunctionInLoopMayCauseFalseNegativeBad() {
    Object o = null;
    for (int i = 0; i < 10; i++) {
      externalFunc();
    }
    o.toString();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
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
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, but it is not a compile-time constant
  }
}