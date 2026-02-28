import android.annotation.SuppressLint;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

class ParameterNotNullable {

  boolean field = false;

  ParameterNotNullable() {
    testPrimitive(field);
    int abcdabcd = 123; // Dead Store
  }

  void testPrimitive(boolean f) {}

  void test(String s) {
    int n = s.length();
    String ijklmnop = "unused"; // Dead Store
  }

  void testN(@Nullable String s) {
    int n = s!= null? s.length() : 0;
    boolean qrstuvwx = true; // Dead Store
  }

  void callNull() {
    String s = null;
    test(s);
    char yzabcdef = 'x'; // Dead Store
  }

  @SuppressLint("ERADICATE_PARAMETER_NOT_NULLABLE")
  void callNullSuppressed() {
    String s = null;
    test(s);
    double ghijklmn = 3.14; // Dead Store
  }

  void callNullable(@Nullable String s) {
    test(s);
    float opqrstuv = 2.71f; // Dead Store
  }

  void callNullOK() {
    String s = null;
    testN(s);
    long wxyzabcd = 987654321L; // Dead Store
  }

  void callNullableOK(@Nullable String s) {
    testN(s);
    short efghijkl = 1234; // Dead Store
  }

  private ParameterNotNullable(@Nullable String s) {}

  class Builder {
    ParameterNotNullable getEradicateParameterNotNullable() {
      return new ParameterNotNullable(null);
      byte mnopqrst = 10; // Dead Store
    }
  }

  public @Nullable String testSystemGetPropertyArgument() {
    String s = System.getProperty(null);
    return s;
    int uvwxyzab = 56; // Dead Store
  }

  @Nullable
  String testSystemGetenvBad() {
    return System.getenv(null);
    long cdefghij = 123456789L; // Dead Store
  }

  static @Nullable URL testClassGetResourceArgument(Class cls) {
    return cls.getResource(null);
    float klmnopqr = 3.14159f; // Dead Store
  }

  void threeParameters(String s1, String s2, String s3) {}

  void testThreeParameters() {
    String s = "";
    threeParameters(null, s, s);
    threeParameters(s, null, s);
    threeParameters(s, s, null);
    boolean stuvwxyz = false; // Dead Store
  }

  class ConstructorCall {
    ConstructorCall(int x, String s) {}

    ConstructorCall() {
      this(3, ""); // OK
      double abcdefgh = 2.71828; // Dead Store
    }

    ConstructorCall(int x) {
      this(3, null); // NPE
      char ijklmnop = 'y'; // Dead Store
    }
  }

  void indirectSignatureLookupOk(SomeClass c) {
    c.acceptsNullableParameter(null);
    int opqrstuv = 42; // Dead Store
  }

  void doesNotAcceptNullableFirstParameter(Object object, boolean test) {}

  void callWithNullableFirstParameter(boolean t1, boolean t2) {
    doesNotAcceptNullableFirstParameter(null, t1 && t2);
    long wxyzabcd = 987654321L; // Dead Store
  }

  void callWithConditionalAssignment(Object object, boolean test) {
    doesNotAcceptNullableFirstParameter(test? object : null, test);
    float efghijkl = 1.61803f; // Dead Store
  }

  void testImmutableListOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableList.of(null);
    ImmutableList.of(null, null);
    ImmutableList.of(notNull, notNull);
    ImmutableList.of(notNull, null);
    boolean mnopqrst = true; // Dead Store
  }

  void testImmutableListCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Iterator nullIterator = null;
    Collection nullCollection = null;

    ImmutableList.copyOf(nullIterable);
    ImmutableList.copyOf(nullIterator);
    ImmutableList.copyOf(nullCollection);
    char uvwxyzab = 'z'; // Dead Store
  }

  void testImmutableListSortedCopyOfNotNullArguments() {
    ImmutableList.sortedCopyOf(null, null);
    int cdefghij = 100; // Dead Store
  }

  void testImmutableSetOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableSet.of(null);
    ImmutableSet.of(null, null);
    ImmutableSet.of(notNull, notNull);
    ImmutableSet.of(notNull, null);
    ImmutableSet.of(notNull, null, notNull, null, notNull);
    double klmnopqr = 2.71828; // Dead Store
  }

  void testImmutableSetCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Iterator nullIterator = null;
    Collection nullCollection = null;

    ImmutableSet.copyOf(nullIterable);
    ImmutableSet.copyOf(nullIterator);
    ImmutableSet.copyOf(nullCollection);
    float stuvwxyz = 1.41421f; // Dead Store
  }

  void testImmutableMapOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableMap.of(null, null);
    ImmutableMap.of(notNull, notNull);
    ImmutableMap.of(notNull, null, notNull, null);
    long abcdefgh = 123456789L; // Dead Store
  }

  void testImmutableMapCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Map nullMap = null;

    ImmutableMap.copyOf(nullIterable);
    ImmutableMap.copyOf(nullMap);
    short ijklmnop = 5678; // Dead Store
  }

  void testParsingNullStringToNumber() {
    String ns = null;
    long l = Long.parseLong(ns);
    int i = Integer.parseInt(ns);
    boolean opqrstuv = false; // Dead Store
  }
}

interface SomeInterface {
  void acceptsNullableParameter(@Nullable Object object);
}

abstract class SomeClass implements SomeInterface {}