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
    String x = null; // Mutant: Renamed's' to 'x'
    int y = x.length();
  }

  void callOnEmptyString() {
    String s = "";
    int n = s.length();
    String t = ""; // Mutant: Renamed's' to 't'
    int u = t.length();
  }

  void callAfterYodaCondition(@Nullable String s) {
    if (null!= s) {
      int n = s.length();
    }
    if (null!= s) {
      int m = s.length(); // Mutant: Renamed 'n' to'm'
    }
  }

  int objectLength(@Nullable Object o) {
    if (o instanceof String) {
      String s = (String) o;
      return s.length(); // OK: s cannot be null because of instanceof
    }
    return 0;
    if (o instanceof String) {
      String q = (String) o; // Mutant: Renamed's' to 'q'
      return q.length(); // OK: q cannot be null because of instanceof
    }
    return 0;
  }

  int testCheckState(@Nullable String s1, @Nullable String s2) {
    Preconditions.checkState(s1!= null && s2!= null, "bad");
    return s1.length() + s2.length();
    Preconditions.checkState(s1!= null && s2!= null, "bad");
    return s1.length() + s2.length(); // Mutant: No change needed as no other variable to rename
  }

  int testPrivateStaticInnerClassField() {
    String s;
    S.sfld = "abc";
    s = S.sfld;
    return s.length();
    String r; // Mutant: Renamed's' to 'r'
    S.sfld = "abc";
    r = S.sfld;
    return r.length();
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
      String v = fld; // Mutant: Renamed's' to 'v'
      return v.length();
    }

    int outerFieldInitialized() {
      fld = "abc";
      String s = fld;
      return s.length();
      fld = "abc";
      String w = fld; // Mutant: Renamed's' to 'w'
      return w.length();
    }

    int outerPrivateField() {
      String s = pfld;
      return s.length();
      String z = pfld; // Mutant: Renamed's' to 'z'
      return z.length();
    }

    int outerPrivateFieldInitialized() {
      pfld = "abc";
      String s = pfld;
      return s.length();
      pfld = "abc";
      String a = pfld; // Mutant: Renamed's' to 'a'
      return a.length();
    }

    int outerPrivateFieldCheckNotNull() {
      Preconditions.checkNotNull(pfld);
      String s = pfld;
      return s.length();
      Preconditions.checkNotNull(pfld);
      String b = pfld; // Mutant: Renamed's' to 'b'
      return b.length();
    }

    int outerPrivateFieldCheckState() {
      Preconditions.checkState(pfld!= null);
      String s = pfld;
      return s.length();
      Preconditions.checkState(pfld!= null);
      String c = pfld; // Mutant: Renamed's' to 'c'
      return c.length();
    }

    int outerPrivateFieldAssertNotNull() {
      Assertions.assertNotNull(pfld);
      String s = pfld;
      return s.length();
      Assertions.assertNotNull(pfld);
      String d = pfld; // Mutant: Renamed's' to 'd'
      return d.length();
    }

    int outerPrivateFieldAssumeNotNull() {
      Assertions.assumeNotNull(pfld);
      String s = pfld;
      return s.length();
      Assertions.assumeNotNull(pfld);
      String e = pfld; // Mutant: Renamed's' to 'e'
      return e.length();
    }

    int outerPrivateFieldAssertCondition() {
      Assertions.assertCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      Assertions.assertCondition(pfld!= null, "explanation");
      String f = pfld; // Mutant: Renamed's' to 'f'
      return f.length();
    }

    int outerPrivateFieldAssumeCondition() {
      Assertions.assumeCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      Assertions.assumeCondition(pfld!= null, "explanation");
      String g = pfld; // Mutant: Renamed's' to 'g'
      return g.length();
    }

    int outerPrivateFieldCheckStateYoda() {
      Preconditions.checkState(null!= pfld);
      String s = pfld;
      return s.length();
      Preconditions.checkState(null!= pfld);
      String h = pfld; // Mutant: Renamed's' to 'h'
      return h.length();
    }

    String outerFieldGuardPrivate() {
      if (pfld!= null) return pfld.toString();
      return "";
      if (pfld!= null) return pfld.toString(); // Mutant: No change needed as no other variable to rename
    }

    String outerFieldGuardPublic() {
      if (fld!= null) return fld.toString();
      return "";
      if (fld!= null) return fld.toString(); // Mutant: No change needed as no other variable to rename
    }

    class InnerInner {
      int outerouterPrivateFieldInitialized() {
        pfld = "abc";
        String s = pfld;
        return s.length();
        pfld = "abc";
        String i = pfld; // Mutant: Renamed's' to 'i'
        return i.length();
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
    String j = null; // Mutant: Renamed's' to 'j'
    if ((j = getNullable())!= null) {
      int k = j.length();
    }
  }

  void testFieldAssigmentInsideConditional() {
    if ((fld = getNullable())!= null) {
      int n = fld.length();
    }
    if ((fld = getNullable())!= null) {
      int l = fld.length(); // Mutant: Renamed 'n' to 'l'
    }
  }

  String abc = "abc";

  void testFieldAssignmentIfThenElse(String name) {
    String s = (name.length() == 0)? null : abc;
    int n = s.length();
    String o = (name.length() == 0)? null : abc; // Mutant: Renamed's' to 'o'
    int p = o.length();
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
    String q = null; // Mutant: Renamed's' to 'q'
    try {
      q = throwsExn();
    } finally {
      int r = q.length();
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
  }

  class CheckNotNullVararg {
    void checkNotNull(String msg, Object... objects) {}

    void testCheckNotNullVaratg(@Nullable String s1, @Nullable String s2) {
      checkNotNull("hello", s1, s2);
      s1.isEmpty();
      s2.isEmpty();
      checkNotNull("hello", s1, s2); // Mutant: No change needed as no other variable to rename
      s1.isEmpty();
      s2.isEmpty();
    }

    void testRepeatedCheckNotNull(@Nullable String s) {
      checkNotNull("abc", s);
      checkNotNull("abc", s.toString());
      s.toString().isEmpty();
      checkNotNull("abc", s); // Mutant: No change needed as no other variable to rename
      checkNotNull("abc", s.toString());
      s.toString().isEmpty();
    }
  }

  public void testSystemGetPropertyReturn() {
    String s = System.getProperty("");
    int n = s.length();
    String t = System.getProperty(""); // Mutant: Renamed's' to 't'
    int u = t.length();
  }

  int testSystemGetenvBad() {
    String envValue = System.getenv("WHATEVER");
    return envValue.length();
    String envVar = System.getenv("WHATEVER"); // Mutant: Renamed 'envValue' to 'envVar'
    return envVar.length();
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
      String t = null; // Mutant: Renamed's' to 't'
      if (whoknows()) {
        t = "a";
      } else {
        System.exit(1);
      }
      int u = t.length();
    }
  }

  public void testMapGetBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.get("foo").toString();
    hm.get("foo").toString();
    chm.get("foo").toString();
    m.get("foo").toString(); // Mutant: No change needed as no other variable to rename
    hm.get("foo").toString();
    chm.get("foo").toString();
  }

  public void testMapRemoveBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.remove("foo").toString();
    hm.remove("foo").toString();
    chm.remove("foo").toString();
    m.remove("foo").toString(); // Mutant: No change needed as no other variable to rename
    hm.remove("foo").toString();
    chm.remove("foo").toString();
  }

  @Nullable Object nullableField;

  void FP_propagatesNonNullAfterComparisonFieldOkay(Object nonNullObject) {
    if (nullableField == nonNullObject) {
      nullableField.toString();
    }
    if (nullableField == nonNullObject) {
      nullableField.toString(); // Mutant: No change needed as no other variable to rename
    }
  }

  void FP_propagatesNonNullAfterComparisonParameterOkay(
      @Nullable Object nullableParameter, Object nonNullParameter) {
    if (nullableParameter == nonNullParameter) {
      nullableParameter.toString();
    }
    if (nullableParameter == nonNullParameter) {
      nullableParameter.toString(); // Mutant: No change needed as no other variable to rename
    }
  }

  String customPreconditionsCheckNotNullOkay() {
    MyPreconditions.checkNotNull(nullableField);
    return nullableField.toString();
    MyPreconditions.checkNotNull(nullableField); // Mutant: No change needed as no other variable to rename
    return nullableField.toString();
  }

  String customPreconditionsCheckStateOkay() {
    MyPreconditions.checkState(nullableField!= null);
    return nullableField.toString();
    MyPreconditions.checkState(nullableField!= null); // Mutant: No change needed as no other variable to rename
    return nullableField.toString();
  }

  String customPreconditionsCheckArgumentOkay(@Nullable Object arg) {
    MyPreconditions.checkState(arg!= null);
    return arg.toString();
    MyPreconditions.checkState(arg!= null); // Mutant: No change needed as no other variable to rename
    return arg.toString();
  }

  void nullMethodCallWithAlarmManager(AlarmManager manager, @Nullable PendingIntent intent) {
    manager.cancel(intent);
    AlarmManager mgr = manager; // Mutant: Renamed'manager' to'mgr'
    mgr.cancel(intent);
  }

  String callingSeverSideNullableGetter(ServerSideDeserializer deserializer) {
    return deserializer.nullableGetter().toString();
    return deserializer.nullableGetter().toString(); // Mutant: No change needed as no other variable to rename
  }

  interface AnotherI {
    void withBooleanParameter(boolean test);

    void withObjectParameter(Object object);
  }

  void withConjuction(@Nullable AnotherI i, boolean test1, boolean test2) {
    i.withBooleanParameter(test1 && test2);
    i.withBooleanParameter(test1 && test2); // Mutant: No change needed as no other variable to rename
  }

  void withConditionalAssignemnt(
      @Nullable AnotherI i, boolean test, Object object1, Object object2) {
    i.withObjectParameter(test? object1 : object2);
    i.withObjectParameter(test? object1 : object2); // Mutant: No change needed as no other variable to rename
  }

  String assertGetOnMapOK(Map<Integer, Object> map, Integer key) {
    return Assertions.assertGet(key, map).toString(); // No warning here
    return Assertions.assertGet(key, map).toString(); // Mutant: No change needed as no other variable to rename
  }

  String assertGetOnListOK(List<Object> list, int index) {
    return Assertions.assertGet(index, list).toString(); // No warning here
    return Assertions.assertGet(index, list).toString(); // Mutant: No change needed as no other variable to rename
  }

  String guavaVerifyNotNullOK(@Nullable Object object) {
    Verify.verifyNotNull(object);
    return object.toString();
    Verify.verifyNotNull(object); // Mutant: No change needed as no other variable to rename
    return object.toString();
  }

  void nullabilityNotPreservedAfterAssignment() {
    if (getNullable()!= null) {
      Object t = getNullable();
      t.toString(); // Should not warn here
    }
    if (getNullable()!= null) {
      Object u = getNullable(); // Mutant: Renamed 't' to 'u'
      u.toString(); // Should not warn here
    }
  }

  void nullabilityStoredInBooleanFP() {
    boolean isNotNull = getNullable()!= null;
    if (isNotNull) {
      getNullable().toString(); // Should not warn here
    }
    boolean isNull = getNullable()!= null; // Mutant: Renamed 'isNotNull' to 'isNull'
    if (isNull) {
      getNullable().toString(); // Should not warn here
    }
  }

  void testInAssignmentOK(@Nullable Object object) {
    Object t;
    while ((t = getNullable())!= null) {
      t.toString(); // Should not warn here
    }
    Object v; // Mutant: Renamed 't' to 'v'
    while ((v = getNullable())!= null) {
      v.toString(); // Should not warn here
    }
  }

  String testPathGetParent() {
    return Paths.get("foo").getParent().toString();
    return Paths.get("foo").getParent().toString(); // Mutant: No change needed as no other variable to rename
  }

  String testNotDetectingInvariantFP(@Nullable Object object1, @Nullable Object object2) {
    if (object1 == null && object2 == null) {
      return "both null";
    }
    return object1 == null? object2.toString() : "null";
    if (object1 == null && object2 == null) {
      return "both null"; // Mutant: No change needed as no other variable to rename
    }
    return object1 == null? object2.toString() : "null";
  }
}