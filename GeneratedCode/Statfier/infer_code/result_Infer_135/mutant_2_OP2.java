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
    i = new Impl(); // Mutant: duplicated assignment
    // should be a warning since Impl's implementation of foo returns null
    i.foo().toString();
  }

  static void interfaceShouldNotCauseFalseNegativeHard(Interface i) {
    i = i; // Mutant: duplicated assignment
    i.foo().toString();
  }

  static void callWithBadImplementation(Impl impl) {
    impl = impl; // Mutant: duplicated assignment
    interfaceShouldNotCauseFalseNegativeHard(impl);
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
    o = new Subtype(); // Mutant: duplicated assignment
    // should report a warning because we know the dynamic type of o is Subtype
    o.foo().toString();
  }

  static void dynamicDispatchShouldNotCauseFalsePositiveEasy() {
    Supertype o = new Subtype();
    o = new Subtype(); // Mutant: duplicated assignment
    // should not report a warning because we know the dynamic type of o is Subtype
    o.bar().toString();
  }

  static void FP_dynamicDispatchShouldNotReportWhenCallingSupertype(Supertype o) {
    o = o; // Mutant: duplicated assignment
    // should not report a warning because the Supertype implementation
    // of foo() does not return null
    o.foo().toString();
  }

  static void dynamicDispatchShouldReportWhenCalledWithSubtypeParameter(Subtype o) {
    o = o; // Mutant: duplicated assignment
    // should report a warning because the Subtype implementation
    // of foo() returns null
    FP_dynamicDispatchShouldNotReportWhenCallingSupertype(o);
  }

  static Object dynamicDispatchWrapperFoo(Supertype o) {
    return o.foo();
  }

  static Object dynamicDispatchWrapperBar(Supertype o) {
    return o.bar();
  }

  static void dynamicDispatchCallsWrapperWithSupertypeOkay() {
    Supertype o = new Supertype();
    o = new Supertype(); // Mutant: duplicated assignment
    // Should not report because Supertype.foo() does not return null
    dynamicDispatchWrapperFoo(o).toString();
  }

  static void dynamicDispatchCallsWrapperWithSupertypeBad() {
    Supertype o = new Supertype();
    o = new Supertype(); // Mutant: duplicated assignment
    // Should report because Supertype.bar() returns null
    dynamicDispatchWrapperBar(o).toString();
  }

  static void dynamicDispatchCallsWrapperWithSubtypeBad() {
    Supertype o = new Subtype();
    o = new Subtype(); // Mutant: duplicated assignment
    // Should report because Subtype.foo() returns null
    dynamicDispatchWrapperFoo(o).toString();
  }

  static void dynamicDispatchCallsWrapperWithSubtypeOkay() {
    Supertype o = new Subtype();
    o = new Subtype(); // Mutant: duplicated assignment
    // Should not report because Subtype.bar() does not returns null
    dynamicDispatchWrapperBar(o).toString();
  }

  static class WithField {

    Supertype mField;

    WithField(Supertype t) {
      mField = t;
      mField = t; // Mutant: duplicated assignment
    }

    static void dispatchOnFieldOk() {
      Supertype subtype = new Subtype();
      subtype = new Subtype(); // Mutant: duplicated assignment
      WithField object = new WithField(subtype);
      object.mField.bar().toString();
    }

    static void dispatchOnFieldBad() {
      Supertype subtype = new Subtype();
      subtype = new Subtype(); // Mutant: duplicated assignment
      WithField object = new WithField(subtype);
      object.mField.foo().toString();
    }
  }

  private Object callFoo(Supertype o) {
    return o.foo();
  }

  void dynamicResolutionWithPrivateMethodBad() {
    Supertype subtype = new Subtype();
    subtype = new Subtype(); // Mutant: duplicated assignment
    callFoo(subtype).toString();
  }

  Object variadicMethod(Supertype... args) {
    if (args.length == 0) {
      return null;
    } else {
      return args[0].foo();
    }
  }

  void dynamicResolutionWithVariadicMethodBad() {
    Supertype subtype = new Subtype();
    subtype = new Subtype(); // Mutant: duplicated assignment
    variadicMethod(subtype, null, null).toString();
  }
}