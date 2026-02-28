import codetoanalyze.java.annotation.NullsafeStrict;
import java.util.List;
import javax.annotation.Nullable;

/**
 * In this test, we test how Strict mode works for calls of 3rd party libraries, and how detection
 * differs based on if the function is allow listed or not in 3rd party signatures repository.
 */
@NullsafeStrict
class StrictModeForThirdParty {

  ThirdPartyTestClass obj;

  StrictModeForThirdParty() {
    obj = new ThirdPartyTestClass();
  }

  public @Nullable String getNullable() {
    return null;
  }

  public String getNonnull() {
    return "";
  }

  // Return values.
  // In strict mode, return values should be pessimistically treated as nullable
  // if the function is unspecified, and treated according to their return annotation if
  // the function is allow listed in the 3rd party repo.

  public void dereferenceUnspecifiedIsBAD() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    obj.returnUnspecified().toString();
  }

  public void dereferenceSpecifiedAsNullableIsBAD() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    obj.returnSpecifiedAsNullable().toString();
  }

  public void dereferenceFieldIsBAD() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    obj.nonNullableField.toString();
  }

  public void dereferenceSpecifiedAsNonnullIsOK() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    obj.returnSpecifiedAsNonnull().toString();
  }

  // Params.
  // In strict mode, params should be pessimistically treated as non-nullable if the function is
  // unspecified,
  // and treated based on their annotation if the function is allow listed in the 3rd party repo.

  public void passingNullableParamToUnspecifiedIsBAD() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    obj.paramUnspecified(getNullable());
  }

  public void passingNonnullParamToUnspecifiedIsOK() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    obj.paramUnspecified(getNonnull());
  }

  public void passingNullableToParamSpecifiedAsNonnullIsBAD() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    obj.secondParamSpecifiedAsNonnull(getNonnull(), getNullable());
  }

  public void passingNullableToParamSpecifiedAsNullableIsOK() {
    // first param is explicitly allow listed as specified as nullable, so everything is OK
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    obj.secondParamSpecifiedAsNonnull(getNullable(), getNonnull());
  }

  public void passingNonnullToParamIsOK() {
    // Independently of param signature, it is safe to pass non-nullables
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    obj.secondParamSpecifiedAsNonnull(getNonnull(), getNonnull());
  }

  // Below follow tests ensuring how we represent third party methods in the output.json file
  // for interesting edge cases.

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#genericObjectRepresentation(java.lang.Object,
  // java.util.List)"
  public String genericObjectRepresentation(String s, List<String> l) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return obj.generic(s, l);
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#genericExtendsStringRepresentation(java.lang.String,
  // java.util.List)"
  public String genericExtendsStringRepresentation(String s, List<String> l) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return obj.genericString(s, l);
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#arrayRepresentation(java.lang.String, java.lang.String[])"
  public String arrayRepresentation(String s, String[] arr) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return obj.array(s, arr);
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#varargRepresentation(java.lang.String, java.lang.String[])"
  public String varargRepresentation(String s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return obj.vararg(s, s, s, "Hello");
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#varargGenericRepresentation(java.lang.String,
  // java.lang.String[])"
  public String varargGenericRepresentation(String s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return obj.varargGeneric(s, s, s, "Hello");
  }

  private boolean getCondition() {
    return false;
  }
}