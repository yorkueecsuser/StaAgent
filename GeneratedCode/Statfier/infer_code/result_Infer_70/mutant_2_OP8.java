import codetoanalyze.java.SomeExternalClass;
import javax.annotation.Nullable;

interface VariousMethods {
  String valBoth(String arg);

  @Nullable
  String nullableReturn(String arg);

  String nullableArg(@Nullable String arg);

  @Nullable
  String nullableBoth(@Nullable String arg);
}

interface Overloads {
  String overload(int arg);

  String overload(@Nullable String arg);

  String overload(String arg1, int arg2);

  String overload(String arg1, String arg2);

  void notOverload(@Nullable Object arg);
}

// Check return annotations

abstract class ReturnValToNullBAD implements VariousMethods {
  @Nullable
  public String valBoth(String arg) {
    return null;
  }
  
  // Mutant: Renamed 'arg' to 'b'
  @Nullable
  public String valBothMutant(String b) {
    return null;
  }
}

abstract class ReturnNullToValOK implements VariousMethods {
  public abstract String nullableReturn(String arg);
  
  // Mutant: Renamed 'arg' to 'b'
  public abstract String nullableReturnMutant(String b);
}

abstract class ReturnValFromValAndNullFromNullOK implements VariousMethods {
  @Nullable
  public String nullableReturn(String arg) {
    return null;
  }

  public String valBoth(String arg) {
    return arg;
  }
  
  // Mutant: Renamed 'arg' to 'b'
  @Nullable
  public String nullableReturnMutant(String b) {
    return null;
  }

  // Mutant: Renamed 'arg' to 'b'
  public String valBothMutant(String b) {
    return b;
  }
}

abstract class AbstractReturnValToNullFN implements VariousMethods {
  // An abstract override method with inconsistent signature is not reported
  @Nullable
  public abstract String valBoth(String arg);
  
  // Mutant: Renamed 'arg' to 'b'
  @Nullable
  public abstract String valBothMutant(String b);
}

// Check parameter annotations

abstract class ArgValToNullOK implements VariousMethods {
  public String valBoth(@Nullable String arg) {
    return "OK";
  }
  
  // Mutant: Renamed 'arg' to 'b'
  public String valBothMutant(@Nullable String b) {
    return "OK";
  }
}

abstract class ArgNullToValBAD implements VariousMethods {
  public String nullableArg(String arg) {
    return arg;
  }
  
  // Mutant: Renamed 'arg' to 'b'
  public String nullableArgMutant(String b) {
    return b;
  }
}

abstract class ArgNullToValForInterfaceInAnotherFileBAD
    implements InconsistentSubclassAnnotationInterface {
  public String implementInAnotherFile(String s) {
    return "BAD";
  }
  
  // Mutant: Renamed's' to 't'
  public String implementInAnotherFileMutant(String t) {
    return "BAD";
  }
}

abstract class ArgValToValAndNullToNullOK implements VariousMethods {
  public String valBoth(String arg) {
    return arg;
  }

  @Nullable
  public String nullableBoth(@Nullable String arg) {
    return arg;
  }
  
  // Mutant: Renamed 'arg' to 'b'
  public String valBothMutant(String b) {
    return b;
  }

  // Mutant: Renamed 'arg' to 'b'
  @Nullable
  public String nullableBothMutant(@Nullable String b) {
    return b;
  }
}

// Check overrides + overloads

// These are 'good' cases with real overrides
abstract class OverrideExistingCorrectlyOK implements Overloads {
  public String overload(int arg) {
    return "OK";
  }

  public String overload(@Nullable String arg) {
    return "OK";
  }

  public String overload(String arg1, int arg2) {
    return arg1;
  }

  public String overload(String arg1, String arg2) {
    return arg1;
  }
  
  // Mutant: Renamed 'arg' to 'b'
  public String overloadMutant(int b) {
    return "OK";
  }

