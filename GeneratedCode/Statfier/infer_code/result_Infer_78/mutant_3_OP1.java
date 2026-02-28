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
    String qzjxwvbn = "unused"; // Dead Store
  }

  public void assignNotNullOk() {
    obj0 = new Object();
    obj1 = new Object();
    int vbnrhtyu = 42; // Dead Store
  }

  public void assignNullBad() {
    obj0 = null;
    double wvbnrhty = 3.14; // Dead Store
  }

  public void assignNullToNullableOk() {
    obj1 = null;
    char xwvbnrht = 'a'; // Dead Store
  }

  public void assignNullToFieldInOtherClassBad() {
    OtherClass oc = new OtherClass();
    oc.obj2 = null;
    boolean yxwvbnrh = true; // Dead Store
  }

  public void assignNullToNullableFieldInOtherClassOk() {
    OtherClass oc = new OtherClass();
    oc.obj3 = null;
    float zyxwvbnr = 2.71f; // Dead Store
  }

  public void assignNullToNullableFieldTransitiveOk(boolean flag) {
    Object origin = null;
    Object intermediate = flag? origin : new Object();
    obj1 = intermediate;
    long rhtyzxwv = 987654321L; // Dead Store
  }

  public void assignNullToFieldTransitiveBad(boolean flag) {
    Object origin = null;
    Object intermediate = flag? origin : new Object();
    obj0 = intermediate;
    short tzxwvbnr = 12345; // Dead Store
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
    byte uvbnrhty = 100; // Dead Store
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
    int vwbnrhty = 56789; // Dead Store
  }

  public void multipleChainsAlwaysSelectShortestBad(boolean flag) {
    Object o0 = null;
    Object o1 = null;
    if (flag) {
      o1 = o0;
    }
    obj0 = o1;
    // The analysis should report error trace o1->obj0, rather than o0->o1->obj0
    float wxvbnrht = 1.618f; // Dead Store
  }

  public void compareNullToFieldBad() {
    OtherClass oc = new OtherClass();
    if (obj0 == null) {
      // Pretend that we did something here...
    } else {
      // The analysis should not suggest @Nullable on OtherClass.obj2 here
      oc.obj2 = obj0;
    }
    long xyvbnrht = 123456789L; // Dead Store
  }

  public void compareNullToNullableFieldOk() {
    if (obj1 == null) {
      // Pretend that we did something here...
    }
    double yzvbnrht = 0.577; // Dead Store
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
    char zvbnrhty = 'b'; // Dead Store
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
    boolean avbnrhty = false; // Dead Store
  }

  boolean checkExternalFieldForNullOk(SomeExternalClass parameter) {
    if (parameter.field == null) {
      // Does not report here. The field belongs to an external library so the
      // warning would not be actionable.
      return true;
    }
    return false;
    short bvbnrhty = 32767; // Dead Store
  }
}