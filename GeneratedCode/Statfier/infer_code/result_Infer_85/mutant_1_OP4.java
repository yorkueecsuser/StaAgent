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
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void callOnEmptyString() {
    String s = "";
    int n = s.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void callAfterYodaCondition(@Nullable String s) {
    if (null!= s) {
      int n = s.length();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
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
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  int testCheckState(@Nullable String s1, @Nullable String s2) {
    Preconditions.checkState(s1!= null && s2!= null, "bad");
    return s1.length() + s2.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  int testPrivateStaticInnerClassField() {
    String s;
    S.sfld = "abc";
    s = S.sfld;
    return s.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
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
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    int outerFieldInitialized() {
      fld = "abc";
      String s = fld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    int outerPrivateField() {
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    int outerPrivateFieldInitialized() {
      pfld = "abc";
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    int outerPrivateFieldCheckNotNull() {
      Preconditions.checkNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    int outerPrivateFieldCheckState() {
      Preconditions.checkState(pfld!= null);
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    int outerPrivateFieldAssertNotNull() {
      Assertions.assertNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    int outerPrivateFieldAssumeNotNull() {
      Assertions.assumeNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    int outerPrivateFieldAssertCondition() {
      Assertions.assertCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    int outerPrivateFieldAssumeCondition() {
      Assertions.assumeCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    int outerPrivateFieldCheckStateYoda() {
      Preconditions.checkState(null!= pfld);
      String s = pfld;
      return s.length();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    String outerFieldGuardPrivate() {
      if (pfld!= null) return pfld.toString();
      return "";
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    String outerFieldGuardPublic() {
      if (fld!= null) return fld.toString();
      return "";
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    class InnerInner {
      int outerouterPrivateFieldInitialized() {
        pfld = "abc";
        String s = pfld;
        return s.length();
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Unreachable code
        } else {
          // Unreachable code
        }
      }
    }
  }

  @Nullable
  String getNullable() {
    return null;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void testVariableAssigmentInsideConditional() {
    String s = null;
    if ((s = getNullable())!= null) {
      int n = s.length();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void testFieldAssigmentInsideConditional() {
    if ((fld = getNullable())!= null) {
      int n = fld.length();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  String abc = "abc";

  void testFieldAssignmentIfThenElse(String name) {
    String s = (name.length() == 0)? null : abc;
    int n = s.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  static String throwsExn() throws java.io.IOException {
    throw new java.io.IOException();
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
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  class InitializeAndExceptions {
    String s;

    String bad() throws java.io.IOException {
      throw new java.io.IOException();
    }

    InitializeAndExceptions() throws java.io.IOException {
      s = bad(); // should not report field not initialized
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }
  }

  class InitializeViaPrivateMethod {
    String name;

    private void reallyInitName(String s) {
      name = s;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    private void initName(String s) {
      reallyInitName(s);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    InitializeViaPrivateMethod() {
      initName("abc");
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
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
        // Unreachable code
      } else {
        // Unreachable code
      }
    }

    void testRepeatedCheckNotNull(@Nullable String s) {
      checkNotNull("abc", s);
      checkNotNull("abc", s.toString());
      s.toString().isEmpty();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
      } else {
        // Unreachable code
      }
    }
  }

  public void testSystemGetPropertyReturn() {
    String s = System.getProperty("");
    int n = s.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  int testSystemGetenvBad() {
    String envValue = System.getenv("WHATEVER");
    return envValue.length();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
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
        // Unreachable code
      } else {
        // Unreachable code
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
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  public void testMapRemoveBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.remove("foo").toString();
    hm.remove("foo").toString();
    chm.remove("foo").toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  @Nullable Object nullableField;

  void FP_propagatesNonNullAfterComparisonFieldOkay(Object nonNullObject) {
    if (nullableField == nonNullObject) {
      nullableField.toString();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void FP_propagatesNonNullAfterComparisonParameterOkay(
      @Nullable Object nullableParameter, Object nonNullParameter) {
    if (nullableParameter == nonNullParameter) {
      nullableParameter.toString();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  String customPreconditionsCheckNotNullOkay() {
    MyPreconditions.checkNotNull(nullableField);
    return nullableField.toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  String customPreconditionsCheckStateOkay() {
    MyPreconditions.checkState(nullableField!= null);
    return nullableField.toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  String customPreconditionsCheckArgumentOkay(@Nullable Object arg) {
    MyPreconditions.checkState(arg!= null);
    return arg.toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void nullMethodCallWithAlarmManager(AlarmManager manager, @Nullable PendingIntent intent) {
    manager.cancel(intent);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  String callingSeverSideNullableGetter(ServerSideDeserializer deserializer) {
    return deserializer.nullableGetter().toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
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
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void withConditionalAssignemnt(
      @Nullable AnotherI i, boolean test, Object object1, Object object2) {
    i.withObjectParameter(test? object1 : object2);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  String assertGetOnMapOK(Map<Integer, Object> map, Integer key) {
    return Assertions.assertGet(key, map).toString(); // No warning here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  String assertGetOnListOK(List<Object> list, int index) {
    return Assertions.assertGet(index, list).toString(); // No warning here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  String guavaVerifyNotNullOK(@Nullable Object object) {
    Verify.verifyNotNull(object);
    return object.toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void nullabilityNotPreservedAfterAssignment() {
    if (getNullable()!= null) {
      Object t = getNullable();
      t.toString(); // Should not warn here
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void nullabilityStoredInBooleanFP() {
    boolean isNotNull = getNullable()!= null;
    if (isNotNull) {
      getNullable().toString(); // Should not warn here
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void testInAssignmentOK(@Nullable Object object) {
    Object t;
    while ((t = getNullable())!= null) {
      t.toString(); // Should not warn here
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  String testPathGetParent() {
    return Paths.get("foo").getParent().toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  String testNotDetectingInvariantFP(@Nullable Object object1, @Nullable Object object2) {
    if (object1 == null && object2 == null) {
      return "both null";
    }
    return object1 == null? object2.toString() : "null";
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}