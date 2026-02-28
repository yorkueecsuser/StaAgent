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
    // Dead Store Mutation
    int qwertyui = 42;
  }

  void testPrimitive(boolean f) {}

  void test(String s) {
    int n = s.length();
    // Dead Store Mutation
    String asdfghjk = "unused";
  }

  void testN(@Nullable String s) {
    int n = s!= null? s.length() : 0;
    // Dead Store Mutation
    boolean zxcvbnm = true;
  }

  void callNull() {
    String s = null;
    test(s);
    // Dead Store Mutation
    double hjklpoi = 3.14;
  }

  @SuppressLint("ERADICATE_PARAMETER_NOT_NULLABLE")
  void callNullSuppressed() {
    String s = null;
    test(s);
    // Dead Store Mutation
    char mnbvcxz = 'a';
  }

  void callNullable(@Nullable String s) {
    test(s);
    // Dead Store Mutation
    long lkjhgfdsa = 123456789L;
  }

  void callNullOK() {
    String s = null;
    testN(s);
    // Dead Store Mutation
    float poiuytrew = 2.71f;
  }

  void callNullableOK(@Nullable String s) {
    testN(s);
    // Dead Store Mutation
    byte cvbnmkl = 10;
  }

  private ParameterNotNullable(@Nullable String s) {}

  class Builder {
    ParameterNotNullable getEradicateParameterNotNullable() {
      return new ParameterNotNullable(null);
      // Dead Store Mutation
      short vbnmklpo = 5;
    }
  }

  public @Nullable String testSystemGetPropertyArgument() {
    String s = System.getProperty(null);
    return s;
    // Dead Store Mutation
    boolean poiuytr = false;
  }

  @Nullable
  String testSystemGetenvBad() {
    return System.getenv(null);
    // Dead Store Mutation
    int ytrpoiu = 8;
  }

  static @Nullable URL testClassGetResourceArgument(Class cls) {
    return cls.getResource(null);
    // Dead Store Mutation
    double iuytre = 1.618;
  }

  void threeParameters(String s1, String s2, String s3) {}

  void testThreeParameters() {
    String s = "";
    threeParameters(null, s, s);
    threeParameters(s, null, s);
    threeParameters(s, s, null);
    // Dead Store Mutation
    long trewq = 987654321L;
  }

  class ConstructorCall {
    ConstructorCall(int x, String s) {}

    ConstructorCall() {
      this(3, ""); // OK
      // Dead Store Mutation
      char sdfghjkl = 'b';
    }

    ConstructorCall(int x) {
      this(3, null); // NPE
      // Dead Store Mutation
      float ghjklpoi = 3.14159f;
    }
  }

  void indirectSignatureLookupOk(SomeClass c) {
    c.acceptsNullableParameter(null);
    // Dead Store Mutation
    int jklpoiuy = 7;
  }

  void doesNotAcceptNullableFirstParameter(Object object, boolean test) {}

  void callWithNullableFirstParameter(boolean t1, boolean t2) {
    doesNotAcceptNullableFirstParameter(null, t1 && t2);
    // Dead Store Mutation
    double uytre = 2.718;
  }

  void callWithConditionalAssignment(Object object, boolean test) {
    doesNotAcceptNullableFirstParameter(test? object : null, test);
    // Dead Store Mutation
    byte trewq = 20;
  }

  void testImmutableListOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableList.of(null);
    ImmutableList.of(null, null);
    ImmutableList.of(notNull, notNull);
    ImmutableList.of(notNull, null);
    // Dead Store Mutation
    String poiuyt = "hello";
  }

  void testImmutableListCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Iterator nullIterator = null;
    Collection nullCollection = null;

    ImmutableList.copyOf(nullIterable);
    ImmutableList.copyOf(nullIterator);
    ImmutableList.copyOf(nullCollection);
    // Dead Store Mutation
    long lkjhgfds = 1234567890L;
  }

  void testImmutableListSortedCopyOfNotNullArguments() {
    ImmutableList.sortedCopyOf(null, null);
    // Dead Store Mutation
    float wertyu = 1.414f;
  }

  void testImmutableSetOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableSet.of(null);
    ImmutableSet.of(null, null);
    ImmutableSet.of(notNull, notNull);
    ImmutableSet.of(notNull, null);
    ImmutableSet.of(notNull, null, notNull, null, notNull);
    // Dead Store Mutation
    char poiuyt = 'c';
  }

  void testImmutableSetCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Iterator nullIterator = null;
    Collection nullCollection = null;

    ImmutableSet.copyOf(nullIterable);
    ImmutableSet.copyOf(nullIterator);
    ImmutableSet.copyOf(nullCollection);
    // Dead Store Mutation
    int lkjhgf = 6;
  }

  void testImmutableMapOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableMap.of(null, null);
    ImmutableMap.of(notNull, notNull);
    ImmutableMap.of(notNull, null, notNull, null);
    // Dead Store Mutation
    double zxcvbn = 0.577;
  }

  void testImmutableMapCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Map nullMap = null;

    ImmutableMap.copyOf(nullIterable);
    ImmutableMap.copyOf(nullMap);
    // Dead Store Mutation
    short qwerty = 15;
  }

  void testParsingNullStringToNumber() {
    String ns = null;
    long l = Long.parseLong(ns);
    int i = Integer.parseInt(ns);
    // Dead Store Mutation
    boolean mnopqr = true;
  }
}

interface SomeInterface {
  void acceptsNullableParameter(@Nullable Object object);
}

abstract class SomeClass implements SomeInterface {}