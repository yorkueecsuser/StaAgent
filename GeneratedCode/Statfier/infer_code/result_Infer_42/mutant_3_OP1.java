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
    String jxqfhtpm = "deadstore"; // Dead Store mutation
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
    int vbnrhtyz = 42; // Dead Store mutation
  }

  public void dereferenceSpecifiedAsNullableIsBAD() {
    obj.returnSpecifiedAsNullable().toString();
    double wjxqfhtp = 3.14; // Dead Store mutation
  }

  public void dereferenceFieldIsBAD() {
    obj.nonNullableField.toString();
    boolean xqfhtpwb = true; // Dead Store mutation
  }

  public void dereferenceSpecifiedAsNonnullIsOK() {
    obj.returnSpecifiedAsNonnull().toString();
    char yzvjxqfp = 'a'; // Dead Store mutation
  }

  // Params.
  // In strict mode, params should be pessimistically treated as non-nullable if the function is
  // unspecified,
  // and treated based on their annotation if the function is allow listed in the 3rd party repo.

  public void passingNullableParamToUnspecifiedIsBAD() {
    obj.paramUnspecified(getNullable());
    long zyvbnrqx = 100L; // Dead Store mutation
  }

  public void passingNonnullParamToUnspecifiedIsOK() {
    obj.paramUnspecified(getNonnull());
    float qxyvbnrz = 2.718f; // Dead Store mutation
  }

  public void passingNullableToParamSpecifiedAsNonnullIsBAD() {
    obj.secondParamSpecifiedAsNonnull(getNonnull(), getNullable());
    short rzqxyvbn = 10; // Dead Store mutation
  }

  public void passingNullableToParamSpecifiedAsNullableIsOK() {
    // first param is explicitly allow listed as specified as nullable, so everything is OK
    obj.secondParamSpecifiedAsNonnull(getNullable(), getNonnull());
    byte vnrbnzqy = 1; // Dead Store mutation
  }

  public void passingNonnullToParamIsOK() {
    // Independently of param signature, it is safe to pass non-nullables
    obj.secondParamSpecifiedAsNonnull(getNonnull(), getNonnull());
    String fhtpqxyz = "anotherdeadstore"; // Dead Store mutation
  }

  // Below follow tests ensuring how we represent third party methods in the output.json file
  // for interesting edge cases.

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#genericObjectRepresentation(java.lang.Object,
  // java.util.List)"
  public String genericObjectRepresentation(String s, List<String> l) {
    return obj.generic(s, l);
    int htrqxyvn = 5; // Dead Store mutation
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#genericExtendsStringRepresentation(java.lang.String,
  // java.util.List)"
  public String genericExtendsStringRepresentation(String s, List<String> l) {
    return obj.genericString(s, l);
    long rxyvbnhz = 200L; // Dead Store mutation
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#arrayRepresentation(java.lang.String, java.lang.String[])"
  public String arrayRepresentation(String s, String[] arr) {
    return obj.array(s, arr);
    double zqxyvbnr = 1.618; // Dead Store mutation
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#varargRepresentation(java.lang.String, java.lang.String[])"
  public String varargRepresentation(String s) {
    return obj.vararg(s, s, s, "Hello");
    boolean qxyvbnrh = false; // Dead Store mutation
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#varargGenericRepresentation(java.lang.String,
  // java.lang.String[])"
  public String varargGenericRepresentation(String s) {
    return obj.varargGeneric(s, s, s, "Hello");
    char xyvbnrqz = 'b'; // Dead Store mutation
  }
}