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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void testPrimitive(boolean f) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void test(String s) {
    int n = s.length();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void testN(@Nullable String s) {
    int n = s!= null? s.length() : 0;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void callNull() {
    String s = null;
    test(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @SuppressLint("ERADICATE_PARAMETER_NOT_NULLABLE")
  void callNullSuppressed() {
    String s = null;
    test(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void callNullable(@Nullable String s) {
    test(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void callNullOK() {
    String s = null;
    testN(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void callNullableOK(@Nullable String s) {
    testN(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  private ParameterNotNullable(@Nullable String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  class Builder {
    ParameterNotNullable getEradicateParameterNotNullable() {
      return new ParameterNotNullable(null);
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
    }
  }

  public @Nullable String testSystemGetPropertyArgument() {
    String s = System.getProperty(null);
    return s;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @Nullable
  String testSystemGetenvBad() {
    return System.getenv(null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  static @Nullable URL testClassGetResourceArgument(Class cls) {
    return cls.getResource(null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void threeParameters(String s1, String s2, String s3) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void testThreeParameters() {
    String s = "";
    threeParameters(null, s, s);
    threeParameters(s, null, s);
    threeParameters(s, s, null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  class ConstructorCall {
    ConstructorCall(int x, String s) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
    }

    ConstructorCall() {
      this(3, ""); // OK
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
    }

    ConstructorCall(int x) {
      this(3, null); // NPE
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
    }
  }

  void indirectSignatureLookupOk(SomeClass c) {
    c.acceptsNullableParameter(null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void doesNotAcceptNullableFirstParameter(Object object, boolean test) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void callWithNullableFirstParameter(boolean t1, boolean t2) {
    doesNotAcceptNullableFirstParameter(null, t1 && t2);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void callWithConditionalAssignment(Object object, boolean test) {
    doesNotAcceptNullableFirstParameter(test? object : null, test);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void testImmutableListOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableList.of(null);
    ImmutableList.of(null, null);
    ImmutableList.of(notNull, notNull);
    ImmutableList.of(notNull, null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void testImmutableListCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Iterator nullIterator = null;
    Collection nullCollection = null;

    ImmutableList.copyOf(nullIterable);
    ImmutableList.copyOf(nullIterator);
    ImmutableList.copyOf(nullCollection);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void testImmutableListSortedCopyOfNotNullArguments() {
    ImmutableList.sortedCopyOf(null, null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void testImmutableSetOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableSet.of(null);
    ImmutableSet.of(null, null);
    ImmutableSet.of(notNull, notNull);
    ImmutableSet.of(notNull, null);
    ImmutableSet.of(notNull, null, notNull, null, notNull);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void testImmutableSetCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Iterator nullIterator = null;
    Collection nullCollection = null;

    ImmutableSet.copyOf(nullIterable);
    ImmutableSet.copyOf(nullIterator);
    ImmutableSet.copyOf(nullCollection);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void testImmutableMapOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableMap.of(null, null);
    ImmutableMap.of(notNull, notNull);
    ImmutableMap.of(notNull, null, notNull, null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void testImmutableMapCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Map nullMap = null;

    ImmutableMap.copyOf(nullIterable);
    ImmutableMap.copyOf(nullMap);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void testParsingNullStringToNumber() {
    String ns = null;
    long l = Long.parseLong(ns);
    int i = Integer.parseInt(ns);
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { /* unreachable loop */ }
  }

  private boolean getCondition() {
    return false;
  }
}

interface SomeInterface {
  void acceptsNullableParameter(@Nullable Object object);
}

abstract class SomeClass implements SomeInterface {}