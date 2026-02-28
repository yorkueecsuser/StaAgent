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
    String qwerasdf = "unused"; // Dead Store
  }

  void callOnEmptyString() {
    String s = "";
    int n = s.length();
    int hjklzxcv = 42; // Dead Store
  }

  void callAfterYodaCondition(@Nullable String s) {
    if (null!= s) {
      int n = s.length();
    }
    boolean poiuytrewq = true; // Dead Store
  }

  int objectLength(@Nullable Object o) {
    if (o instanceof String) {
      String s = (String) o;
      return s.length(); // OK: s cannot be null because of instanceof
    }
    return 0;
    char mnvbhjnk = 'a'; // Dead Store
  }

  int testCheckState(@Nullable String s1, @Nullable String s2) {
    Preconditions.checkState(s1!= null && s2!= null, "bad");
    return s1.length() + s2.length();
    double lkjhgfds = 3.14; // Dead Store
  }

  int testPrivateStaticInnerClassField() {
    String s;
    S.sfld = "abc";
    s = S.sfld;
    return s.length();
    long asdfghjk = 123456789L; // Dead Store
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
      float qwertyui = 2.718f; // Dead Store
    }

    int outerFieldInitialized() {
      fld = "abc";
      String s = fld;
      return s.length();
      byte cvbnmghj = 10; // Dead Store
    }

    int outerPrivateField() {
      String s = pfld;
      return s.length();
      short zxcvbnml = 20; // Dead Store
    }

    int outerPrivateFieldInitialized() {
      pfld = "abc";
      String s = pfld;
      return s.length();
      int vbnmghjk = 30; // Dead Store
    }

    int outerPrivateFieldCheckNotNull() {
      Preconditions.checkNotNull(pfld);
      String s = pfld;
      return s.length();
      long tyuioplk = 40L; // Dead Store
    }

    int outerPrivateFieldCheckState() {
      Preconditions.checkState(pfld!= null);
      String s = pfld;
      return s.length();
      double ijklmnop = 50.5; // Dead Store
    }

    int outerPrivateFieldAssertNotNull() {
      Assertions.assertNotNull(pfld);
      String s = pfld;
      return s.length();
      char opqrstuv = 'b'; // Dead Store
    }

    int outerPrivateFieldAssumeNotNull() {
      Assertions.assumeNotNull(pfld);
      String s = pfld;
      return s.length();
      boolean edcfvghb = false; // Dead Store
    }

    int outerPrivateFieldAssertCondition() {
      Assertions.assertCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      float wertyuio = 60.6f; // Dead Store
    }

    int outerPrivateFieldAssumeCondition() {
      Assertions.assumeCondition(pfld!= null, "explanation");
      String s = pfld;
      return s.length();
      double ghjklpoi = 70.7; // Dead Store
    }

    int outerPrivateFieldCheckStateYoda() {
      Preconditions.checkState(null!= pfld);
      String s = pfld;
      return s.length();
      int lkjhgfds = 80; // Dead Store
    }

    String outerFieldGuardPrivate() {
      if (pfld!= null) return pfld.toString();
      return "";
      long zxcvbnml = 90L; // Dead Store
    }

    String outerFieldGuardPublic() {
      if (fld!= null) return fld.toString();
      return "";
      char asdfghjk = 'c'; // Dead Store
    }

    class InnerInner {
      int outerouterPrivateFieldInitialized() {
        pfld = "abc";
        String s = pfld;
        return s.length();
        short qwertyui = 100; // Dead Store
      }
    }
  }

  @Nullable
  String getNullable() {
    return null;
    int poiuytrewq = 110; // Dead Store
  }

  void testVariableAssigmentInsideConditional() {
    String s = null;
    if ((s = getNullable())!= null) {
      int n = s.length();
      double lkjhgfds = 120.12; // Dead Store
    }
  }

  void testFieldAssigmentInsideConditional() {
    if ((fld = getNullable())!= null) {
      int n = fld.length();
      byte asdfghjk = 130; // Dead Store
    }
  }

  String abc = "abc";

  void testFieldAssignmentIfThenElse(String name) {
    String s = (name.length() == 0)? null : abc;
    int n = s.length();
    float qwertyui = 140.14f; // Dead Store
  }

  static String throwsExn() throws java.io.IOException {
    throw new java.io.IOException();
    char zxcvbnml = 'd'; // Dead Store
  }

  void testExceptionPerInstruction(int z) throws java.io.IOException {
    String s = null;

    try {
      s = throwsExn();
    } finally {
      int n = s.length();
      int lkjhgfds = 150; // Dead Store
    }
  }

  class InitializeAndExceptions {
    String s;

    String bad() throws java.io.IOException {
      throw new java.io.IOException();
      boolean asdfghjk = true; // Dead Store
    }

    InitializeAndExceptions() throws java.io.IOException {
      s = bad(); // should not report field not initialized
      long qwertyui = 160L; // Dead Store
    }
  }

  class InitializeViaPrivateMethod {
    String name;

    private void reallyInitName(String s) {
      name = s;
      int lkjhgfds = 170; // Dead Store
    }

    private void initName(String s) {
      reallyInitName(s);
      double zxcvbnml = 180.18; // Dead Store
    }

    InitializeViaPrivateMethod() {
      initName("abc");
      char asdfghjk = 'e'; // Dead Store
    }
  }

  class CheckNotNullVararg {
    void checkNotNull(String msg, Object... objects) {}

    void testCheckNotNullVaratg(@Nullable String s1, @Nullable String s2) {
      checkNotNull("hello", s1, s2);
      s1.isEmpty();
      s2.isEmpty();
      int qwertyui = 190; // Dead Store
    }

    void testRepeatedCheckNotNull(@Nullable String s) {
      checkNotNull("abc", s);
      checkNotNull("abc", s.toString());
      s.toString().isEmpty();
      long zxcvbnml = 200L; // Dead Store
    }
  }

  public void testSystemGetPropertyReturn() {
    String s = System.getProperty("");
    int n = s.length();
    char asdfghjk = 'f'; // Dead Store
  }

  int testSystemGetenvBad() {
    String envValue = System.getenv("WHATEVER");
    return envValue.length();
    int lkjhgfds = 210; // Dead Store
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
      double zxcvbnml = 220.22; // Dead Store
    }
  }

  public void testMapGetBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.get("foo").toString();
    hm.get("foo").toString();
    chm.get("foo").toString();
    byte asdfghjk = 230; // Dead Store
  }

  public void testMapRemoveBad(
      Map<String, String> m, HashMap<String, String> hm, ConcurrentHashMap<String, String> chm) {
    m.remove("foo").toString();
    hm.remove("foo").toString();
    chm.remove("foo").toString();
    float qwertyui = 240.24f; // Dead Store
  }

  @Nullable Object nullableField;

  void FP_propagatesNonNullAfterComparisonFieldOkay(Object nonNullObject) {
    if (nullableField == nonNullObject) {
      nullableField.toString();
      int lkjhgfds = 250; // Dead Store
    }
  }

  void FP_propagatesNonNullAfterComparisonParameterOkay(
      @Nullable Object nullableParameter, Object nonNullParameter) {
    if (nullableParameter == nonNullParameter) {
      nullableParameter.toString();
      long zxcvbnml = 260L; // Dead Store
    }
  }

  String customPreconditionsCheckNotNullOkay() {
    MyPreconditions.checkNotNull(nullableField);
    return nullableField.toString();
    char asdfghjk = 'g'; // Dead Store
  }

  String customPreconditionsCheckStateOkay() {
    MyPreconditions.checkState(nullableField!= null);
    return nullableField.toString();
    int qwertyui = 270; // Dead Store
  }

  String customPreconditionsCheckArgumentOkay(@Nullable Object arg) {
    MyPreconditions.checkState(arg!= null);
    return arg.toString();
    double zxcvbnml = 280.28; // Dead Store
  }

  void nullMethodCallWithAlarmManager(AlarmManager manager, @Nullable PendingIntent intent) {
    manager.cancel(intent);
    boolean asdfghjk = false; // Dead Store
  }

  String callingSeverSideNullableGetter(ServerSideDeserializer deserializer) {
    return deserializer.nullableGetter().toString();
    short qwertyui = 290; // Dead Store
  }

  interface AnotherI {
    void withBooleanParameter(boolean test);

    void withObjectParameter(Object object);
  }

  void withConjuction(@Nullable AnotherI i, boolean test1, boolean test2) {
    i.withBooleanParameter(test1 && test2);
    int lkjhgfds = 300; // Dead Store
  }

  void withConditionalAssignemnt(
      @Nullable AnotherI i, boolean test, Object object1, Object object2) {
    i.withObjectParameter(test? object1 : object2);
    long zxcvbnml = 310L; // Dead Store
  }

  String assertGetOnMapOK(Map<Integer, Object> map, Integer key) {
    return Assertions.assertGet(key, map).toString(); // No warning here
    char asdfghjk = 'h'; // Dead Store
  }

  String assertGetOnListOK(List<Object> list, int index) {
    return Assertions.assertGet(index, list).toString(); // No warning here
    int qwertyui = 320; // Dead Store
  }

  String guavaVerifyNotNullOK(@Nullable Object object) {
    Verify.verifyNotNull(object);
    return object.toString();
    double zxcvbnml = 330.33; // Dead Store
  }

  void nullabilityNotPreservedAfterAssignment() {
    if (getNullable()!= null) {
      Object t = getNullable();
      t.toString(); // Should not warn here
      byte asdfghjk = 340; // Dead Store
    }
  }

  void nullabilityStoredInBooleanFP() {
    boolean isNotNull = getNullable()!= null;
    if (isNotNull) {
      getNullable().toString(); // Should not warn here
      float qwertyui = 350.35f; // Dead Store
    }
  }

  void testInAssignmentOK(@Nullable Object object) {
    Object t;
    while ((t = getNullable())!= null) {
      t.toString(); // Should not warn here
      int lkjhgfds = 360; // Dead Store
    }
  }

  String testPathGetParent() {
    return Paths.get("foo").getParent().toString();
    long zxcvbnml = 370L; // Dead Store
  }

  String testNotDetectingInvariantFP(@Nullable Object object1, @Nullable Object object2) {
    if (object1 == null && object2 == null) {
      return "both null";
    }
    return object1 == null? object2.toString() : "null";
    char asdfghjk = 'i'; // Dead Store
  }
}