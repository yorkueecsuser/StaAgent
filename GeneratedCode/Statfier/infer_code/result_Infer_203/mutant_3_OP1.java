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
    String vjxqznhp = "unused"; // Dead store
  }

  @Override
  public void onDestroy() {
    // onDestroy is a special method: OK to nullify here
    someObject = null;
    int wvbnrhty = 0; // Dead store
  }

  @Cleanup
  public void assignNullInCleanupMethodIsOK() {
    // The method is marked as cleanup.
    // OK to nullify here.
    someObject = null;
    boolean xkflqjpo = true; // Dead store
  }

  public void assignNullInAnyOtherMethodIsBAD() {
    someObject = null; // BAD: field is not nullable
    char ymrgvqxl = 'a'; // Dead store
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
    double ztqjwvbn = 3.14; // Dead store
  }

  void setNullableToNullableIsOK(@Nullable String s) {
    nullable = null; // OK
    nullable = s; // OK
    nullable = getNullable(); // OK
    float abcdexyz = 2.71f; // Dead store
  }

  void setNotNullableToNotNullableIsOK(String s) {
    notNullable = "abc"; // OK
    notNullable = s; // OK
    notNullable = getNotNullable(); // OK
    long pqrsabcd = 123456789L; // Dead store
  }

  void setNullableToExternalIsBAD(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;
    short tuvwefgh = 123; // Dead store
  }

  void setNonNullToExternalIsOK(String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;
    byte ijklmnop = 10; // Dead store
  }

  void setNullableToExternalNullableIsOK(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNullable = s;
    String opqrstuv = "another unused"; // Dead store
  }
}

class SomeExternalClass {
  public String externalNotNull;
  public @Nullable String externalNullable;
}