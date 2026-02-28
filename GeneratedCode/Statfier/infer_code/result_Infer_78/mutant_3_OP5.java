import codetoanalyze.java.SomeExternalClass;
import javax.annotation.Nullable;

class NullableSuggest {
  private Object obj0;
  @Nullable private Object obj1;

  private static class OtherClass {
    private Object obj2;
    @Nullable private Object obj3;
  }

  public void noAssignNullOk() {
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        obj0 = new Object();
        break;
    }
  }

  public void assignNotNullOk() {
    obj0 = new Object();
    obj1 = new Object();
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        obj0 = null;
        break;
    }
  }

  public void assignNullBad() {
    obj0 = null;
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        obj1 = new Object();
        break;
    }
  }

  public void assignNullToNullableOk() {
    obj1 = null;
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        obj0 = new Object();
        break;
    }
  }

  public void assignNullToFieldInOtherClassBad() {
    OtherClass oc = new OtherClass();
    oc.obj2 = null;
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        oc.obj3 = new Object();
        break;
    }
  }

  public void assignNullToNullableFieldInOtherClassOk() {
    OtherClass oc = new OtherClass();
    oc.obj3 = null;
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        oc.obj2 = new Object();
        break;
    }
  }

  public void assignNullToNullableFieldTransitiveOk(boolean flag) {
    Object origin = null;
    Object intermediate = flag? origin : new Object();
    obj1 = intermediate;
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        obj0 = new Object();
        break;
    }
  }

  public void assignNullToFieldTransitiveBad(boolean flag) {
    Object origin = null;
    Object intermediate = flag? origin : new Object();
    obj0 = intermediate;
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        obj1 = new Object();
        break;
    }
  }

  public void assignNullToNullableFieldTransitiveLoopOk(int n) {
    Object origin = null;
    Object arr[] = new Object[n];
    for (int i = 0; i < n; ++i) {
      arr[i] = origin;
    }
    if (n > 0) {
      obj1 = arr[0];
    }
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        obj0 = new Object();
        break;
    }
  }

  public void assignNullToFieldTransitiveLoopBad(int n) {
    Object origin = null;
    Object arr[] = new Object[n];
    for (int i = 0; i < n; ++i) {
      arr[i] = origin;
    }
    if (n > 0) {
      obj0 = arr[0];
    }
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        obj1 = new Object();
        break;
    }
  }

  public void multipleChainsAlwaysSelectShortestBad(boolean flag) {
    Object o0 = null;
    Object o1 = null;
    if (flag) {
      o1 = o0;
    }
    obj0 = o1;
    // The analysis should report error trace o1->obj0, rather than o0->o1->obj0
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        obj1 = new Object();
        break;
    }
  }

  public void compareNullToFieldBad() {
    OtherClass oc = new OtherClass();
    if (obj0 == null) {
      // Pretend that we did something here...
    } else {
      // The analysis should not suggest @Nullable on OtherClass.obj2 here
      oc.obj2 = obj0;
    }
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        oc.obj3 = new Object();
        break;
    }
  }

  public void compareNullToNullableFieldOk() {
    if (obj1 == null) {
      // Pretend that we did something here...
    }
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        obj0 = new Object();
        break;
    }
  }

  void methodWithCapturedNullableParameterOk(@Nullable Object parameter) {
    Object object =
        new Object() {
          void foo() {
            if (parameter!= null) {
              parameter.toString();
            }
          }
        };
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        parameter = new Object();
        break;
    }
  }

  void methodWithCapturednonNullableParameterBad_FN(Object parameter) {
    Object object =
        new Object() {
          void foo() {
            if (parameter!= null) {
              parameter.toString();
            }
          }
        };
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        parameter = null;
        break;
    }
  }

  boolean checkExternalFieldForNullOk(SomeExternalClass parameter) {
    if (parameter.field == null) {
      // Does not report here. The field belongs to an external library so the
      // warning would not be actionable.
      return true;
    }
    return false;
  }

  private boolean getCondition() {
    return false;
  }
}