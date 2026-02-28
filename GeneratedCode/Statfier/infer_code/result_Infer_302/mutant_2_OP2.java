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
    testPrimitive(field); // Mutant: duplicated assignment
  }

  void testPrimitive(boolean f) {}

  void test(String s) {
    int n = s.length();
    int n = s.length(); // Mutant: duplicated assignment
  }

  void testN(@Nullable String s) {
    int n = s!= null? s.length() : 0;
    int n = s!= null? s.length() : 0; // Mutant: duplicated assignment
  }

  void callNull() {
    String s = null;
    test(s);
    String s = null; // Mutant: duplicated assignment
  }

  @SuppressLint("ERADICATE_PARAMETER_NOT_NULLABLE")
  void callNullSuppressed() {
    String s = null;
    test(s);
    String s = null; // Mutant: duplicated assignment
  }

  void callNullable(@Nullable String s) {
    test(s);
    test(s); // Mutant: duplicated assignment
  }

  void callNullOK() {
    String s = null;
    testN(s);
    String s = null; // Mutant: duplicated assignment
  }

  void callNullableOK(@Nullable String s) {
    testN(s);
    testN(s); // Mutant: duplicated assignment
  }

  private ParameterNotNullable(@Nullable String s) {}

  class Builder {
    ParameterNotNullable getEradicateParameterNotNullable() {
      return new ParameterNotNullable(null);
      return new ParameterNotNullable(null); // Mutant: duplicated assignment
    }
  }

  public @Nullable String testSystemGetPropertyArgument() {
    String s = System.getProperty(null);
    return s;
    return s; // Mutant: duplicated assignment
  }

  @Nullable
  String testSystemGetenvBad() {
    return System.getenv(null);
    return System.getenv(null); // Mutant: duplicated assignment
  }

  static @Nullable URL testClassGetResourceArgument(Class cls) {
    return cls.getResource(null);
    return cls.getResource(null); // Mutant: duplicated assignment
  }

  void threeParameters(String s1, String s2, String s3) {}

  void testThreeParameters() {
    String s = "";
    threeParameters(null, s, s);
    threeParameters(s, null, s);
    threeParameters(s, s, null);
    String s = ""; // Mutant: duplicated assignment
  }

  class ConstructorCall {
    ConstructorCall(int x, String s) {}

    ConstructorCall() {
      this(3, ""); // OK
      this(3, ""); // Mutant: duplicated assignment
    }

    ConstructorCall(int x) {
      this(3, null); // NPE
      this(3, null); // Mutant: duplicated assignment
    }
  }

  void indirectSignatureLookupOk(SomeClass c) {
    c.acceptsNullableParameter(null);
    c.acceptsNullableParameter(null); // Mutant: duplicated assignment
  }

  void doesNotAcceptNullableFirstParameter(Object object, boolean test) {}

  void callWithNullableFirstParameter(boolean t1, boolean t2) {
    doesNotAcceptNullableFirstParameter(null, t1 && t2);
    doesNotAcceptNullableFirstParameter(null, t1 && t2); // Mutant: duplicated assignment
  }

  void callWithConditionalAssignment(Object object, boolean test) {
    doesNotAcceptNullableFirstParameter(test? object : null, test);
    doesNotAcceptNullableFirstParameter(test? object : null, test); // Mutant: duplicated assignment
  }

  void testImmutableListOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableList.of(null);
    ImmutableList.of(null, null);
    ImmutableList.of(notNull, notNull);
    ImmutableList.of(notNull, null);
    ImmutableList.of(null); // Mutant: duplicated assignment
  }

  void testImmutableListCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Iterator nullIterator = null;
    Collection nullCollection = null;

    ImmutableList.copyOf(nullIterable);
    ImmutableList.copyOf(nullIterator);
    ImmutableList.copyOf(nullCollection);
    ImmutableList.copyOf(nullIterable); // Mutant: duplicated assignment
  }

  void testImmutableListSortedCopyOfNotNullArguments() {
    ImmutableList.sortedCopyOf(null, null);
    ImmutableList.sortedCopyOf(null, null); // Mutant: duplicated assignment
  }

  void testImmutableSetOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableSet.of(null);
    ImmutableSet.of(null, null);
    ImmutableSet.of(notNull, notNull);
    ImmutableSet.of(notNull, null);
    ImmutableSet.of(notNull, null, notNull, null, notNull);
    ImmutableSet.of(null); // Mutant: duplicated assignment
  }

  void testImmutableSetCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Iterator nullIterator = null;
    Collection nullCollection = null;

    ImmutableSet.copyOf(nullIterable);
    ImmutableSet.copyOf(nullIterator);
    ImmutableSet.copyOf(nullCollection);
    ImmutableSet.copyOf(nullIterable); // Mutant: duplicated assignment
  }

  void testImmutableMapOfnotNullArguments() {

    Object notNull = new Object();

    ImmutableMap.of(null, null);
    ImmutableMap.of(notNull, notNull);
    ImmutableMap.of(notNull, null, notNull, null);
    ImmutableMap.of(null, null); // Mutant: duplicated assignment
  }

  void testImmutableMapCopyOfNotNullArguments() {

    Iterable nullIterable = null;
    Map nullMap = null;

    ImmutableMap.copyOf(nullIterable);
    ImmutableMap.copyOf(nullMap);
    ImmutableMap.copyOf(nullIterable); // Mutant: duplicated assignment
  }

  void testParsingNullStringToNumber() {
    String ns = null;
    long l = Long.parseLong(ns);
    int i = Integer.parseInt(ns);
    String ns = null; // Mutant: duplicated assignment
  }
}

interface SomeInterface {
  void acceptsNullableParameter(@Nullable Object object);
}

abstract class SomeClass implements SomeInterface {}