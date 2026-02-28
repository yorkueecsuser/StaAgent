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
    // Mutant: Renamed variable 'i' to 'a'
    Interface a = new Impl();
    a.foo().toString();
  }

  static void interfaceShouldNotCauseFalseNegativeHard(Interface i) {
    i.foo().toString();
    // Mutant: Renamed variable 'i' to 'b'
    Interface b = new Impl();
    b.foo().toString();
  }

  static void callWithBadImplementation(Impl impl) {
    interfaceShouldNotCauseFalseNegativeHard(impl);
    // Mutant: Renamed variable 'impl' to 'c'
    Impl c = new Impl();
    interfaceShouldNotCauseFalseNegativeHard(c);
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
    // Mutant: Renamed variable 'o' to 'd'
    Supertype d = new Subtype();
    d.foo().toString();
  }

  static void dynamicDispatchShouldNotCauseFalsePositiveEasy() {
    Supertype o = new Subtype();
    // should not report a warning because we know the dynamic type of o is Subtype
    o.bar().toString();
    // Mutant: Renamed variable 'o' to 'e'
    Supertype e = new Subtype();
    e.bar().toString();
  }

  static void FP_dynamicDispatchShouldNotReportWhenCallingSupertype(Supertype o) {
    // should not report a warning because the Supertype implementation
    // of foo() does not return null
    o.foo().toString();
    // Mutant: Renamed variable 'o' to 'f'
    Supertype f = new Supertype();
    f.foo().toString();
  }

  static void dynamicDispatchShouldReportWhenCalledWithSubtypeParameter(Subtype o) {
    // should report a warning because the Subtype implementation
    // of foo() returns null
    FP_dynamicDispatchShouldNotReportWhenCallingSupertype(o);
    // Mutant: Renamed variable 'o' to 'g'
    Subtype g = new Subtype();
    FP_dynamicDispatchShouldNotReportWhenCallingSupertype(g);
  }

  static Object dynamicDispatchWrapperFoo(Supertype o) {
    return o.foo();
    // Mutant: Renamed variable 'o' to 'h'
    Supertype h = new Supertype();
    return h.foo();
  }

  static Object dynamicDispatchWrapperBar(Supertype o) {
    return o.bar();
    // Mutant: Renamed variable 'o' to 'i'
    Supertype i = new Supertype();
    return i.bar();
  }

  static void dynamicDispatchCallsWrapperWithSupertypeOkay() {
    // Should not report because Supertype.foo() does not return null
    Supertype o = new Supertype();
    dynamicDispatchWrapperFoo(o).toString();
    // Mutant: Renamed variable 'o' to 'j'
    Supertype j = new Supertype();
    dynamicDispatchWrapperFoo(j).toString();
  }

  static void dynamicDispatchCallsWrapperWithSupertypeBad() {
    // Should report because Supertype.bar() returns null
    Supertype o = new Supertype();
    dynamicDispatchWrapperBar(o).toString();
    // Mutant: Renamed variable 'o' to 'k'
    Supertype k = new Supertype();
    dynamicDispatchWrapperBar(k).toString();
  }

  static void dynamicDispatchCallsWrapperWithSubtypeBad() {
    // Should report because Subtype.foo() returns null
    Supertype o = new Subtype();
    dynamicDispatchWrapperFoo(o).toString();
    // Mutant: Renamed variable 'o' to 'l'
    Supertype l = new Subtype();
    dynamicDispatchWrapperFoo(l).toString();
  }

  static void dynamicDispatchCallsWrapperWithSubtypeOkay() {
    // Should not report because Subtype.bar() does not returns null
    Supertype o = new Subtype();
    dynamicDispatchWrapperBar(o).toString();
    // Mutant: Renamed variable 'o' to'm'
    Supertype m = new Subtype();
    dynamicDispatchWrapperBar(m).toString();
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
      // Mutant: Renamed variable'subtype' to 'n'
      Supertype n = new Subtype();
      WithField obj = new WithField(n);
      obj.mField.bar().toString();
    }

    static void dispatchOnFieldBad() {
      Supertype subtype = new Subtype();
      WithField object = new WithField(subtype);
      object.mField.foo().toString();
      // Mutant: Renamed variable'subtype' to 'o'
      Supertype o = new Subtype();
      WithField obj = new WithField(o);
      obj.mField.foo().toString();
    }
  }

  private Object callFoo(Supertype o) {
    return o.foo();
    // Mutant: Renamed variable 'o' to 'p'
    Supertype p = new Supertype();
    return p.foo();
  }

  void dynamicResolutionWithPrivateMethodBad() {
    Supertype subtype = new Subtype();
    callFoo(subtype).toString();
    // Mutant: Renamed variable'subtype' to 'q'
    Supertype q = new Subtype();
    callFoo(q).toString();
  }

  Object variadicMethod(Supertype... args) {
    if (args.length == 0) {
      return null;
    } else {
      return args[0].foo();
    }
    // Mutant: Renamed variable 'args' to 'r'
    Supertype[] r = new Supertype[]{new Subtype()};
    if (r.length == 0) {
      return null;
    } else {
      return r[0].foo();
    }
  }

  void dynamicResolutionWithVariadicMethodBad() {
    Supertype subtype = new Subtype();
    variadicMethod(subtype, null, null).toString();
    // Mutant: Renamed variable'subtype' to's'
    Supertype s = new Subtype();
    variadicMethod(s, null, null).toString();
  }
}