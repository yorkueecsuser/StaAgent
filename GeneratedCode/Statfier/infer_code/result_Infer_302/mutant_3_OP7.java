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
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testPrimitive(boolean f) {}

  void test(String s) {
    int n = s.length();
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testN(@Nullable String s) {
    int n = s!= null? s.length() : 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void callNull() {
    String s = null;
    test(s);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  @SuppressLint("ERADICATE_PARAMETER_NOT_NULLABLE")
  void callNullSuppressed() {
    String s = null;
    test(s);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void callNullable(@Nullable String s) {
    test(s);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void callNullOK() {
    String s = null;
    testN(s);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void callNullableOK(@Nullable String s) {
    testN(s);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  private ParameterNotNullable(@Nullable String s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  class Builder {
    ParameterNotNullable getEradicateParameterNotNullable() {
      return new ParameterNotNullable(null);
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }
  }

  public @Nullable String testSystemGetPropertyArgument() {
    String s = System.getProperty(null);
    return s;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  @Nullable
  String testSystemGetenvBad() {
    return System.getenv(null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  static @Nullable URL testClassGetResourceArgument(Class cls) {
    return cls.getResource(null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void threeParameters(String s1, String s2, String s3) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testThreeParameters() {
    String s = "";
    threeParameters(null, s, s);
    threeParameters(s, null, s);
    threeParameters(s, s, null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  class ConstructorCall {
    ConstructorCall(int x, String s) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    ConstructorCall() {
      this(3, ""); // OK
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }

    ConstructorCall(int x) {
      this(3, null); // NPE
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable code */ }
    }
  }

  void indirectSignatureLookupOk(SomeClass c) {
    c.acceptsNullableParameter(null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void doesNotAcceptNullableFirstParameter(Object object, boolean test) {}

  void callWithNullableFirstParameter(boolean t1, boolean t2) {
    doesNotAcceptNullableFirstParameter(null, t1 && t2);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void callWithConditionalAssignment(Object object, boolean test) {
    doesNotAcceptNullableFirstParameter(test? object : null, test);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testImmutableListOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableList.of(null);
    ImmutableList.of(null, null);
    ImmutableList.of(notNull, notNull);
    ImmutableList.of(notNull, null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testImmutableListCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Iterator nullIterator = null;
    Collection nullCollection = null;

    ImmutableList.copyOf(nullIterable);
    ImmutableList.copyOf(nullIterator);
    ImmutableList.copyOf(nullCollection);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testImmutableListSortedCopyOfNotNullArguments() {
    ImmutableList.sortedCopyOf(null, null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testImmutableSetOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableSet.of(null);
    ImmutableSet.of(null, null);
    ImmutableSet.of(notNull, notNull);
    ImmutableSet.of(notNull, null);
    ImmutableSet.of(notNull, null, notNull, null, notNull);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testImmutableSetCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Iterator nullIterator = null;
    Collection nullCollection = null;

    ImmutableSet.copyOf(nullIterable);
    ImmutableSet.copyOf(nullIterator);
    ImmutableSet.copyOf(nullCollection);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testImmutableMapOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableMap.of(null, null);
    ImmutableMap.of(notNull, notNull);
    ImmutableMap.of(notNull, null, notNull, null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testImmutableMapCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Map nullMap = null;

    ImmutableMap.copyOf(nullIterable);
    ImmutableMap.copyOf(nullMap);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  void testParsingNullStringToNumber() {
    String ns = null;
    long l = Long.parseLong(ns);
    int i = Integer.parseInt(ns);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
  }

  private boolean getCondition() {
    return false;
  }
}

interface SomeInterface {
  void acceptsNullableParameter(@Nullable Object object);
}

abstract class SomeClass implements SomeInterface {}