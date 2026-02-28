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
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    i.foo().toString();
  }

  static void interfaceShouldNotCauseFalseNegativeHard(Interface i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    i.foo().toString();
  }

  static void callWithBadImplementation(Impl impl) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
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
    // should report a warning because we know the dynamic type of o is Subtype
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    o.foo().toString();
  }

  static void dynamicDispatchShouldNotCauseFalsePositiveEasy() {
    Supertype o = new Subtype();
    // should not report a warning because we know the dynamic type of o is Subtype
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    o.bar().toString();
  }

  static void FP_dynamicDispatchShouldNotReportWhenCallingSupertype(Supertype o) {
    // should not report a warning because the Supertype implementation
    // of foo() does not return null
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    o.foo().toString();
  }

  static void dynamicDispatchShouldReportWhenCalledWithSubtypeParameter(Subtype o) {
    // should report a warning because the Subtype implementation
    // of foo() returns null
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    FP_dynamicDispatchShouldNotReportWhenCallingSupertype(o);
  }

  static Object dynamicDispatchWrapperFoo(Supertype o) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    return o.foo();
  }

  static Object dynamicDispatchWrapperBar(Supertype o) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    return o.bar();
  }

  static void dynamicDispatchCallsWrapperWithSupertypeOkay() {
    // Should not report because Supertype.foo() does not return null
    Supertype o = new Supertype();
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    dynamicDispatchWrapperFoo(o).toString();
  }

  static void dynamicDispatchCallsWrapperWithSupertypeBad() {
    // Should report because Supertype.bar() returns null
    Supertype o = new Supertype();
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    dynamicDispatchWrapperBar(o).toString();
  }

  static void dynamicDispatchCallsWrapperWithSubtypeBad() {
    // Should report because Subtype.foo() returns null
    Supertype o = new Subtype();
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    dynamicDispatchWrapperFoo(o).toString();
  }

  static void dynamicDispatchCallsWrapperWithSubtypeOkay() {
    // Should not report because Subtype.bar() does not returns null
    Supertype o = new Subtype();
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    dynamicDispatchWrapperBar(o).toString();
  }

  static class WithField {

    Supertype mField;

    WithField(Supertype t) {
      mField = t;
    }

    static void dispatchOnFieldOk() {
      Supertype subtype = new Subtype();
      WithField object = new WithField(subtype);
      boolean conditionFor = getCondition();
      for (int j = 0; conditionFor; j++) {
        // Unreachable for loop
      }
      object.mField.bar().toString();
    }

    static void dispatchOnFieldBad() {
      Supertype subtype = new Subtype();
      WithField object = new WithField(subtype);
      boolean conditionFor = getCondition();
      for (int j = 0; conditionFor; j++) {
        // Unreachable for loop
      }
      object.mField.foo().toString();
    }
  }

  private Object callFoo(Supertype o) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    return o.foo();
  }

  void dynamicResolutionWithPrivateMethodBad() {
    Supertype subtype = new Subtype();
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    callFoo(subtype).toString();
  }

  Object variadicMethod(Supertype... args) {
    if (args.length == 0) {
      return null;
    } else {
      boolean conditionFor = getCondition();
      for (int j = 0; conditionFor; j++) {
        // Unreachable for loop
      }
      return args[0].foo();
    }
  }

  void dynamicResolutionWithVariadicMethodBad() {
    Supertype subtype = new Subtype();
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable for loop
    }
    variadicMethod(subtype, null, null).toString();
  }

  private static boolean getCondition() {
    return false;
  }
}