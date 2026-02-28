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

    // Unreachable switch statement mutation
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        someObject = "unreachable";
        break;
    }
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

  private boolean getCondition() {
    return false;
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

    // Unreachable switch statement mutation
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        notNullable = "unreachable";
        break;
    }
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

    // Unreachable switch statement mutation
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        obj.externalNotNull = "unreachable";
        break;
    }
  }

  void setNonNullToExternalIsOK(String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;
  }

  void setNullableToExternalNullableIsOK(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNullable = s;
  }

  private boolean getCondition() {
    return false;
  }
}

class SomeExternalClass {
  public String externalNotNull;
  public @Nullable String externalNullable;
}