  // Mutant: Renamed 'arg' to 'b'
  public String overloadMutant(@Nullable String b) {
    return "OK";
  }

  // Mutant: Renamed 'arg1' to 'c', 'arg2' to 'd'
  public String overloadMutant(String c, int d) {
    return c;
  }

  // Mutant: Renamed 'arg1' to 'c', 'arg2' to 'd'
  public String overloadMutant(String c, String d) {
    return c;
  }
}

abstract class NoOverrideSinceDifferentTypesOK implements Overloads {
  @Nullable
  public String overload(Object arg) {
    return null;
  }

  public String overload(Double arg) {
    return arg.toString();
  }

  // Although, String is a subtype of Object, this method is not an override
  public void notOverload(String arg) {
    return;
  }
  
  // Mutant: Renamed 'arg' to 'b'
  @Nullable
  public String overloadMutant(Object b) {
    return null;
  }

  // Mutant: Renamed 'arg' to 'b'
  public String overloadMutant(Double b) {
    return b.toString();
  }

  // Mutant: Renamed 'arg' to 'b'
  public void notOverloadMutant(String b) {
    return;
  }
}

// This is just a smoke test to check that incorrect overrides of overloaded methods get reported
abstract class OverloadExistingIncorrectBAD implements Overloads {
  @Nullable
  public String overload(String arg1, String arg2) {
    return null;
  }
  
  // Mutant: Renamed 'arg1' to 'c', 'arg2' to 'd'
  @Nullable
  public String overloadMutant(String c, String d) {
    return null;
  }
}

// Check constructors

class ConstructorsAreExcluded {
  class Base {
    Base(@Nullable String s) {}
  }

  class Derived extends Base {
    Derived(String s) { // OK: there's no sub-typing between constructors
      super(s);
    }
    
    // Mutant: Renamed's' to 't'
    DerivedMutant(String t) { // OK: there's no sub-typing between constructors
      super(t);
    }
  }
}

// Check interop with external libraries

class ExtendsExternalLibrary extends SomeExternalClass {

  @Override
  public @Nullable Object externalMethod1() {
    // subtyping error on the return type not reported as we cannot
    // rely on the external libraries to be correctly annotated
    return null;
  }

  @Override
  public void externalMethod2(Object object) {
    // subtyping error on the parameter type are reported
  }
  
  // Mutant: Renamed 'object' to 'obj'
  @Override
  public void externalMethod2Mutant(Object obj) {
    // subtyping error on the parameter type are reported
  }
}

// Check that 1) we have a special error message for lack of annotation in this method and 2) treat
// `x` as implicitly nullable
class JavaLangEquals {
  @Override
  public boolean equals(Object x) {
    // BAD: x can not be directly dereferenced without null comparison:
    // it is implicitly nullable because Java requires `x.equals(null)` to work correctly.
    // It is a common enough case to make the nullsafe support this specifically.
    return x.toString() == "JavaLangEquals";
  }
  
  // Mutant: Renamed 'x' to 'y'
  @Override
  public boolean equalsMutant(Object y) {
    // BAD: y can not be directly dereferenced without null comparison:
    // it is implicitly nullable because Java requires `y.equals(null)` to work correctly.
    // It is a common enough case to make the nullsafe support this specifically.
    return y.toString() == "JavaLangEquals";
  }
}

// Check multiple interfaces in the inheritance chain
interface NullableGetter {
  @Nullable
  String get();
}

interface NonNullableInterfaceGetterOK extends NullableGetter {
  String get();
}

class NonNullableConcreteGetterOK implements NonNullableInterfaceGetterOK {
  public String get() {
    return "OK";
  }
  
  // Mutant: Added a new method with renamed variable
  public String getMutant() {
    return "OK";
  }
}

class NullableConcreteGetterBAD implements NonNullableInterfaceGetterOK {
  @Nullable
  public String get() {
    return null;
  }
  
  // Mutant: Added a new method with renamed variable
  @Nullable
  public String getMutant() {
    return null;
  }
}