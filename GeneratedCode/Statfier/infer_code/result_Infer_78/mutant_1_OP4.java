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
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        obj0 = new Object();
      } else {
        obj0 = null;
      }
    }
  }

  public void assignNotNullOk() {
    obj0 = new Object();
    obj1 = new Object();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        obj0 = new Object();
      } else {
        obj0 = null;
      }
    }
  }

  public void assignNullBad() {
    obj0 = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        obj0 = new Object();
      } else {
        obj0 = null;
      }
    }
  }

  public void assignNullToNullableOk() {
    obj1 = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        obj1 = new Object();
      } else {
        obj1 = null;
      }
    }
  }

  public void assignNullToFieldInOtherClassBad() {
    OtherClass oc = new OtherClass();
    oc.obj2 = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        oc.obj2 = new Object();
      } else {
        oc.obj2 = null;
      }
    }
  }

  public void assignNullToNullableFieldInOtherClassOk() {
    OtherClass oc = new OtherClass();
    oc.obj3 = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        oc.obj3 = new Object();
      } else {
        oc.obj3 = null;
      }
    }
  }

  public void assignNullToNullableFieldTransitiveOk(boolean flag) {
    Object origin = null;
    Object intermediate = flag? origin : new Object();
    obj1 = intermediate;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        obj1 = new Object();
      } else {
        obj1 = null;
      }
    }
  }

  public void assignNullToFieldTransitiveBad(boolean flag) {
    Object origin = null;
    Object intermediate = flag? origin : new Object();
    obj0 = intermediate;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        obj0 = new Object();
      } else {
        obj0 = null;
      }
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
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        obj1 = new Object();
      } else {
        obj1 = null;
      }
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
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        obj0 = new Object();
      } else {
        obj0 = null;
      }
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
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        obj0 = new Object();
      } else {
        obj0 = null;
      }
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
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        oc.obj2 = new Object();
      } else {
        oc.obj2 = null;
      }
    }
  }

  public void compareNullToNullableFieldOk() {
    if (obj1 == null) {
      // Pretend that we did something here...
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        obj1 = new Object();
      } else {
        obj1 = null;
      }
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
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        parameter = new Object();
      } else {
        parameter = null;
      }
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
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        parameter = new Object();
      } else {
        parameter = null;
      }
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
    return false; // This method can be modified to return dynamic values in a real scenario
  }
}