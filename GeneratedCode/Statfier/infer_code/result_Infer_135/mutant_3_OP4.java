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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      i.foo().toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  static void interfaceShouldNotCauseFalseNegativeHard(Interface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      i.foo().toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  static void callWithBadImplementation(Impl impl) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      interfaceShouldNotCauseFalseNegativeHard(impl);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      o.foo().toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  static void dynamicDispatchShouldNotCauseFalsePositiveEasy() {
    Supertype o = new Subtype();
    // should not report a warning because we know the dynamic type of o is Subtype
    boolean shouldRun = getCondition();
    if (shouldRun) {
      o.bar().toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  static void FP_dynamicDispatchShouldNotReportWhenCallingSupertype(Supertype o) {
    // should not report a warning because the Supertype implementation
    // of foo() does not return null
    boolean shouldRun = getCondition();
    if (shouldRun) {
      o.foo().toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  static void dynamicDispatchShouldReportWhenCalledWithSubtypeParameter(Subtype o) {
    // should report a warning because the Subtype implementation
    // of foo() returns null
    boolean shouldRun = getCondition();
    if (shouldRun) {
      FP_dynamicDispatchShouldNotReportWhenCallingSupertype(o);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      dynamicDispatchWrapperFoo(o).toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  static void dynamicDispatchCallsWrapperWithSupertypeBad() {
    // Should report because Supertype.bar() returns null
    Supertype o = new Supertype();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      dynamicDispatchWrapperBar(o).toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  static void dynamicDispatchCallsWrapperWithSubtypeBad() {
    // Should report because Subtype.foo() returns null
    Supertype o = new Subtype();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      dynamicDispatchWrapperFoo(o).toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  static void dynamicDispatchCallsWrapperWithSubtypeOkay() {
    // Should not report because Subtype.bar() does not returns null
    Supertype o = new Subtype();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      dynamicDispatchWrapperBar(o).toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        object.mField.bar().toString();
      } else {
        // Unreachable if-else statement
        System.out.println("This is an unreachable else block.");
      }
    }

    static void dispatchOnFieldBad() {
      Supertype subtype = new Subtype();
      WithField object = new WithField(subtype);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        object.mField.foo().toString();
      } else {
        // Unreachable if-else statement
        System.out.println("This is an unreachable else block.");
      }
    }
  }

  private Object callFoo(Supertype o) {
    return o.foo();
  }

  void dynamicResolutionWithPrivateMethodBad() {
    Supertype subtype = new Subtype();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      callFoo(subtype).toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      variadicMethod(subtype, null, null).toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  private static boolean getCondition() {
    return true; // This ensures the condition is dynamically determined
  }
}