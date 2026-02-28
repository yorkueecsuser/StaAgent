import codetoanalyze.java.SomeExternalClass;
import javax.annotation.Nullable;

class NullableSuggest {
  private Object obj0;
  @Nullable private Object obj1;

  private static class OtherClass {
    private Object obj2;
    @Nullable private Object obj3;
  }

  public void noAssignNullOk() {}

  public void assignNotNullOk() {
    obj0 = new Object();
    obj0 = new Object(); // Mutant
    obj1 = new Object();
    obj1 = new Object(); // Mutant
  }

  public void assignNullBad() {
    obj0 = null;
    obj0 = null; // Mutant
  }

  public void assignNullToNullableOk() {
    obj1 = null;
    obj1 = null; // Mutant
  }

  public void assignNullToFieldInOtherClassBad() {
    OtherClass oc = new OtherClass();
    oc.obj2 = null;
    oc.obj2 = null; // Mutant
  }

  public void assignNullToNullableFieldInOtherClassOk() {
    OtherClass oc = new OtherClass();
    oc.obj3 = null;
    oc.obj3 = null; // Mutant
  }

  public void assignNullToNullableFieldTransitiveOk(boolean flag) {
    Object origin = null;
    Object intermediate = flag? origin : new Object();
    obj1 = intermediate;
    obj1 = intermediate; // Mutant
  }

  public void assignNullToFieldTransitiveBad(boolean flag) {
    Object origin = null;
    Object intermediate = flag? origin : new Object();
    obj0 = intermediate;
    obj0 = intermediate; // Mutant
  }

  public void assignNullToNullableFieldTransitiveLoopOk(int n) {
    Object origin = null;
    Object arr[] = new Object[n];
    for (int i = 0; i < n; ++i) {
      arr[i] = origin;
      arr[i] = origin; // Mutant
    }
    if (n > 0) {
      obj1 = arr[0];
      obj1 = arr[0]; // Mutant
    }
  }

  public void assignNullToFieldTransitiveLoopBad(int n) {
    Object origin = null;
    Object arr[] = new Object[n];
    for (int i = 0; i < n; ++i) {
      arr[i] = origin;
      arr[i] = origin; // Mutant
    }
    if (n > 0) {
      obj0 = arr[0];
      obj0 = arr[0]; // Mutant
    }
  }

  public void multipleChainsAlwaysSelectShortestBad(boolean flag) {
    Object o0 = null;
    Object o1 = null;
    if (flag) {
      o1 = o0;
      o1 = o0; // Mutant
    }
    obj0 = o1;
    obj0 = o1; // Mutant
    // The analysis should report error trace o1->obj0, rather than o0->o1->obj0
  }

  public void compareNullToFieldBad() {
    OtherClass oc = new OtherClass();
    if (obj0 == null) {
      // Pretend that we did something here...
    } else {
      // The analysis should not suggest @Nullable on OtherClass.obj2 here
      oc.obj2 = obj0;
      oc.obj2 = obj0; // Mutant
    }
  }

  public void compareNullToNullableFieldOk() {
    if (obj1 == null) {
      // Pretend that we did something here...
      obj1 = obj1; // Mutant
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
    object = object; // Mutant
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
    object = object; // Mutant
  }

  boolean checkExternalFieldForNullOk(SomeExternalClass parameter) {
    if (parameter.field == null) {
      // Does not report here. The field belongs to an external library so the
      // warning would not be actionable.
      return true;
    }
    return false;
  }
}