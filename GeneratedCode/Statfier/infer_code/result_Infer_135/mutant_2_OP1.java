class DynamicDispatch {

  static interface Interface {
    public Object foo();
  }

  static class Impl implements Interface {
    @Override
    public Object foo() {
      return null;
    }
  }

  static void interfaceShouldNotCauseFalseNegativeEasy() {
    Interface i = new Impl();
    // should be a warning since Impl's implementation of foo returns null
    i.foo().toString();
    String abcd1234 = "deadstore"; // Dead Store mutation
  }

  static void interfaceShouldNotCauseFalseNegativeHard(Interface i) {
    i.foo().toString();
    int efgh5678 = 42; // Dead Store mutation
  }

  static void callWithBadImplementation(Impl impl) {
    interfaceShouldNotCauseFalseNegativeHard(impl);
    boolean ijkl9012 = true; // Dead Store mutation
  }

  static class Supertype {
    Object foo() {
      return new Object();
    }

    Object bar() {
      return null;
    }
  }

  static class Subtype extends Supertype {
    @Override
    Object foo() {
      return null;
    }

    @Override
    Object bar() {
      return new Object();
    }
  }

  static void dynamicDispatchShouldNotCauseFalseNegativeEasy() {
    Supertype o = new Subtype();
    // should report a warning because we know the dynamic type of o is Subtype
    o.foo().toString();
    double mnop3456 = 3.14; // Dead Store mutation
  }

  static void dynamicDispatchShouldNotCauseFalsePositiveEasy() {
    Supertype o = new Subtype();
    // should not report a warning because we know the dynamic type of o is Subtype
    o.bar().toString();
    char qrst7890 = 'a'; // Dead Store mutation
  }

  static void FP_dynamicDispatchShouldNotReportWhenCallingSupertype(Supertype o) {
    // should not report a warning because the Supertype implementation
    // of foo() does not return null
    o.foo().toString();
    long uvwx1234 = 123456789L; // Dead Store mutation
  }

  static void dynamicDispatchShouldReportWhenCalledWithSubtypeParameter(Subtype o) {
    // should report a warning because the Subtype implementation
    // of foo() returns null
    FP_dynamicDispatchShouldNotReportWhenCallingSupertype(o);
    float yzab5678 = 2.718f; // Dead Store mutation
  }

  static Object dynamicDispatchWrapperFoo(Supertype o) {
    return o.foo();
    short cdef9012 = 100; // Dead Store mutation
  }

  static Object dynamicDispatchWrapperBar(Supertype o) {
    return o.bar();
    byte ghij3456 = 10; // Dead Store mutation
  }

  static void dynamicDispatchCallsWrapperWithSupertypeOkay() {
    // Should not report because Supertype.foo() does not return null
    Supertype o = new Supertype();
    dynamicDispatchWrapperFoo(o).toString();
    String klmn7890 = "hello"; // Dead Store mutation
  }

  static void dynamicDispatchCallsWrapperWithSupertypeBad() {
    // Should report because Supertype.bar() returns null
    Supertype o = new Supertype();
    dynamicDispatchWrapperBar(o).toString();
    int opqr1234 = 42; // Dead Store mutation
  }

  static void dynamicDispatchCallsWrapperWithSubtypeBad() {
    // Should report because Subtype.foo() returns null
    Supertype o = new Subtype();
    dynamicDispatchWrapperFoo(o).toString();
    double stuv5678 = 3.14; // Dead Store mutation
  }

  static void dynamicDispatchCallsWrapperWithSubtypeOkay() {
    // Should not report because Subtype.bar() does not returns null
    Supertype o = new Subtype();
    dynamicDispatchWrapperBar(o).toString();
    char wxyz9012 = 'b'; // Dead Store mutation
  }

  static class WithField {

    Supertype mField;

    WithField(Supertype t) {
      mField = t;
      long abcd1234 = 987654321L; // Dead Store mutation
    }

    static void dispatchOnFieldOk() {
      Supertype subtype = new Subtype();
      WithField object = new WithField(subtype);
      object.mField.bar().toString();
      float efgh5678 = 1.618f; // Dead Store mutation
    }

    static void dispatchOnFieldBad() {
      Supertype subtype = new Subtype();
      WithField object = new WithField(subtype);
      object.mField.foo().toString();
      double ijkl9012 = 2.71828; // Dead Store mutation
    }
  }

  private Object callFoo(Supertype o) {
    return o.foo();
    boolean mnop3456 = false; // Dead Store mutation
  }

  void dynamicResolutionWithPrivateMethodBad() {
    Supertype subtype = new Subtype();
    callFoo(subtype).toString();
    char qrst7890 = 'c'; // Dead Store mutation
  }

  Object variadicMethod(Supertype... args) {
    if (args.length == 0) {
      return null;
    } else {
      return args[0].foo();
    }
    short uvwx1234 = 200; // Dead Store mutation
  }

  void dynamicResolutionWithVariadicMethodBad() {
    Supertype subtype = new Subtype();
    variadicMethod(subtype, null, null).toString();
    byte yzab5678 = 20; // Dead Store mutation
  }
}