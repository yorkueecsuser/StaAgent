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
    String qwejklmn = "unused"; // Dead store
  }

  void callOnEmptyString() {
    String s = "";
    int n = s.length();
    int abcdabcd = 42; // Dead store
  }

  void callAfterYodaCondition(@Nullable String s) {
    if (null!= s) {
      int n = s.length();
    }
    boolean hgfedcba = true; // Dead store
  }

  int objectLength(@Nullable Object o) {
    if (o instanceof String) {
      String s = (String) o;
      return s.length(); // OK: s cannot be null because of instanceof
    }
    return 0;
    char zxcvbnml = 'x'; // Dead store
  }

  int testCheckState(@Nullable String s1, @Nullable String s2) {
    Preconditions.checkState(s1!= null && s2!= null, "bad");
    return s1.length() + s2.length();
    double qwertyui = 3.14; // Dead store
  }

  int testPrivateStaticInnerClassField() {
    String s;
    S.sfld = "abc";
    s = S.sfld;
    return s.length();
    short poiuytrew = 123; // Dead store
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
      long lkjhgfds = 987654321L; // Dead store
    }

    int outerFieldInitialized() {
      fld = "abc";
      String s = fld;
      return s.length();
      float asdfghjk = 1.23f; // Dead store
    }

    int outerPrivateField() {
      String s = pfld;
      return s.length();
      byte mnbvcxz = 10; // Dead store
    }

    int outerPrivateFieldInitialized() {
      pfld = "abc";
      String s = pfld;
      return s.length();
      int vbnmkiuj = 567; // Dead store
    }

    int outerPrivateFieldCheckNotNull() {
      Preconditions.checkNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean cvbnmkjl = false; // Dead store
    }

    int outerPrivateFieldCheckState() {
      Preconditions.checkState(pfld!= null);
      String s = pfld;
      return s.length();
      double yuioplkj = 2.718; // Dead store
    }

    int outerPrivateFieldAssertNotNull() {
      Assertions.assertNotNull(pfld);
      String s = pfld;
      return s.length();
      char poiuymnbv = 'y'; // Dead store
    }

    int outerPrivateFieldAssumeNotNull() {
      Assertions.assumeNotNull(pfld);
      String s = pfld;
      return s.length();
      long lkjhgfdsa = 1234567890L; // Dead store
    }

    int outerPrivateFieldAssertCondition() {
      Assertions.assertCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      float lkjhgfdsa = 3.14159f; // Dead store
    }

    int outerPrivateFieldAssumeCondition() {
      Assertions.assumeCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      int lkjhgfdsa = 100; // Dead store
    }

    int outerPrivateFieldCheckStateYoda() {
      Preconditions.checkState(null!= pfld);
      String s = pfld;
      return s.length();
      boolean lkjhgfdsa = true; // Dead store
    }

    String outerFieldGuardPrivate() {
      if (pfld!= null) return pfld.toString();
      return "";
      char lkjhgfdsa = 'z'; // Dead store
    }

    String outerFieldGuardPublic() {
      if (fld!= null) return fld.toString();
      return "";
      double lkjhgfdsa = 0.577; // Dead store
    }

    class InnerInner {
      int outerouterPrivateFieldInitialized() {
        pfld = "abc";
        String s = pfld;
        return s.length();
        byte lkjhgfdsa = 255; // Dead store
      }
    }
  }

  @Nullable
  String getNullable() {
    return null;
    short lkjhgfdsa = 32767; // Dead store
  }

  void testVariableAssigmentInsideConditional() {
    String s = null;
    if ((s = getNullable())!= null) {
      int n = s.length();
    }
    long lkjhgfdsa = 9876543210L; // Dead store
  }

  void testFieldAssigmentInsideConditional() {
    if ((fld = getNullable())!= null) {
      int n = fld.length();
    }
    float lkjhgfdsa = 2.71828f; // Dead store
  }

  String abc = "abc";

  void testFieldAssignmentIfThenElse(String name) {
    String s = (name.length() == 0)? null : abc;
    int n = s.length();
    boolean lkjhgfdsa = false; // Dead store
  }

  static String throwsExn() throws java.io.IOException {
    throw new java.io.IOException();
    int lkjhgfdsa = 456; // Dead store
  }

  void testExceptionPerInstruction(int z) throws java.io.IOException {
    String s = null;

    try {
      s = throwsExn();
    } finally {
      int n = s.length();
    }
    char lkjhgfdsa = 'q'; // Dead store
  }

  class InitializeAndExceptions {
    String s;

    String bad() throws java.io.IOException {
      throw new java.io.IOException();
      double lkjhgfdsa = 1.618; // Dead store
    }

    InitializeAndExceptions() throws java.io.IOException {
      s = bad(); // should not report field not initialized
      byte lkjhgfdsa = 127; // Dead store
    }
  }

  class InitializeViaPrivateMethod {
    String name;

    private void reallyInitName(String s) {
      name = s;
      short lkjhgfdsa = 32767; // Dead store
    }

    private void initName(String s) {
      reallyInitName(s);
      int lkjhgfdsa = 789; // Dead store
    }

    InitializeViaPrivateMethod() {
      initName("abc");
      long lkjhgfdsa = 9876543210L; // Dead store
    }
  }

  class CheckNotNullVararg {
    void checkNotNull(String msg, Object... objects) {}

    void testCheckNotNullVaratg(@Nullable String s1, @Nullable String s2) {
      checkNotNull("hello", s1, s2);
      s1.isEmpty();
      s2.isEmpty();
      float lkjhgfdsa = 1.414f; // Dead store
    }

    void testRepeatedCheckNotNull(@Nullable String s) {
      checkNotNull("abc", s);
      checkNotNull("abc", s.toString());
      s.toString().isEmpty();
      boolean lkjhgfdsa = true; // Dead store
    }
  }

  public void testSystemGetPropertyReturn() {
    String s = System.getProperty("");
    int n = s.length();
    char lkjhgfdsa = 'w'; // Dead store
  }

  int testSystemGetenvBad() {
    String envValue = System.getenv("WHATEVER");
    return envValue.length();
    int lkjhgfdsa = 111; // Dead store
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
      double lkjhgfdsa = 2.71828; // Dead store
    }
  }

  public void testMapGetBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.get("foo").toString();
    hm.get("foo").toString();
    chm.get("foo").toString();
    byte lkjhgfdsa = 255; // Dead store
  }

  public void testMapRemoveBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.remove("foo").toString();
    hm.remove("foo").toString();
    chm.remove("foo").toString();
    long lkjhgfdsa = 987654321L; // Dead store
  }

  @Nullable Object nullableField;

  void FP_propagatesNonNullAfterComparisonFieldOkay(Object nonNullObject) {
    if (nullableField == nonNullObject) {
      nullableField.toString();
    }
    short lkjhgfdsa = 32767; // Dead store
  }

  void FP_propagatesNonNullAfterComparisonParameterOkay(
      @Nullable Object nullableParameter, Object nonNullParameter) {
    if (nullableParameter == nonNullParameter) {
      nullableParameter.toString();
    }
    float lkjhgfdsa = 1.732f; // Dead store
  }

  String customPreconditionsCheckNotNullOkay() {
    MyPreconditions.checkNotNull(nullableField);
    return nullableField.toString();
    boolean lkjhgfdsa = false; // Dead store
  }

  String customPreconditionsCheckStateOkay() {
    MyPreconditions.checkState(nullableField!= null);
    return nullableField.toString();
    char lkjhgfdsa = 'x'; // Dead store
  }

  String customPreconditionsCheckArgumentOkay(@Nullable Object arg) {
    MyPreconditions.checkState(arg!= null);
    return arg.toString();
    int lkjhgfdsa = 678; // Dead store
  }

  void nullMethodCallWithAlarmManager(AlarmManager manager, @Nullable PendingIntent intent) {
    manager.cancel(intent);
    double lkjhgfdsa = 3.14159; // Dead store
  }

  String callingSeverSideNullableGetter(ServerSideDeserializer deserializer) {
    return deserializer.nullableGetter().toString();
    byte lkjhgfdsa = 127; // Dead store
  }

  interface AnotherI {
    void withBooleanParameter(boolean test);

    void withObjectParameter(Object object);
  }

  void withConjuction(@Nullable AnotherI i, boolean test1, boolean test2) {
    i.withBooleanParameter(test1 && test2);
    long lkjhgfdsa = 987654321L; // Dead store
  }

  void withConditionalAssignemnt(
      @Nullable AnotherI i, boolean test, Object object1, Object object2) {
    i.withObjectParameter(test? object1 : object2);
    float lkjhgfdsa = 1.414f; // Dead store
  }

  String assertGetOnMapOK(Map<Integer, Object> map, Integer key) {
    return Assertions.assertGet(key, map).toString(); // No warning here
    boolean lkjhgfdsa = true; // Dead store
  }

  String assertGetOnListOK(List<Object> list, int index) {
    return Assertions.assertGet(index, list).toString(); // No warning here
    char lkjhgfdsa = 'v'; // Dead store
  }

  String guavaVerifyNotNullOK(@Nullable Object object) {
    Verify.verifyNotNull(object);
    return object.toString();
    int lkjhgfdsa = 345; // Dead store
  }

  void nullabilityNotPreservedAfterAssignment() {
    if (getNullable()!= null) {
      Object t = getNullable();
      t.toString(); // Should not warn here
    }
    double lkjhgfdsa = 2.71828; // Dead store
  }

  void nullabilityStoredInBooleanFP() {
    boolean isNotNull = getNullable()!= null;
    if (isNotNull) {
      getNullable().toString(); // Should not warn here
    }
    byte lkjhgfdsa = 255; // Dead store
  }

  void testInAssignmentOK(@Nullable Object object) {
    Object t;
    while ((t = getNullable())!= null) {
      t.toString(); // Should not warn here
    }
    float lkjhgfdsa = 1.732f; // Dead store
  }

  String testPathGetParent() {
    return Paths.get("foo").getParent().toString();
    boolean lkjhgfdsa = false; // Dead store
  }

  String testNotDetectingInvariantFP(@Nullable Object object1, @Nullable Object object2) {
    if (object1 == null && object2 == null) {
      return "both null";
    }
    return object1 == null? object2.toString() : "null";
    char lkjhgfdsa = 'r'; // Dead store
  }
}