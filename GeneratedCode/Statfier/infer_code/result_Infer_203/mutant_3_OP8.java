import android.support.v4.app.Fragment;
import codetoanalyze.java.annotation.Cleanup;
import javax.annotation.Nullable;

/**
 * It is common in Android code to recycle objects (e.g. views) by nullifying them in the "cleanup"
 * methods that are called after object lifecycle is over. This allows the GC to recycle without
 * waiting for the outer object to be freed. This is safe because these fields are not going to be
 * accessed after cleanup. So it is not necessary to annotate those fields with @Nullable.
 */
class CanAssignNullInCleanupMethods extends Fragment {

  String someObject = "";

  @Override
  public void onDestroyView() {
    // onDestroyView is a special method: OK to nullify here
    someObject = null;
  }

  @Override
  public void onDestroy() {
    // onDestroy is a special method: OK to nullify here
    someObject = null;
  }

  @Cleanup
  public void assignNullInCleanupMethodIsOK() {
    // The method is marked as cleanup.
    // OK to nullify here.
    someObject = null;
  }

  public void assignNullInAnyOtherMethodIsBAD() {
    someObject = null; // BAD: field is not nullable
  }

  // Mutated code
  String b = "";

  @Override
  public void onDestroyViewa() {
    // onDestroyView is a special method: OK to nullify here
    b = null;
  }

  @Override
  public void onDestroyb() {
    // onDestroy is a special method: OK to nullify here
    b = null;
  }

  @Cleanup
  public void assignNullInCleanupMethodIsOKa() {
    // The method is marked as cleanup.
    // OK to nullify here.
    b = null;
  }

  public void assignNullInAnyOtherMethodIsBADA() {
    b = null; // BAD: field is not nullable
  }
}

class FieldNotNullable {
  @Nullable String nullable = "";
  String notNullable = "";

  String initializeNonNullableWithNullIsBAD = null;
  @Nullable String initializeNullableWithNullIsOK = null;

  @Nullable
  String getNullable() {
    return "";
  }

  String getNotNullable() {
    return "";
  }

  void setNullableToNotNullableIsBAD(@Nullable String s) {
    notNullable = null; // BAD
    notNullable = s; // BAD
    notNullable = getNullable(); // BAD (even though getNullable() does not really return null)
  }

  void setNullableToNullableIsOK(@Nullable String s) {
    nullable = null; // OK
    nullable = s; // OK
    nullable = getNullable(); // OK
  }

  void setNotNullableToNotNullableIsOK(String s) {
    notNullable = "abc"; // OK
    notNullable = s; // OK
    notNullable = getNotNullable(); // OK
  }

  void setNullableToExternalIsBAD(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;
  }

  void setNonNullToExternalIsOK(String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;
  }

  void setNullableToExternalNullableIsOK(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNullable = s;
  }

  // Mutated code
  @Nullable String c = "";
  String d = "";

  @Nullable
  String getNullablea() {
    return "";
  }

  String getNotNullablea() {
    return "";
  }

  void setNullableToNotNullableIsBADA(@Nullable String s) {
    d = null; // BAD
    d = s; // BAD
    d = getNullablea(); // BAD (even though getNullable() does not really return null)
  }

  void setNullableToNullableIsOKa(@Nullable String s) {
    c = null; // OK
    c = s; // OK
    c = getNullablea(); // OK
  }

  void setNotNullableToNotNullableIsOKa(String s) {
    d = "abc"; // OK
    d = s; // OK
    d = getNotNullablea(); // OK
  }

  void setNullableToExternalIsBADA(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;
  }

  void setNonNullToExternalIsOKa(String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;
  }

  void setNullableToExternalNullableIsOKa(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNullable = s;
  }
}

class SomeExternalClass {
  public String externalNotNull;
  public @Nullable String externalNullable;
}