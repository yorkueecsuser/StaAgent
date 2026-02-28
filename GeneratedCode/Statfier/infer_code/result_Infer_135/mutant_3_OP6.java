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
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  static void interfaceShouldNotCauseFalseNegativeHard(Interface i) {
    i.foo().toString();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // Unreachable code
    }
  }

  static void callWithBadImplementation(Impl impl) {
    interfaceShouldNotCauseFalseNegativeHard(impl);
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int l = 0; conditionFor; l++) {
      // Unreachable code
    }
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
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int m = 0; conditionFor; m++) {
      // Unreachable code
    }
  }

  static void dynamicDispatchShouldNotCauseFalsePositiveEasy() {
    Supertype o = new Subtype();
    // should not report a warning because we know the dynamic type of o is Subtype
    o.bar().toString();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int n = 0; conditionFor; n++) {
      // Unreachable code
    }
  }

  static void FP_dynamicDispatchShouldNotReportWhenCallingSupertype(Supertype o) {
    // should not report a warning because the Supertype implementation
    // of foo() does not return null
    o.foo().toString();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int oVar = 0; conditionFor; oVar++) {
      // Unreachable code
    }
  }

  static void dynamicDispatchShouldReportWhenCalledWithSubtypeParameter(Subtype o) {
    // should report a warning because the Subtype implementation
    // of foo() returns null
    FP_dynamicDispatchShouldNotReportWhenCallingSupertype(o);
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int p = 0; conditionFor; p++) {
      // Unreachable code
    }
  }

  static Object dynamicDispatchWrapperFoo(Supertype o) {
    return o.foo();
  }

  static Object dynamicDispatchWrapperBar(Supertype o) {
    return o.bar();
  }

  static void dynamicDispatchCallsWrapperWithSupertypeOkay() {
    // Should not report because Supertype.foo() does not return null
    Supertype o = new Supertype();
    dynamicDispatchWrapperFoo(o).toString();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int q = 0; conditionFor; q++) {
      // Unreachable code
    }
  }

  static void dynamicDispatchCallsWrapperWithSupertypeBad() {
    // Should report because Supertype.bar() returns null
    Supertype o = new Supertype();
    dynamicDispatchWrapperBar(o).toString();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int r = 0; conditionFor; r++) {
      // Unreachable code
    }
  }

  static void dynamicDispatchCallsWrapperWithSubtypeBad() {
    // Should report because Subtype.foo() returns null
    Supertype o = new Subtype();
    dynamicDispatchWrapperFoo(o).toString();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int s = 0; conditionFor; s++) {
      // Unreachable code
    }
  }

  static void dynamicDispatchCallsWrapperWithSubtypeOkay() {
    // Should not report because Subtype.bar() does not returns null
    Supertype o = new Subtype();
    dynamicDispatchWrapperBar(o).toString();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int t = 0; conditionFor; t++) {
      // Unreachable code
    }
  }

  static class WithField {

    Supertype mField;

    WithField(Supertype t) {
      mField = t;
    }

    static void dispatchOnFieldOk() {
      Supertype subtype = new Subtype();
      WithField object = new WithField(subtype);
      object.mField.bar().toString();
      // Mutant: Unreachable for loop
      boolean conditionFor = getCondition();
      for (int u = 0; conditionFor; u++) {
        // Unreachable code
      }
    }

    static void dispatchOnFieldBad() {
      Supertype subtype = new Subtype();
      WithField object = new WithField(subtype);
      object.mField.foo().toString();
      // Mutant: Unreachable for loop
      boolean conditionFor = getCondition();
      for (int v = 0; conditionFor; v++) {
        // Unreachable code
      }
    }
  }

  private Object callFoo(Supertype o) {
    return o.foo();
  }

  void dynamicResolutionWithPrivateMethodBad() {
    Supertype subtype = new Subtype();
    callFoo(subtype).toString();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int w = 0; conditionFor; w++) {
      // Unreachable code
    }
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
    variadicMethod(subtype, null, null).toString();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int x = 0; conditionFor; x++) {
      // Unreachable code
    }
  }

  // Helper method to provide a dynamically determined condition
  private boolean getCondition() {
    return false;
  }
}