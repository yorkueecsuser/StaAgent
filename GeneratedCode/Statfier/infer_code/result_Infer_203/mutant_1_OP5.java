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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        someObject = "unreachable";
        break;
    }
  }

  @Override
  public void onDestroy() {
    // onDestroy is a special method: OK to nullify here
    someObject = null;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        someObject = "unreachable";
        break;
    }
  }

  @Cleanup
  public void assignNullInCleanupMethodIsOK() {
    // The method is marked as cleanup.
    // OK to nullify here.
    someObject = null;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        someObject = "unreachable";
        break;
    }
  }

  public void assignNullInAnyOtherMethodIsBAD() {
    someObject = null; // BAD: field is not nullable

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        someObject = "unreachable";
        break;
    }
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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        notNullable = "unreachable";
        break;
    }
  }

  void setNullableToNullableIsOK(@Nullable String s) {
    nullable = null; // OK
    nullable = s; // OK
    nullable = getNullable(); // OK

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        nullable = "unreachable";
        break;
    }
  }

  void setNotNullableToNotNullableIsOK(String s) {
    notNullable = "abc"; // OK
    notNullable = s; // OK
    notNullable = getNotNullable(); // OK

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        notNullable = "unreachable";
        break;
    }
  }

  void setNullableToExternalIsBAD(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        obj.externalNotNull = "unreachable";
        break;
    }
  }

  void setNonNullToExternalIsOK(String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        obj.externalNotNull = "unreachable";
        break;
    }
  }

  void setNullableToExternalNullableIsOK(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNullable = s;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        obj.externalNullable = "unreachable";
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class SomeExternalClass {
  public String externalNotNull;
  public @Nullable String externalNullable;
}