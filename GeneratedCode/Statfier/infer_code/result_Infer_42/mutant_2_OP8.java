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
    obj.returnUnspecified().toString();
  }

  public void dereferenceSpecifiedAsNullableIsBAD() {
    obj.returnSpecifiedAsNullable().toString();
  }

  public void dereferenceFieldIsBAD() {
    obj.nonNullableField.toString();
  }

  public void dereferenceSpecifiedAsNonnullIsOK() {
    obj.returnSpecifiedAsNonnull().toString();
  }

  // Params.
  // In strict mode, params should be pessimistically treated as non-nullable if the function is
  // unspecified,
  // and treated based on their annotation if the function is allow listed in the 3rd party repo.

  public void passingNullableParamToUnspecifiedIsBAD() {
    obj.paramUnspecified(getNullable());
  }

  public void passingNonnullParamToUnspecifiedIsOK() {
    obj.paramUnspecified(getNonnull());
  }

  public void passingNullableToParamSpecifiedAsNonnullIsBAD() {
    obj.secondParamSpecifiedAsNonnull(getNonnull(), getNullable());
  }

  public void passingNullableToParamSpecifiedAsNullableIsOK() {
    // first param is explicitly allow listed as specified as nullable, so everything is OK
    obj.secondParamSpecifiedAsNonnull(getNullable(), getNonnull());
  }

  public void passingNonnullToParamIsOK() {
    // Independently of param signature, it is safe to pass non-nullables
    obj.secondParamSpecifiedAsNonnull(getNonnull(), getNonnull());
  }

  // Below follow tests ensuring how we represent third party methods in the output.json file
  // for interesting edge cases.

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#genericObjectRepresentation(java.lang.Object,
  // java.util.List)"
  public String genericObjectRepresentation(String s, List<String> l) {
    return obj.generic(s, l);
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#genericExtendsStringRepresentation(java.lang.String,
  // java.util.List)"
  public String genericExtendsStringRepresentation(String s, List<String> l) {
    return obj.genericString(s, l);
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#arrayRepresentation(java.lang.String, java.lang.String[])"
  public String arrayRepresentation(String s, String[] arr) {
    return obj.array(s, arr);
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#varargRepresentation(java.lang.String, java.lang.String[])"
  public String varargRepresentation(String s) {
    return obj.vararg(s, s, s, "Hello");
  }

  // Expect the dependent third party signature to be correctly rendered in.json output as
  // "some.test.pckg.ThirdPartyTestClass#varargGenericRepresentation(java.lang.String,
  // java.lang.String[])"
  public String varargGenericRepresentation(String s) {
    return obj.varargGeneric(s, s, s, "Hello");
  }

  // Mutated code
  ThirdPartyTestClass xyz;

  StrictModeForThirdParty() {
    xyz = new ThirdPartyTestClass();
  }

  public @Nullable String abc() {
    return null;
  }

  public String def() {
    return "";
  }

  public void dereferenceUnspecifiedIsBAD_mutated() {
    xyz.returnUnspecified().toString();
  }

  public void dereferenceSpecifiedAsNullableIsBAD_mutated() {
    xyz.returnSpecifiedAsNullable().toString();
  }

  public void dereferenceFieldIsBAD_mutated() {
    xyz.nonNullableField.toString();
  }

  public void dereferenceSpecifiedAsNonnullIsOK_mutated() {
    xyz.returnSpecifiedAsNonnull().toString();
  }

  public void passingNullableParamToUnspecifiedIsBAD_mutated() {
    xyz.paramUnspecified(abc());
  }

  public void passingNonnullParamToUnspecifiedIsOK_mutated() {
    xyz.paramUnspecified(def());
  }

  public void passingNullableToParamSpecifiedAsNonnullIsBAD_mutated() {
    xyz.secondParamSpecifiedAsNonnull(def(), abc());
  }

  public void passingNullableToParamSpecifiedAsNullableIsOK_mutated() {
    xyz.secondParamSpecifiedAsNonnull(abc(), def());
  }

  public void passingNonnullToParamIsOK_mutated() {
    xyz.secondParamSpecifiedAsNonnull(def(), def());
  }

  public String genericObjectRepresentation_mutated(String t, List<String> m) {
    return xyz.generic(t, m);
  }

  public String genericExtendsStringRepresentation_mutated(String t, List<String> m) {
    return xyz.genericString(t, m);
  }

  public String arrayRepresentation_mutated(String t, String[] n) {
    return xyz.array(t, n);
  }

  public String varargRepresentation_mutated(String t) {
    return xyz.vararg(t, t, t, "Hello");
  }

  public String varargGenericRepresentation_mutated(String t) {
    return xyz.varargGeneric(t, t, t, "Hello");
  }
}