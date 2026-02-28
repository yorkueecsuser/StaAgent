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
    someObject = null; // Mutation: duplicated assignment
  }

  @Override
  public void onDestroy() {
    // onDestroy is a special method: OK to nullify here
    someObject = null;
    someObject = null; // Mutation: duplicated assignment
  }

  @Cleanup
  public void assignNullInCleanupMethodIsOK() {
    // The method is marked as cleanup.
    // OK to nullify here.
    someObject = null;
    someObject = null; // Mutation: duplicated assignment
  }

  public void assignNullInAnyOtherMethodIsBAD() {
    someObject = null; // BAD: field is not nullable
    someObject = null; // Mutation: duplicated assignment
  }
}

class FieldNotNullable {
  @Nullable String nullable = "";
  String notNullable = "";

  String initializeNonNullableWithNullIsBAD = null;
  initializeNonNullableWithNullIsBAD = null; // Mutation: duplicated assignment

  @Nullable String initializeNullableWithNullIsOK = null;
  initializeNullableWithNullIsOK = null; // Mutation: duplicated assignment

  @Nullable
  String getNullable() {
    return "";
  }

  String getNotNullable() {
    return "";
  }

  void setNullableToNotNullableIsBAD(@Nullable String s) {
    notNullable = null; // BAD
    notNullable = null; // Mutation: duplicated assignment
    notNullable = s; // BAD
    notNullable = s; // Mutation: duplicated assignment
    notNullable = getNullable(); // BAD (even though getNullable() does not really return null)
    notNullable = getNullable(); // Mutation: duplicated assignment
  }

  void setNullableToNullableIsOK(@Nullable String s) {
    nullable = null; // OK
    nullable = null; // Mutation: duplicated assignment
    nullable = s; // OK
    nullable = s; // Mutation: duplicated assignment
    nullable = getNullable(); // OK
    nullable = getNullable(); // Mutation: duplicated assignment
  }

  void setNotNullableToNotNullableIsOK(String s) {
    notNullable = "abc"; // OK
    notNullable = "abc"; // Mutation: duplicated assignment
    notNullable = s; // OK
    notNullable = s; // Mutation: duplicated assignment
    notNullable = getNotNullable(); // OK
    notNullable = getNotNullable(); // Mutation: duplicated assignment
  }

  void setNullableToExternalIsBAD(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;
    obj.externalNotNull = s; // Mutation: duplicated assignment
  }

  void setNonNullToExternalIsOK(String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;
    obj.externalNotNull = s; // Mutation: duplicated assignment
  }

  void setNullableToExternalNullableIsOK(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNullable = s;
    obj.externalNullable = s; // Mutation: duplicated assignment
  }
}

class SomeExternalClass {
  public String externalNotNull;
  public @Nullable String externalNullable;
}