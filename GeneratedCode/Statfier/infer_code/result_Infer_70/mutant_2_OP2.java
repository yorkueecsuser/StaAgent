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
    return null; // Mutant: duplicated return statement
  }
}

abstract class ReturnNullToValOK implements VariousMethods {
  public abstract String nullableReturn(String arg);
}

abstract class ReturnValFromValAndNullFromNullOK implements VariousMethods {
  @Nullable
  public String nullableReturn(String arg) {
    return null;
    return null; // Mutant: duplicated return statement
  }

  public String valBoth(String arg) {
    return arg;
    return arg; // Mutant: duplicated return statement
  }
}

abstract class AbstractReturnValToNullFN implements VariousMethods {
  // An abstract override method with inconsistent signature is not reported
  @Nullable
  public abstract String valBoth(String arg);
}

// Check parameter annotations

abstract class ArgValToNullOK implements VariousMethods {
  public String valBoth(@Nullable String arg) {
    return "OK";
    return "OK"; // Mutant: duplicated return statement
  }
}

abstract class ArgNullToValBAD implements VariousMethods {
  public String nullableArg(String arg) {
    return arg;
    return arg; // Mutant: duplicated return statement
  }
}

abstract class ArgNullToValForInterfaceInAnotherFileBAD
    implements InconsistentSubclassAnnotationInterface {
  public String implementInAnotherFile(String s) {
    return "BAD";
    return "BAD"; // Mutant: duplicated return statement
  }
}

abstract class ArgValToValAndNullToNullOK implements VariousMethods {
  public String valBoth(String arg) {
    return arg;
    return arg; // Mutant: duplicated return statement
  }

  @Nullable
  public String nullableBoth(@Nullable String arg) {
    return arg;
    return arg; // Mutant: duplicated return statement
  }
}

// Check overrides + overloads

// These are 'good' cases with real overrides
abstract class OverrideExistingCorrectlyOK implements Overloads {
  public String overload(int arg) {
    return "OK";
    return "OK"; // Mutant: duplicated return statement
  }

  public String overload(@Nullable String arg) {
    return "OK";
    return "OK"; // Mutant: duplicated return statement
  }

  public String overload(String arg1, int arg2) {
    return arg1;
    return arg1; // Mutant: duplicated return statement
  }

  public String overload(String arg1, String arg2) {
    return arg1;
    return arg1; // Mutant: duplicated return statement
  }
}

abstract class NoOverrideSinceDifferentTypesOK implements Overloads {
  @Nullable
  public String overload(Object arg) {
    return null;
    return null; // Mutant: duplicated return statement
  }

  public String overload(Double arg) {
    return arg.toString();
    return arg.toString(); // Mutant: duplicated return statement
  }

  // Although, String is a subtype of Object, this method is not an override
  public void notOverload(String arg) {
    return;
    // No return statement to duplicate
  }
}

// This is just a smoke test to check that incorrect overrides of overloaded methods get reported
abstract class OverloadExistingIncorrectBAD implements Overloads {
  @Nullable
  public String overload(String arg1, String arg2) {
    return null;
    return null; // Mutant: duplicated return statement
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
  }
}

// Check interop with external libraries

class ExtendsExternalLibrary extends SomeExternalClass {

  @Override
  public @Nullable Object externalMethod1() {
    // subtyping error on the return type not reported as we cannot
    // rely on the external libraries to be correctly annotated
    return null;
    return null; // Mutant: duplicated return statement
  }

  @Override
  public void externalMethod2(Object object) {
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
    return x.toString() == "JavaLangEquals"; // Mutant: duplicated return statement
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
    return "OK"; // Mutant: duplicated return statement
  }
}

class NullableConcreteGetterBAD implements NonNullableInterfaceGetterOK {
  @Nullable
  public String get() {
    return null;
    return null; // Mutant: duplicated return statement
  }
}