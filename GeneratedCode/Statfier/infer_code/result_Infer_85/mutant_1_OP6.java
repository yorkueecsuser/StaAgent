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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void callOnEmptyString() {
    String s = "";
    int n = s.length();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void callAfterYodaCondition(@Nullable String s) {
    if (null!= s) {
      int n = s.length();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  int objectLength(@Nullable Object o) {
    if (o instanceof String) {
      String s = (String) o;
      return s.length(); // OK: s cannot be null because of instanceof
    }
    return 0;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  int testCheckState(@Nullable String s1, @Nullable String s2) {
    Preconditions.checkState(s1!= null && s2!= null, "bad");
    return s1.length() + s2.length();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  int testPrivateStaticInnerClassField() {
    String s;
    S.sfld = "abc";
    s = S.sfld;
    return s.length();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    int outerFieldInitialized() {
      fld = "abc";
      String s = fld;
      return s.length();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    int outerPrivateField() {
      String s = pfld;
      return s.length();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    int outerPrivateFieldInitialized() {
      pfld = "abc";
      String s = pfld;
      return s.length();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    int outerPrivateFieldCheckNotNull() {
      Preconditions.checkNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    int outerPrivateFieldCheckState() {
      Preconditions.checkState(pfld!= null);
      String s = pfld;
      return s.length();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    int outerPrivateFieldAssertNotNull() {
      Assertions.assertNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    int outerPrivateFieldAssumeNotNull() {
      Assertions.assumeNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    int outerPrivateFieldAssertCondition() {
      Assertions.assertCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    int outerPrivateFieldAssumeCondition() {
      Assertions.assumeCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    int outerPrivateFieldCheckStateYoda() {
      Preconditions.checkState(null!= pfld);
      String s = pfld;
      return s.length();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    String outerFieldGuardPrivate() {
      if (pfld!= null) return pfld.toString();
      return "";
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    String outerFieldGuardPublic() {
      if (fld!= null) return fld.toString();
      return "";
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    class InnerInner {
      int outerouterPrivateFieldInitialized() {
        pfld = "abc";
        String s = pfld;
        return s.length();
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
      }
    }
  }

  @Nullable
  String getNullable() {
    return null;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void testVariableAssigmentInsideConditional() {
    String s = null;
    if ((s = getNullable())!= null) {
      int n = s.length();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void testFieldAssigmentInsideConditional() {
    if ((fld = getNullable())!= null) {
      int n = fld.length();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  String abc = "abc";

  void testFieldAssignmentIfThenElse(String name) {
    String s = (name.length() == 0)? null : abc;
    int n = s.length();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  static String throwsExn() throws java.io.IOException {
    throw new java.io.IOException();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void testExceptionPerInstruction(int z) throws java.io.IOException {
    String s = null;

    try {
      s = throwsExn();
    } finally {
      int n = s.length();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  class InitializeAndExceptions {
    String s;

    String bad() throws java.io.IOException {
      throw new java.io.IOException();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    InitializeAndExceptions() throws java.io.IOException {
      s = bad(); // should not report field not initialized
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }
  }

  class InitializeViaPrivateMethod {
    String name;

    private void reallyInitName(String s) {
      name = s;
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    private void initName(String s) {
      reallyInitName(s);
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    InitializeViaPrivateMethod() {
      initName("abc");
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }
  }

  class CheckNotNullVararg {
    void checkNotNull(String msg, Object... objects) {}

    void testCheckNotNullVaratg(@Nullable String s1, @Nullable String s2) {
      checkNotNull("hello", s1, s2);
      s1.isEmpty();
      s2.isEmpty();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }

    void testRepeatedCheckNotNull(@Nullable String s) {
      checkNotNull("abc", s);
      checkNotNull("abc", s.toString());
      s.toString().isEmpty();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }
  }

  public void testSystemGetPropertyReturn() {
    String s = System.getProperty("");
    int n = s.length();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  int testSystemGetenvBad() {
    String envValue = System.getenv("WHATEVER");
    return envValue.length();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
    }
  }

  public void testMapGetBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.get("foo").toString();
    hm.get("foo").toString();
    chm.get("foo").toString();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  public void testMapRemoveBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.remove("foo").toString();
    hm.remove("foo").toString();
    chm.remove("foo").toString();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  @Nullable Object nullableField;

  void FP_propagatesNonNullAfterComparisonFieldOkay(Object nonNullObject) {
    if (nullableField == nonNullObject) {
      nullableField.toString();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void FP_propagatesNonNullAfterComparisonParameterOkay(
      @Nullable Object nullableParameter, Object nonNullParameter) {
    if (nullableParameter == nonNullParameter) {
      nullableParameter.toString();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  String customPreconditionsCheckNotNullOkay() {
    MyPreconditions.checkNotNull(nullableField);
    return nullableField.toString();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  String customPreconditionsCheckStateOkay() {
    MyPreconditions.checkState(nullableField!= null);
    return nullableField.toString();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  String customPreconditionsCheckArgumentOkay(@Nullable Object arg) {
    MyPreconditions.checkState(arg!= null);
    return arg.toString();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void nullMethodCallWithAlarmManager(AlarmManager manager, @Nullable PendingIntent intent) {
    manager.cancel(intent);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  String callingSeverSideNullableGetter(ServerSideDeserializer deserializer) {
    return deserializer.nullableGetter().toString();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  interface AnotherI {
    void withBooleanParameter(boolean test);

    void withObjectParameter(Object object);
  }

  void withConjuction(@Nullable AnotherI i, boolean test1, boolean test2) {
    i.withBooleanParameter(test1 && test2);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void withConditionalAssignemnt(
      @Nullable AnotherI i, boolean test, Object object1, Object object2) {
    i.withObjectParameter(test? object1 : object2);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  String assertGetOnMapOK(Map<Integer, Object> map, Integer key) {
    return Assertions.assertGet(key, map).toString(); // No warning here
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  String assertGetOnListOK(List<Object> list, int index) {
    return Assertions.assertGet(index, list).toString(); // No warning here
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  String guavaVerifyNotNullOK(@Nullable Object object) {
    Verify.verifyNotNull(object);
    return object.toString();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void nullabilityNotPreservedAfterAssignment() {
    if (getNullable()!= null) {
      Object t = getNullable();
      t.toString(); // Should not warn here
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void nullabilityStoredInBooleanFP() {
    boolean isNotNull = getNullable()!= null;
    if (isNotNull) {
      getNullable().toString(); // Should not warn here
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void testInAssignmentOK(@Nullable Object object) {
    Object t;
    while ((t = getNullable())!= null) {
      t.toString(); // Should not warn here
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  String testPathGetParent() {
    return Paths.get("foo").getParent().toString();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  String testNotDetectingInvariantFP(@Nullable Object object1, @Nullable Object object2) {
    if (object1 == null && object2 == null) {
      return "both null";
    }
    return object1 == null? object2.toString() : "null";
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}