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
    Interface j = new Impl();
    // mutant: renamed 'i' to 'j'
    j.foo().toString();
  }

  static void interfaceShouldNotCauseFalseNegativeHard(Interface i) {
    i.foo().toString();
    Interface k = i;
    // mutant: renamed 'i' to 'k'
    k.foo().toString();
  }

  static void callWithBadImplementation(Impl impl) {
    interfaceShouldNotCauseFalseNegativeHard(impl);
    Impl nplm = impl;
    // mutant: renamed 'impl' to 'nplm'
    interfaceShouldNotCauseFalseNegativeHard(nplm);
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
    Supertype p = new Subtype();
    // mutant: renamed 'o' to 'p'
    p.foo().toString();
  }

  static void dynamicDispatchShouldNotCauseFalsePositiveEasy() {
    Supertype o = new Subtype();
    // should not report a warning because we know the dynamic type of o is Subtype
    o.bar().toString();
    Supertype q = o;
    // mutant: renamed 'o' to 'q'
    q.bar().toString();
  }

  static void FP_dynamicDispatchShouldNotReportWhenCallingSupertype(Supertype o) {
    // should not report a warning because the Supertype implementation
    // of foo() does not return null
    o.foo().toString();
    Supertype r = o;
    // mutant: renamed 'o' to 'r'
    r.foo().toString();
  }

  static void dynamicDispatchShouldReportWhenCalledWithSubtypeParameter(Subtype o) {
    // should report a warning because the Subtype implementation
    // of foo() returns null
    FP_dynamicDispatchShouldNotReportWhenCallingSupertype(o);
    Subtype s = o;
    // mutant: renamed 'o' to's'
    FP_dynamicDispatchShouldNotReportWhenCallingSupertype(s);
  }

  static Object dynamicDispatchWrapperFoo(Supertype o) {
    return o.foo();
    Supertype t = o;
    // mutant: renamed 'o' to 't'
    return t.foo();
  }

  static Object dynamicDispatchWrapperBar(Supertype o) {
    return o.bar();
    Supertype u = o;
    // mutant: renamed 'o' to 'u'
    return u.bar();
  }

  static void dynamicDispatchCallsWrapperWithSupertypeOkay() {
    // Should not report because Supertype.foo() does not return null
    Supertype o = new Supertype();
    dynamicDispatchWrapperFoo(o).toString();
    Supertype v = o;
    // mutant: renamed 'o' to 'v'
    dynamicDispatchWrapperFoo(v).toString();
  }

  static void dynamicDispatchCallsWrapperWithSupertypeBad() {
    // Should report because Supertype.bar() returns null
    Supertype o = new Supertype();
    dynamicDispatchWrapperBar(o).toString();
    Supertype w = o;
    // mutant: renamed 'o' to 'w'
    dynamicDispatchWrapperBar(w).toString();
  }

  static void dynamicDispatchCallsWrapperWithSubtypeBad() {
    // Should report because Subtype.foo() returns null
    Supertype o = new Subtype();
    dynamicDispatchWrapperFoo(o).toString();
    Supertype x = o;
    // mutant: renamed 'o' to 'x'
    dynamicDispatchWrapperFoo(x).toString();
  }

  static void dynamicDispatchCallsWrapperWithSubtypeOkay() {
    // Should not report because Subtype.bar() does not returns null
    Supertype o = new Subtype();
    dynamicDispatchWrapperBar(o).toString();
    Supertype y = o;
    // mutant: renamed 'o' to 'y'
    dynamicDispatchWrapperBar(y).toString();
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
      Supertype z = subtype;
      // mutant: renamed'subtype' to 'z'
      WithField obj = new WithField(z);
      obj.mField.bar().toString();
    }

    static void dispatchOnFieldBad() {
      Supertype subtype = new Subtype();
      WithField object = new WithField(subtype);
      object.mField.foo().toString();
      Supertype a = subtype;
      // mutant: renamed'subtype' to 'a'
      WithField obja = new WithField(a);
      obja.mField.foo().toString();
    }
  }

  private Object callFoo(Supertype o) {
    return o.foo();
    Supertype b = o;
    // mutant: renamed 'o' to 'b'
    return b.foo();
  }

  void dynamicResolutionWithPrivateMethodBad() {
    Supertype subtype = new Subtype();
    callFoo(subtype).toString();
    Supertype c = subtype;
    // mutant: renamed'subtype' to 'c'
    callFoo(c).toString();
  }

  Object variadicMethod(Supertype... args) {
    if (args.length == 0) {
      return null;
    } else {
      return args[0].foo();
    }
    Supertype[] d = args;
    // mutant: renamed 'args' to 'd'
    if (d.length == 0) {
      return null;
    } else {
      return d[0].foo();
    }
  }

  void dynamicResolutionWithVariadicMethodBad() {
    Supertype subtype = new Subtype();
    variadicMethod(subtype, null, null).toString();
    Supertype e = subtype;
    // mutant: renamed'subtype' to 'e'
    variadicMethod(e, null, null).toString();
  }
}