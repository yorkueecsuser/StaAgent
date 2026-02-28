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
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void callOnEmptyString() {
    String s = "";
    int n = s.length();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void callAfterYodaCondition(@Nullable String s) {
    if (null!= s) {
      int n = s.length();
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  int objectLength(@Nullable Object o) {
    if (o instanceof String) {
      String s = (String) o;
      return s.length(); // OK: s cannot be null because of instanceof
    }
    return 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  int testCheckState(@Nullable String s1, @Nullable String s2) {
    Preconditions.checkState(s1!= null && s2!= null, "bad");
    return s1.length() + s2.length();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  int testPrivateStaticInnerClassField() {
    String s;
    S.sfld = "abc";
    s = S.sfld;
    return s.length();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
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
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    int outerFieldInitialized() {
      fld = "abc";
      String s = fld;
      return s.length();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    int outerPrivateField() {
      String s = pfld;
      return s.length();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    int outerPrivateFieldInitialized() {
      pfld = "abc";
      String s = pfld;
      return s.length();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    int outerPrivateFieldCheckNotNull() {
      Preconditions.checkNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    int outerPrivateFieldCheckState() {
      Preconditions.checkState(pfld!= null);
      String s = pfld;
      return s.length();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    int outerPrivateFieldAssertNotNull() {
      Assertions.assertNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    int outerPrivateFieldAssumeNotNull() {
      Assertions.assumeNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    int outerPrivateFieldAssertCondition() {
      Assertions.assertCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    int outerPrivateFieldAssumeCondition() {
      Assertions.assumeCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    int outerPrivateFieldCheckStateYoda() {
      Preconditions.checkState(null!= pfld);
      String s = pfld;
      return s.length();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    String outerFieldGuardPrivate() {
      if (pfld!= null) return pfld.toString();
      return "";
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    String outerFieldGuardPublic() {
      if (fld!= null) return fld.toString();
      return "";
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    class InnerInner {
      int outerouterPrivateFieldInitialized() {
        pfld = "abc";
        String s = pfld;
        return s.length();
        boolean conditionWhile = getCondition();
        while (conditionWhile) { /* unreachable code */ }
      }
    }
  }

  @Nullable
  String getNullable() {
    return null;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testVariableAssigmentInsideConditional() {
    String s = null;
    if ((s = getNullable())!= null) {
      int n = s.length();
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testFieldAssigmentInsideConditional() {
    if ((fld = getNullable())!= null) {
      int n = fld.length();
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  String abc = "abc";

  void testFieldAssignmentIfThenElse(String name) {
    String s = (name.length() == 0)? null : abc;
    int n = s.length();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  static String throwsExn() throws java.io.IOException {
    throw new java.io.IOException();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testExceptionPerInstruction(int z) throws java.io.IOException {
    String s = null;

    try {
      s = throwsExn();
    } finally {
      int n = s.length();
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  class InitializeAndExceptions {
    String s;

    String bad() throws java.io.IOException {
      throw new java.io.IOException();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    InitializeAndExceptions() throws java.io.IOException {
      s = bad(); // should not report field not initialized
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }
  }

  class InitializeViaPrivateMethod {
    String name;

    private void reallyInitName(String s) {
      name = s;
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    private void initName(String s) {
      reallyInitName(s);
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    InitializeViaPrivateMethod() {
      initName("abc");
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }
  }

  class CheckNotNullVararg {
    void checkNotNull(String msg, Object... objects) {}

    void testCheckNotNullVaratg(@Nullable String s1, @Nullable String s2) {
      checkNotNull("hello", s1, s2);
      s1.isEmpty();
      s2.isEmpty();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    void testRepeatedCheckNotNull(@Nullable String s) {
      checkNotNull("abc", s);
      checkNotNull("abc", s.toString());
      s.toString().isEmpty();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }
  }

  public void testSystemGetPropertyReturn() {
    String s = System.getProperty("");
    int n = s.length();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  int testSystemGetenvBad() {
    String envValue = System.getenv("WHATEVER");
    return envValue.length();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
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
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }
  }

  public void testMapGetBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.get("foo").toString();
    hm.get("foo").toString();
    chm.get("foo").toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  public void testMapRemoveBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.remove("foo").toString();
    hm.remove("foo").toString();
    chm.remove("foo").toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  @Nullable Object nullableField;

  void FP_propagatesNonNullAfterComparisonFieldOkay(Object nonNullObject) {
    if (nullableField == nonNullObject) {
      nullableField.toString();
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void FP_propagatesNonNullAfterComparisonParameterOkay(
      @Nullable Object nullableParameter, Object nonNullParameter) {
    if (nullableParameter == nonNullParameter) {
      nullableParameter.toString();
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  String customPreconditionsCheckNotNullOkay() {
    MyPreconditions.checkNotNull(nullableField);
    return nullableField.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  String customPreconditionsCheckStateOkay() {
    MyPreconditions.checkState(nullableField!= null);
    return nullableField.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  String customPreconditionsCheckArgumentOkay(@Nullable Object arg) {
    MyPreconditions.checkState(arg!= null);
    return arg.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void nullMethodCallWithAlarmManager(AlarmManager manager, @Nullable PendingIntent intent) {
    manager.cancel(intent);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  String callingSeverSideNullableGetter(ServerSideDeserializer deserializer) {
    return deserializer.nullableGetter().toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  interface AnotherI {
    void withBooleanParameter(boolean test);

    void withObjectParameter(Object object);
  }

  void withConjuction(@Nullable AnotherI i, boolean test1, boolean test2) {
    i.withBooleanParameter(test1 && test2);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void withConditionalAssignemnt(
      @Nullable AnotherI i, boolean test, Object object1, Object object2) {
    i.withObjectParameter(test? object1 : object2);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  String assertGetOnMapOK(Map<Integer, Object> map, Integer key) {
    return Assertions.assertGet(key, map).toString(); // No warning here
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  String assertGetOnListOK(List<Object> list, int index) {
    return Assertions.assertGet(index, list).toString(); // No warning here
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  String guavaVerifyNotNullOK(@Nullable Object object) {
    Verify.verifyNotNull(object);
    return object.toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void nullabilityNotPreservedAfterAssignment() {
    if (getNullable()!= null) {
      Object t = getNullable();
      t.toString(); // Should not warn here
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void nullabilityStoredInBooleanFP() {
    boolean isNotNull = getNullable()!= null;
    if (isNotNull) {
      getNullable().toString(); // Should not warn here
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testInAssignmentOK(@Nullable Object object) {
    Object t;
    while ((t = getNullable())!= null) {
      t.toString(); // Should not warn here
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  String testPathGetParent() {
    return Paths.get("foo").getParent().toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  String testNotDetectingInvariantFP(@Nullable Object object1, @Nullable Object object2) {
    if (object1 == null && object2 == null) {
      return "both null";
    }
    return object1 == null? object2.toString() : "null";
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  private boolean getCondition() {
    return false; // This method can be modified to return true/false based on dynamic conditions
  }
}