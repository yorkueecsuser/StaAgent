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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      obj.returnUnspecified().toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  public void dereferenceSpecifiedAsNullableIsBAD() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      obj.returnSpecifiedAsNullable().toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  public void dereferenceFieldIsBAD() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      obj.nonNullableField.toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  public void dereferenceSpecifiedAsNonnullIsOK() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      obj.returnSpecifiedAsNonnull().toString();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  // Params.
  // In strict mode, params should be pessimistically treated as non-nullable if the function is
  // unspecified,
  // and treated based on their annotation if the function is allow listed in the 3rd party repo.

  public void passingNullableParamToUnspecifiedIsBAD() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      obj.paramUnspecified(getNullable());
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  public void passingNonnullParamToUnspecifiedIsOK() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      obj.paramUnspecified(getNonnull());
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  public void passingNullableToParamSpecifiedAsNonnullIsBAD() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      obj.secondParamSpecifiedAsNonnull(getNonnull(), getNullable());
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  public void passingNullableToParamSpecifiedAsNullableIsOK() {
    // first param is explicitly allow listed as specified as nullable, so everything is OK
    boolean shouldRun = getCondition();
    if (shouldRun) {
      obj.secondParamSpecifiedAsNonnull(getNullable(), getNonnull());
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  public void passingNonnullToParamIsOK() {
    // Independently of param signature, it is safe to pass non-nullables
    boolean shouldRun = getCondition();
    if (shouldRun) {
      obj.secondParamSpecifiedAsNonnull(getNonnull(), getNonnull());
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  // Below follow tests ensuring how we represent third party methods in the output.json file
  // for interesting edge cases.

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#genericObjectRepresentation(java.lang.Object,
  // java.util.List)"
  public String genericObjectRepresentation(String s, List<String> l) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return obj.generic(s, l);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
      return "";
    }
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#genericExtendsStringRepresentation(java.lang.String,
  // java.util.List)"
  public String genericExtendsStringRepresentation(String s, List<String> l) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return obj.genericString(s, l);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
      return "";
    }
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#arrayRepresentation(java.lang.String, java.lang.String[])"
  public String arrayRepresentation(String s, String[] arr) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return obj.array(s, arr);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
      return "";
    }
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#varargRepresentation(java.lang.String, java.lang.String[])"
  public String varargRepresentation(String s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return obj.vararg(s, s, s, "Hello");
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
      return "";
    }
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#varargGenericRepresentation(java.lang.String,
  // java.lang.String[])"
  public String varargGenericRepresentation(String s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return obj.varargGeneric(s, s, s, "Hello");
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
      return "";
    }
  }

  private boolean getCondition() {
    return true; // This method always returns true, making the else block unreachable
  }
}