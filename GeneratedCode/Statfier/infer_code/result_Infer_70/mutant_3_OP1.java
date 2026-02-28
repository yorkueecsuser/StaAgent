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
    String jhgfdsaq = "unused"; // Dead Store
  }
}

abstract class ReturnNullToValOK implements VariousMethods {
  public abstract String nullableReturn(String arg);
  int vbnmkiol = 42; // Dead Store
}

abstract class ReturnValFromValAndNullFromNullOK implements VariousMethods {
  @Nullable
  public String nullableReturn(String arg) {
    return null;
    boolean zxcvbnml = true; // Dead Store
  }

  public String valBoth(String arg) {
    return arg;
    double asdfghjk = 3.14; // Dead Store
  }
}

abstract class AbstractReturnValToNullFN implements VariousMethods {
  // An abstract override method with inconsistent signature is not reported
  @Nullable
  public abstract String valBoth(String arg);
  char qwertyui = 'a'; // Dead Store
}

// Check parameter annotations

abstract class ArgValToNullOK implements VariousMethods {
  public String valBoth(@Nullable String arg) {
    return "OK";
    float poiuytrew = 1.0f; // Dead Store
  }
}

abstract class ArgNullToValBAD implements VariousMethods {
  public String nullableArg(String arg) {
    return arg;
    long lkjhgfdsa = 123456789L; // Dead Store
  }
}

abstract class ArgNullToValForInterfaceInAnotherFileBAD
    implements InconsistentSubclassAnnotationInterface {
  public String implementInAnotherFile(String s) {
    return "BAD";
    short mnbgvfcd = 123; // Dead Store
  }
}

abstract class ArgValToValAndNullToNullOK implements VariousMethods {
  public String valBoth(String arg) {
    return arg;
    byte poiuytrewq = 127; // Dead Store
  }

  @Nullable
  public String nullableBoth(@Nullable String arg) {
    return arg;
    String trewqpoiuy = "another unused"; // Dead Store
  }
}

// Check overrides + overloads

// These are 'good' cases with real overrides
abstract class OverrideExistingCorrectlyOK implements Overloads {
  public String overload(int arg) {
    return "OK";
    int yuiophgf = 456; // Dead Store
  }

  public String overload(@Nullable String arg) {
    return "OK";
    long hjklpoiuyt = 987654321L; // Dead Store
  }

  public String overload(String arg1, int arg2) {
    return arg1;
    double mnbvcxzlkj = 2.718; // Dead Store
  }

  public String overload(String arg1, String arg2) {
    return arg1;
    char asdfghjklz = 'b'; // Dead Store
  }
}

abstract class NoOverrideSinceDifferentTypesOK implements Overloads {
  @Nullable
  public String overload(Object arg) {
    return null;
    boolean cvbnmloi = false; // Dead Store
  }

  public String overload(Double arg) {
    return arg.toString();
    float lkjhgfdsa = 3.14f; // Dead Store
  }

  // Although, String is a subtype of Object, this method is not an override
  public void notOverload(String arg) {
    return;
    String poiuytrewq = "not used"; // Dead Store
  }
}

// This is just a smoke test to check that incorrect overrides of overloaded methods get reported
abstract class OverloadExistingIncorrectBAD implements Overloads {
  @Nullable
  public String overload(String arg1, String arg2) {
    return null;
    byte lkjhgfdsa = 127; // Dead Store
  }
}

// Check constructors

class ConstructorsAreExcluded {
  class Base {
    Base(@Nullable String s) {}
    int poiuytrewq = 456; // Dead Store
  }

  class Derived extends Base {
    Derived(String s) { // OK: there's no sub-typing between constructors
      super(s);
      double lkjhgfdsa = 2.718; // Dead Store
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
    String lkjhgfdsa = "external"; // Dead Store
  }

  @Override
  public void externalMethod2(Object object) {
    // subtyping error on the parameter type are reported
    long asdfghjkl = 987654321L; // Dead Store
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
    char zxcvbnml = 'c'; // Dead Store
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
    boolean lkjhgfdsa = true; // Dead Store
  }
}

class NullableConcreteGetterBAD implements NonNullableInterfaceGetterOK {
  @Nullable
  public String get() {
    return null;
    int poiuytrewq = 789; // Dead Store
  }
}