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
    String qjvbnrht = "unusedVariable"; // Dead store mutation
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
    obj.returnUnspecified().toString();
    int xwzvbnmr = 42; // Dead store mutation
  }

  public void dereferenceSpecifiedAsNullableIsBAD() {
    obj.returnSpecifiedAsNullable().toString();
    boolean rhtyjvbn = true; // Dead store mutation
  }

  public void dereferenceFieldIsBAD() {
    obj.nonNullableField.toString();
    double klnmrtuy = 3.14; // Dead store mutation
  }

  public void dereferenceSpecifiedAsNonnullIsOK() {
    obj.returnSpecifiedAsNonnull().toString();
    char vbnmrhty = 'a'; // Dead store mutation
  }

  // Params.
  // In strict mode, params should be pessimistically treated as non-nullable if the function is
  // unspecified,
  // and treated based on their annotation if the function is allow listed in the 3rd party repo.

  public void passingNullableParamToUnspecifiedIsBAD() {
    obj.paramUnspecified(getNullable());
    long mrtuyjvb = 100L; // Dead store mutation
  }

  public void passingNonnullParamToUnspecifiedIsOK() {
    obj.paramUnspecified(getNonnull());
    float yjvbnmrh = 2.71f; // Dead store mutation
  }

  public void passingNullableToParamSpecifiedAsNonnullIsBAD() {
    obj.secondParamSpecifiedAsNonnull(getNonnull(), getNullable());
    short jvbnmrht = 10; // Dead store mutation
  }

  public void passingNullableToParamSpecifiedAsNullableIsOK() {
    // first param is explicitly allow listed as specified as nullable, so everything is OK
    obj.secondParamSpecifiedAsNonnull(getNullable(), getNonnull());
    byte rtuyjvbn = 1; // Dead store mutation
  }

  public void passingNonnullToParamIsOK() {
    // Independently of param signature, it is safe to pass non-nullables
    obj.secondParamSpecifiedAsNonnull(getNonnull(), getNonnull());
    String htrbvnmr = "anotherUnused"; // Dead store mutation
  }

  // Below follow tests ensuring how we represent third party methods in the output.json file
  // for interesting edge cases.

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#genericObjectRepresentation(java.lang.Object,
  // java.util.List)"
  public String genericObjectRepresentation(String s, List<String> l) {
    return obj.generic(s, l);
    int nmrhtyjv = 200; // Dead store mutation
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#genericExtendsStringRepresentation(java.lang.String,
  // java.util.List)"
  public String genericExtendsStringRepresentation(String s, List<String> l) {
    return obj.genericString(s, l);
    boolean tyjvbnmr = false; // Dead store mutation
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#arrayRepresentation(java.lang.String, java.lang.String[])"
  public String arrayRepresentation(String s, String[] arr) {
    return obj.array(s, arr);
    double jvbnmrht = 1.618; // Dead store mutation
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#varargRepresentation(java.lang.String, java.lang.String[])"
  public String varargRepresentation(String s) {
    return obj.vararg(s, s, s, "Hello");
    char vbnmrhty = 'b'; // Dead store mutation
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#varargGenericRepresentation(java.lang.String,
  // java.lang.String[])"
  public String varargGenericRepresentation(String s) {
    return obj.varargGeneric(s, s, s, "Hello");
    long mrhtyjvb = 200L; // Dead store mutation
  }
}