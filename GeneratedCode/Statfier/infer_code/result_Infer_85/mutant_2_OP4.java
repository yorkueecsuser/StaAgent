import android.app.AlarmManager;
import android.app.PendingIntent;
import codetoanalyze.java.annotation.Assertions;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

class NullMethodCall {

  void callOnNull() {
    String s = null;
    int n = s.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  void callOnEmptyString() {
    String s = "";
    int n = s.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  void callAfterYodaCondition(@Nullable String s) {
    if (null!= s) {
      int n = s.length();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  int objectLength(@Nullable Object o) {
    if (o instanceof String) {
      String s = (String) o;
      return s.length(); // OK: s cannot be null because of instanceof
    }
    return 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  int testCheckState(@Nullable String s1, @Nullable String s2) {
    Preconditions.checkState(s1!= null && s2!= null, "bad");
    return s1.length() + s2.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  int testPrivateStaticInnerClassField() {
    String s;
    S.sfld = "abc";
    s = S.sfld;
    return s.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  private static class S {
    private static @Nullable String sfld;
  }

  @Nullable String fld;
  private @Nullable String pfld;

  class Inner {
    int outerField() {
      String s = fld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    int outerFieldInitialized() {
      fld = "abc";
      String s = fld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    int outerPrivateField() {
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    int outerPrivateFieldInitialized() {
      pfld = "abc";
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    int outerPrivateFieldCheckNotNull() {
      Preconditions.checkNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    int outerPrivateFieldCheckState() {
      Preconditions.checkState(pfld!= null);
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    int outerPrivateFieldAssertNotNull() {
      Assertions.assertNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    int outerPrivateFieldAssumeNotNull() {
      Assertions.assumeNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    int outerPrivateFieldAssertCondition() {
      Assertions.assertCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    int outerPrivateFieldAssumeCondition() {
      Assertions.assumeCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    int outerPrivateFieldCheckStateYoda() {
      Preconditions.checkState(null!= pfld);
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    String outerFieldGuardPrivate() {
      if (pfld!= null) return pfld.toString();
      return "";
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    String outerFieldGuardPublic() {
      if (fld!= null) return fld.toString();
      return "";
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    class InnerInner {
      int outerouterPrivateFieldInitialized() {
        pfld = "abc";
        String s = pfld;
        return s.length();
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Unreachable if-else statement
        } else {
          // This branch is unreachable
        }
      }
    }
  }

  @Nullable
  String getNullable() {
    return null;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  void testVariableAssigmentInsideConditional() {
    String s = null;
    if ((s = getNullable())!= null) {
      int n = s.length();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  void testFieldAssigmentInsideConditional() {
    if ((fld = getNullable())!= null) {
      int n = fld.length();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  String abc = "abc";

  void testFieldAssignmentIfThenElse(String name) {
    String s = (name.length() == 0)? null : abc;
    int n = s.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  static String throwsExn() throws java.io.IOException {
    throw new java.io.IOException();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  void testExceptionPerInstruction(int z) throws java.io.IOException {
    String s = null;

    try {
      s = throwsExn();
    } finally {
      int n = s.length();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  class InitializeAndExceptions {
    String s;

    String bad() throws java.io.IOException {
      throw new java.io.IOException();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    InitializeAndExceptions() throws java.io.IOException {
      s = bad(); // should not report field not initialized
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }
  }

  class InitializeViaPrivateMethod {
    String name;

    private void reallyInitName(String s) {
      name = s;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    private void initName(String s) {
      reallyInitName(s);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    InitializeViaPrivateMethod() {
      initName("abc");
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }
  }

  class CheckNotNullVararg {
    void checkNotNull(String msg, Object... objects) {}

    void testCheckNotNullVaratg(@Nullable String s1, @Nullable String s2) {
      checkNotNull("hello", s1, s2);
      s1.isEmpty();
      s2.isEmpty();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }

    void testRepeatedCheckNotNull(@Nullable String s) {
      checkNotNull("abc", s);
      checkNotNull("abc", s.toString());
      s.toString().isEmpty();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }
  }

  public void testSystemGetPropertyReturn() {
    String s = System.getProperty("");
    int n = s.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  int testSystemGetenvBad() {
    String envValue = System.getenv("WHATEVER");
    return envValue.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  class SystemExitDoesNotReturn {
    native boolean whoknows();

    void testOK() {
      String s = null;
      if (whoknows()) {
        s = "a";
      } else {
        System.exit(1);
      }
      int n = s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
      } else {
        // This branch is unreachable
      }
    }
  }

  public void testMapGetBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.get("foo").toString();
    hm.get("foo").toString();
    chm.get("foo").toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  public void testMapRemoveBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.remove("foo").toString();
    hm.remove("foo").toString();
    chm.remove("foo").toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  @Nullable Object nullableField;

  void FP_propagatesNonNullAfterComparisonFieldOkay(Object nonNullObject) {
    if (nullableField == nonNullObject) {
      nullableField.toString();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  void FP_propagatesNonNullAfterComparisonParameterOkay(
      @Nullable Object nullableParameter, Object nonNullParameter) {
    if (nullableParameter == nonNullParameter) {
      nullableParameter.toString();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  String customPreconditionsCheckNotNullOkay() {
    MyPreconditions.checkNotNull(nullableField);
    return nullableField.toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  String customPreconditionsCheckStateOkay() {
    MyPreconditions.checkState(nullableField!= null);
    return nullableField.toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  String customPreconditionsCheckArgumentOkay(@Nullable Object arg) {
    MyPreconditions.checkState(arg!= null);
    return arg.toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  void nullMethodCallWithAlarmManager(AlarmManager manager, @Nullable PendingIntent intent) {
    manager.cancel(intent);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  String callingSeverSideNullableGetter(ServerSideDeserializer deserializer) {
    return deserializer.nullableGetter().toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  interface AnotherI {
    void withBooleanParameter(boolean test);

    void withObjectParameter(Object object);
  }

  void withConjuction(@Nullable AnotherI i, boolean test1, boolean test2) {
    i.withBooleanParameter(test1 && test2);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  void withConditionalAssignemnt(
      @Nullable AnotherI i, boolean test, Object object1, Object object2) {
    i.withObjectParameter(test? object1 : object2);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  String assertGetOnMapOK(Map<Integer, Object> map, Integer key) {
    return Assertions.assertGet(key, map).toString(); // No warning here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  String assertGetOnListOK(List<Object> list, int index) {
    return Assertions.assertGet(index, list).toString(); // No warning here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  String guavaVerifyNotNullOK(@Nullable Object object) {
    Verify.verifyNotNull(object);
    return object.toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  void nullabilityNotPreservedAfterAssignment() {
    if (getNullable()!= null) {
      Object t = getNullable();
      t.toString(); // Should not warn here
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  void nullabilityStoredInBooleanFP() {
    boolean isNotNull = getNullable()!= null;
    if (isNotNull) {
      getNullable().toString(); // Should not warn here
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  void testInAssignmentOK(@Nullable Object object) {
    Object t;
    while ((t = getNullable())!= null) {
      t.toString(); // Should not warn here
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  String testPathGetParent() {
    return Paths.get("foo").getParent().toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  String testNotDetectingInvariantFP(@Nullable Object object1, @Nullable Object object2) {
    if (object1 == null && object2 == null) {
      return "both null";
    }
    return object1 == null? object2.toString() : "null";
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // This branch is unreachable
    }
  }

  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically at runtime
  }
}