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
  }

  static void interfaceShouldNotCauseFalseNegativeHard(Interface x) {
    x.foo().toString();
  }

  static void callWithBadImplementation(Impl y) {
    interfaceShouldNotCauseFalseNegativeHard(y);
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
    Supertype z = new Subtype();
    // should report a warning because we know the dynamic type of o is Subtype
    z.foo().toString();
  }

  static void dynamicDispatchShouldNotCauseFalsePositiveEasy() {
    Supertype w = new Subtype();
    // should not report a warning because we know the dynamic type of o is Subtype
    w.bar().toString();
  }

  static void FP_dynamicDispatchShouldNotReportWhenCallingSupertype(Supertype v) {
    // should not report a warning because the Supertype implementation
    // of foo() does not return null
    v.foo().toString();
  }

  static void dynamicDispatchShouldReportWhenCalledWithSubtypeParameter(Subtype u) {
    // should report a warning because the Subtype implementation
    // of foo() returns null
    FP_dynamicDispatchShouldNotReportWhenCallingSupertype(u);
  }

  static Object dynamicDispatchWrapperFoo(Supertype t) {
    return t.foo();
  }

  static Object dynamicDispatchWrapperBar(Supertype s) {
    return s.bar();
  }

  static void dynamicDispatchCallsWrapperWithSupertypeOkay() {
    // Should not report because Supertype.foo() does not return null
    Supertype r = new Supertype();
    dynamicDispatchWrapperFoo(r).toString();
  }

  static void dynamicDispatchCallsWrapperWithSupertypeBad() {
    // Should report because Supertype.bar() returns null
    Supertype q = new Supertype();
    dynamicDispatchWrapperBar(q).toString();
  }

  static void dynamicDispatchCallsWrapperWithSubtypeBad() {
    // Should report because Subtype.foo() returns null
    Supertype p = new Subtype();
    dynamicDispatchWrapperFoo(p).toString();
  }

  static void dynamicDispatchCallsWrapperWithSubtypeOkay() {
    // Should not report because Subtype.bar() does not returns null
    Supertype o = new Subtype();
    dynamicDispatchWrapperBar(o).toString();
  }

  static class WithField {

    Supertype mField;

    WithField(Supertype n) {
      mField = n;
    }

    static void dispatchOnFieldOk() {
      Supertype m = new Subtype();
      WithField l = new WithField(m);
      l.mField.bar().toString();
    }

    static void dispatchOnFieldBad() {
      Supertype k = new Subtype();
      WithField j = new WithField(k);
      j.mField.foo().toString();
    }
  }

  private Object callFoo(Supertype i) {
    return i.foo();
  }

  void dynamicResolutionWithPrivateMethodBad() {
    Supertype h = new Subtype();
    callFoo(h).toString();
  }

  Object variadicMethod(Supertype... g) {
    if (g.length == 0) {
      return null;
    } else {
      return g[0].foo();
    }
  }

  void dynamicResolutionWithVariadicMethodBad() {
    Supertype f = new Subtype();
    variadicMethod(f, null, null).toString();
  }
}