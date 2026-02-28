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
    String x = null; // Mutant
    int y = x.length(); // Mutant
  }

  void callOnEmptyString() {
    String s = "";
    int n = s.length();
    String a = ""; // Mutant
    int b = a.length(); // Mutant
  }

  void callAfterYodaCondition(@Nullable String s) {
    if (null!= s) {
      int n = s.length();
    }
    if (null!= s) {
      int m = s.length(); // Mutant
    }
  }

  int objectLength(@Nullable Object o) {
    if (o instanceof String) {
      String s = (String) o;
      return s.length(); // OK: s cannot be null because of instanceof
    }
    return 0;
    Object p = o; // Mutant
    if (p instanceof String) {
      String q = (String) p;
      return q.length(); // Mutant
    }
  }

  int testCheckState(@Nullable String s1, @Nullable String s2) {
    Preconditions.checkState(s1!= null && s2!= null, "bad");
    return s1.length() + s2.length();
    Preconditions.checkState(s1!= null && s2!= null, "bad");
    return s1.length() + s2.length(); // Mutant
  }

  int testPrivateStaticInnerClassField() {
    String s;
    S.sfld = "abc";
    s = S.sfld;
    return s.length();
    String t; // Mutant
    S.sfld = "abc";
    t = S.sfld;
    return t.length(); // Mutant
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
      String t = fld; // Mutant
      return t.length(); // Mutant
    }

    int outerFieldInitialized() {
      fld = "abc";
      String s = fld;
      return s.length();
      fld = "abc";
      String t = fld; // Mutant
      return t.length(); // Mutant
    }

    int outerPrivateField() {
      String s = pfld;
      return s.length();
      String t = pfld; // Mutant
      return t.length(); // Mutant
    }

    int outerPrivateFieldInitialized() {
      pfld = "abc";
      String s = pfld;
      return s.length();
      pfld = "abc";
      String t = pfld; // Mutant
      return t.length(); // Mutant
    }

    int outerPrivateFieldCheckNotNull() {
      Preconditions.checkNotNull(pfld);
      String s = pfld;
      return s.length();
      Preconditions.checkNotNull(pfld);
      String t = pfld; // Mutant
      return t.length(); // Mutant
    }

    int outerPrivateFieldCheckState() {
      Preconditions.checkState(pfld!= null);
      String s = pfld;
      return s.length();
      Preconditions.checkState(pfld!= null);
      String t = pfld; // Mutant
      return t.length(); // Mutant
    }

    int outerPrivateFieldAssertNotNull() {
      Assertions.assertNotNull(pfld);
      String s = pfld;
      return s.length();
      Assertions.assertNotNull(pfld);
      String t = pfld; // Mutant
      return t.length(); // Mutant
    }

    int outerPrivateFieldAssumeNotNull() {
      Assertions.assumeNotNull(pfld);
      String s = pfld;
      return s.length();
      Assertions.assumeNotNull(pfld);
      String t = pfld; // Mutant
      return t.length(); // Mutant
    }

    int outerPrivateFieldAssertCondition() {
      Assertions.assertCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      Assertions.assertCondition(pfld!= null, "explanation");
      String t = pfld; // Mutant
      return t.length(); // Mutant
    }

    int outerPrivateFieldAssumeCondition() {
      Assertions.assumeCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      Assertions.assumeCondition(pfld!= null, "explanation");
      String t = pfld; // Mutant
      return t.length(); // Mutant
    }

    int outerPrivateFieldCheckStateYoda() {
      Preconditions.checkState(null!= pfld);
      String s = pfld;
      return s.length();
      Preconditions.checkState(null!= pfld);
      String t = pfld; // Mutant
      return t.length(); // Mutant
    }

    String outerFieldGuardPrivate() {
      if (pfld!= null) return pfld.toString();
      return "";
      if (pfld!= null) return pfld.toString(); // Mutant
      return ""; // Mutant
    }

    String outerFieldGuardPublic() {
      if (fld!= null) return fld.toString();
      return "";
      if (fld!= null) return fld.toString(); // Mutant
      return ""; // Mutant
    }

    class InnerInner {
      int outerouterPrivateFieldInitialized() {
        pfld = "abc";
        String s = pfld;
        return s.length();
        pfld = "abc";
        String t = pfld; // Mutant
        return t.length(); // Mutant
      }
    }
  }

  @Nullable
  String getNullable() {
    return null;
  }

  void testVariableAssigmentInsideConditional() {
    String s = null;
    if ((s = getNullable())!= null) {
      int n = s.length();
    }
    String x = null; // Mutant
    if ((x = getNullable())!= null) {
      int y = x.length(); // Mutant
    }
  }

  void testFieldAssigmentInsideConditional() {
    if ((fld = getNullable())!= null) {
      int n = fld.length();
    }
    if ((pfld = getNullable())!= null) { // Mutant
      int t = pfld.length(); // Mutant
    }
  }

  String abc = "abc";

  void testFieldAssignmentIfThenElse(String name) {
    String s = (name.length() == 0)? null : abc;
    int n = s.length();
    String a = (name.length() == 0)? null : abc; // Mutant
    int b = a.length(); // Mutant
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
    String x = null; // Mutant
    try {
      x = throwsExn();
    } finally {
      int y = x.length(); // Mutant
    }
  }

  class InitializeAndExceptions {
    String s;

    String bad() throws java.io.IOException {
      throw new java.io.IOException();
    }

    InitializeAndExceptions() throws java.io.IOException {
      s = bad(); // should not report field not initialized
    }
    String t;

    String badMutant() throws java.io.IOException {
      throw new java.io.IOException();
    }

    InitializeAndExceptions() throws java.io.IOException {
      t = badMutant(); // should not report field not initialized // Mutant
    }
  }

  class InitializeViaPrivateMethod {
    String name;

    private void reallyInitName(String s) {
      name = s;
    }

    private void initName(String s) {
      reallyInitName(s);
    }

    InitializeViaPrivateMethod() {
      initName("abc");
    }
    String t;

    private void reallyInitNameMutant(String s) {
      t = s; // Mutant
    }

    private void initNameMutant(String s) {
      reallyInitNameMutant(s); // Mutant
    }

    InitializeViaPrivateMethod() {
      initNameMutant("abc"); // Mutant
    }
  }

  class CheckNotNullVararg {
    void checkNotNull(String msg, Object... objects) {}

    void testCheckNotNullVaratg(@Nullable String s1, @Nullable String s2) {
      checkNotNull("hello", s1, s2);
      s1.isEmpty();
      s2.isEmpty();
      checkNotNull("hello", s1, s2); // Mutant
      s1.isEmpty(); // Mutant
      s2.isEmpty(); // Mutant
    }

    void testRepeatedCheckNotNull(@Nullable String s) {
      checkNotNull("abc", s);
      checkNotNull("abc", s.toString());
      s.toString().isEmpty();
      checkNotNull("abc", s); // Mutant
      checkNotNull("abc", s.toString()); // Mutant
      s.toString().isEmpty(); // Mutant
    }
  }

  public void testSystemGetPropertyReturn() {
    String s = System.getProperty("");
    int n = s.length();
    String x = System.getProperty(""); // Mutant
    int y = x.length(); // Mutant
  }

  int testSystemGetenvBad() {
    String envValue = System.getenv("WHATEVER");
    return envValue.length();
    String envVar = System.getenv("WHATEVER"); // Mutant
    return envVar.length(); // Mutant
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
      String x = null; // Mutant
      if (whoknows()) {
        x = "a"; // Mutant
      } else {
        System.exit(1); // Mutant
      }
      int y = x.length(); // Mutant
    }
  }

  public void testMapGetBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.get("foo").toString();
    hm.get("foo").toString();
    chm.get("foo").toString();
    m.get("bar").toString(); // Mutant
    hm.get("bar").toString(); // Mutant
    chm.get("bar").toString(); // Mutant
  }

  public void testMapRemoveBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.remove("foo").toString();
    hm.remove("foo").toString();
    chm.remove("foo").toString();
    m.remove("bar").toString(); // Mutant
    hm.remove("bar").toString(); // Mutant
    chm.remove("bar").toString(); // Mutant
  }

  @Nullable Object nullableField;

  void FP_propagatesNonNullAfterComparisonFieldOkay(Object nonNullObject) {
    if (nullableField == nonNullObject) {
      nullableField.toString();
    }
    if (nullableField == nonNullObject) {
      nullableField.toString(); // Mutant
    }
  }

  void FP_propagatesNonNullAfterComparisonParameterOkay(
      @Nullable Object nullableParameter, Object nonNullParameter) {
    if (nullableParameter == nonNullParameter) {
      nullableParameter.toString();
    }
    if (nullableParameter == nonNullParameter) {
      nullableParameter.toString(); // Mutant
    }
  }

  String customPreconditionsCheckNotNullOkay() {
    MyPreconditions.checkNotNull(nullableField);
    return nullableField.toString();
    MyPreconditions.checkNotNull(nullableField);
    return nullableField.toString(); // Mutant
  }

  String customPreconditionsCheckStateOkay() {
    MyPreconditions.checkState(nullableField!= null);
    return nullableField.toString();
    MyPreconditions.checkState(nullableField!= null);
    return nullableField.toString(); // Mutant
  }

  String customPreconditionsCheckArgumentOkay(@Nullable Object arg) {
    MyPreconditions.checkState(arg!= null);
    return arg.toString();
    MyPreconditions.checkState(arg!= null);
    return arg.toString(); // Mutant
  }

  void nullMethodCallWithAlarmManager(AlarmManager manager, @Nullable PendingIntent intent) {
    manager.cancel(intent);
    AlarmManager mgr = manager; // Mutant
    mgr.cancel(intent); // Mutant
  }

  String callingSeverSideNullableGetter(ServerSideDeserializer deserializer) {
    return deserializer.nullableGetter().toString();
    ServerSideDeserializer d = deserializer; // Mutant
    return d.nullableGetter().toString(); // Mutant
  }

  interface AnotherI {
    void withBooleanParameter(boolean test);

    void withObjectParameter(Object object);
  }

  void withConjuction(@Nullable AnotherI i, boolean test1, boolean test2) {
    i.withBooleanParameter(test1 && test2);
    i.withBooleanParameter(test1 && test2); // Mutant
  }

  void withConditionalAssignemnt(
      @Nullable AnotherI i, boolean test, Object object1, Object object2) {
    i.withObjectParameter(test? object1 : object2);
    i.withObjectParameter(test? object1 : object2); // Mutant
  }

  String assertGetOnMapOK(Map<Integer, Object> map, Integer key) {
    return Assertions.assertGet(key, map).toString(); // No warning here
    return Assertions.assertGet(key, map).toString(); // Mutant
  }

  String assertGetOnListOK(List<Object> list, int index) {
    return Assertions.assertGet(index, list).toString(); // No warning here
    return Assertions.assertGet(index, list).toString(); // Mutant
  }

  String guavaVerifyNotNullOK(@Nullable Object object) {
    Verify.verifyNotNull(object);
    return object.toString();
    Verify.verifyNotNull(object);
    return object.toString(); // Mutant
  }

  void nullabilityNotPreservedAfterAssignment() {
    if (getNullable()!= null) {
      Object t = getNullable();
      t.toString(); // Should not warn here
    }
    if (getNullable()!= null) {
      Object u = getNullable(); // Mutant
      u.toString(); // Mutant
    }
  }

  void nullabilityStoredInBooleanFP() {
    boolean isNotNull = getNullable()!= null;
    if (isNotNull) {
      getNullable().toString(); // Should not warn here
    }
    boolean notNull = getNullable()!= null; // Mutant
    if (notNull) {
      getNullable().toString(); // Mutant
    }
  }

  void testInAssignmentOK(@Nullable Object object) {
    Object t;
    while ((t = getNullable())!= null) {
      t.toString(); // Should not warn here
    }
    Object u;
    while ((u = getNullable())!= null) {
      u.toString(); // Should not warn here // Mutant
    }
  }

  String testPathGetParent() {
    return Paths.get("foo").getParent().toString();
    return Paths.get("bar").getParent().toString(); // Mutant
  }

  String testNotDetectingInvariantFP(@Nullable Object object1, @Nullable Object object2) {
    if (object1 == null && object2 == null) {
      return "both null";
    }
    return object1 == null? object2.toString() : "null";
    if (object1 == null && object2 == null) {
      return "both null"; // Mutant
    }
    return object1 == null? object2.toString() : "null"; // Mutant
  }
}