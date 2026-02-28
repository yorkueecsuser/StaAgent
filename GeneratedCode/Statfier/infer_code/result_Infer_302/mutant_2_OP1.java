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
    // Dead Store
    int yvbnrhty = 42;
  }

  void testPrimitive(boolean f) {}

  void test(String s) {
    int n = s.length();
    // Dead Store
    String qazwsxed = "unused";
  }

  void testN(@Nullable String s) {
    int n = s!= null? s.length() : 0;
    // Dead Store
    boolean jklpoiuy = true;
  }

  void callNull() {
    String s = null;
    test(s);
    // Dead Store
    double asdfghjk = 3.14;
  }

  @SuppressLint("ERADICATE_PARAMETER_NOT_NULLABLE")
  void callNullSuppressed() {
    String s = null;
    test(s);
    // Dead Store
    char zxvcnmlo = 'a';
  }

  void callNullable(@Nullable String s) {
    test(s);
    // Dead Store
    float wertyuiop = 2.71f;
  }

  void callNullOK() {
    String s = null;
    testN(s);
    // Dead Store
    byte mnvbhjkl = 8;
  }

  void callNullableOK(@Nullable String s) {
    testN(s);
    // Dead Store
    short qwertypo = 16;
  }

  private ParameterNotNullable(@Nullable String s) {}

  class Builder {
    ParameterNotNullable getEradicateParameterNotNullable() {
      return new ParameterNotNullable(null);
      // Dead Store
      long dfghjklz = 100L;
    }
  }

  public @Nullable String testSystemGetPropertyArgument() {
    String s = System.getProperty(null);
    return s;
    // Dead Store
    int cvbnmkiu = 7;
  }

  @Nullable
  String testSystemGetenvBad() {
    return System.getenv(null);
    // Dead Store
    boolean bnmrtyui = false;
  }

  static @Nullable URL testClassGetResourceArgument(Class cls) {
    return cls.getResource(null);
    // Dead Store
    double poiuytrewq = 2.5;
  }

  void threeParameters(String s1, String s2, String s3) {}

  void testThreeParameters() {
    String s = "";
    threeParameters(null, s, s);
    threeParameters(s, null, s);
    threeParameters(s, s, null);
    // Dead Store
    char lkjhgfds = 'b';
  }

  class ConstructorCall {
    ConstructorCall(int x, String s) {}

    ConstructorCall() {
      this(3, ""); // OK
      // Dead Store
      int zxcvbnml = 9;
    }

    ConstructorCall(int x) {
      this(3, null); // NPE
      // Dead Store
      float poiuymnb = 3.5f;
    }
  }

  void indirectSignatureLookupOk(SomeClass c) {
    c.acceptsNullableParameter(null);
    // Dead Store
    double hjklzxcv = 5.5;
  }

  void doesNotAcceptNullableFirstParameter(Object object, boolean test) {}

  void callWithNullableFirstParameter(boolean t1, boolean t2) {
    doesNotAcceptNullableFirstParameter(null, t1 && t2);
    // Dead Store
    boolean mnbvcxz = true;
  }

  void callWithConditionalAssignment(Object object, boolean test) {
    doesNotAcceptNullableFirstParameter(test? object : null, test);
    // Dead Store
    int vbnmkjhg = 15;
  }

  void testImmutableListOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableList.of(null);
    ImmutableList.of(null, null);
    ImmutableList.of(notNull, notNull);
    ImmutableList.of(notNull, null);
    // Dead Store
    long tyuioplk = 1000L;
  }

  void testImmutableListCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Iterator nullIterator = null;
    Collection nullCollection = null;

    ImmutableList.copyOf(nullIterable);
    ImmutableList.copyOf(nullIterator);
    ImmutableList.copyOf(nullCollection);
    // Dead Store
    short lkjhgfdsa = 32;
  }

  void testImmutableListSortedCopyOfNotNullArguments() {
    ImmutableList.sortedCopyOf(null, null);
    // Dead Store
    double mnbvcxzlk = 4.5;
  }

  void testImmutableSetOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableSet.of(null);
    ImmutableSet.of(null, null);
    ImmutableSet.of(notNull, notNull);
    ImmutableSet.of(notNull, null);
    ImmutableSet.of(notNull, null, notNull, null, notNull);
    // Dead Store
    char poiuymnbvc = 'c';
  }

  void testImmutableSetCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Iterator nullIterator = null;
    Collection nullCollection = null;

    ImmutableSet.copyOf(nullIterable);
    ImmutableSet.copyOf(nullIterator);
    ImmutableSet.copyOf(nullCollection);
    // Dead Store
    int lkjhgfdsaz = 20;
  }

  void testImmutableMapOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableMap.of(null, null);
    ImmutableMap.of(notNull, notNull);
    ImmutableMap.of(notNull, null, notNull, null);
    // Dead Store
    boolean lkjhgfdsaq = false;
  }

  void testImmutableMapCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Map nullMap = null;

    ImmutableMap.copyOf(nullIterable);
    ImmutableMap.copyOf(nullMap);
    // Dead Store
    float lkjhgfdsap = 6.7f;
  }

  void testParsingNullStringToNumber() {
    String ns = null;
    long l = Long.parseLong(ns);
    int i = Integer.parseInt(ns);
    // Dead Store
    byte lkjhgfdsaq = 127;
  }
}

interface SomeInterface {
  void acceptsNullableParameter(@Nullable Object object);
}

abstract class SomeClass implements SomeInterface {}