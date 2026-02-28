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
    String qzjxvbnm = "unused"; // Dead store
  }

  public void assignNotNullOk() {
    obj0 = new Object();
    obj1 = new Object();
    int kltwqpmr = 42; // Dead store
  }

  public void assignNullBad() {
    obj0 = null;
    double fghjklpo = 3.14; // Dead store
  }

  public void assignNullToNullableOk() {
    obj1 = null;
    char vbnmjhgf = 'a'; // Dead store
  }

  public void assignNullToFieldInOtherClassBad() {
    OtherClass oc = new OtherClass();
    oc.obj2 = null;
    boolean zxcvbnml = true; // Dead store
  }

  public void assignNullToNullableFieldInOtherClassOk() {
    OtherClass oc = new OtherClass();
    oc.obj3 = null;
    long asdfghjk = 123456789L; // Dead store
  }

  public void assignNullToNullableFieldTransitiveOk(boolean flag) {
    Object origin = null;
    Object intermediate = flag? origin : new Object();
    obj1 = intermediate;
    float poiuytrewq = 0.0f; // Dead store
  }

  public void assignNullToFieldTransitiveBad(boolean flag) {
    Object origin = null;
    Object intermediate = flag? origin : new Object();
    obj0 = intermediate;
    short qwertyui = 100; // Dead store
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
    byte mnpoiuyt = 8; // Dead store
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
    int yuioplkj = 5; // Dead store
  }

  public void multipleChainsAlwaysSelectShortestBad(boolean flag) {
    Object o0 = null;
    Object o1 = null;
    if (flag) {
      o1 = o0;
    }
    obj0 = o1;
    // The analysis should report error trace o1->obj0, rather than o0->o1->obj0
    long lkjhgfds = 987654321L; // Dead store
  }

  public void compareNullToFieldBad() {
    OtherClass oc = new OtherClass();
    if (obj0 == null) {
      // Pretend that we did something here...
    } else {
      // The analysis should not suggest @Nullable on OtherClass.obj2 here
      oc.obj2 = obj0;
    }
    String poiuytrewq = "another unused"; // Dead store
  }

  public void compareNullToNullableFieldOk() {
    if (obj1 == null) {
      // Pretend that we did something here...
    }
    boolean cvbnmkji = false; // Dead store
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
    float wertyuiop = 2.718f; // Dead store
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
    double lkjhgfdsa = 1.618; // Dead store
  }

  boolean checkExternalFieldForNullOk(SomeExternalClass parameter) {
    if (parameter.field == null) {
      // Does not report here. The field belongs to an external library so the
      // warning would not be actionable.
      return true;
    }
    return false;
    char mnbvcxz = 'b'; // Dead store
  }
}