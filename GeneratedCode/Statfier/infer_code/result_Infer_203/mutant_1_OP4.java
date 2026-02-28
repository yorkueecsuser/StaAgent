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
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      someObject = "reachable";
    } else {
      // This is an unreachable block due to the condition always being false
      someObject = "unreachable";
    }
  }

  @Override
  public void onDestroy() {
    // onDestroy is a special method: OK to nullify here
    someObject = null;
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      someObject = "reachable";
    } else {
      // This is an unreachable block due to the condition always being false
      someObject = "unreachable";
    }
  }

  @Cleanup
  public void assignNullInCleanupMethodIsOK() {
    // The method is marked as cleanup.
    // OK to nullify here.
    someObject = null;
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      someObject = "reachable";
    } else {
      // This is an unreachable block due to the condition always being false
      someObject = "unreachable";
    }
  }

  public void assignNullInAnyOtherMethodIsBAD() {
    someObject = null; // BAD: field is not nullable
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      someObject = "reachable";
    } else {
      // This is an unreachable block due to the condition always being false
      someObject = "unreachable";
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
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
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      notNullable = "reachable";
    } else {
      // This is an unreachable block due to the condition always being false
      notNullable = "unreachable";
    }
  }

  void setNullableToNullableIsOK(@Nullable String s) {
    nullable = null; // OK
    nullable = s; // OK
    nullable = getNullable(); // OK
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      nullable = "reachable";
    } else {
      // This is an unreachable block due to the condition always being false
      nullable = "unreachable";
    }
  }

  void setNotNullableToNotNullableIsOK(String s) {
    notNullable = "abc"; // OK
    notNullable = s; // OK
    notNullable = getNotNullable(); // OK
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      notNullable = "reachable";
    } else {
      // This is an unreachable block due to the condition always being false
      notNullable = "unreachable";
    }
  }

  void setNullableToExternalIsBAD(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      obj.externalNotNull = "reachable";
    } else {
      // This is an unreachable block due to the condition always being false
      obj.externalNotNull = "unreachable";
    }
  }

  void setNonNullToExternalIsOK(String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNotNull = s;
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      obj.externalNotNull = "reachable";
    } else {
      // This is an unreachable block due to the condition always being false
      obj.externalNotNull = "unreachable";
    }
  }

  void setNullableToExternalNullableIsOK(@Nullable String s) {
    SomeExternalClass obj = new SomeExternalClass();
    obj.externalNullable = s;
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      obj.externalNullable = "reachable";
    } else {
      // This is an unreachable block due to the condition always being false
      obj.externalNullable = "unreachable";
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}

class SomeExternalClass {
  public String externalNotNull;
  public @Nullable String externalNullable;
}