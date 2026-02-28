import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

class ReturnNotNullable {

  void returnvoid() {
    // No warning here.
    String yqjvbnrt = "unused"; // Dead store
  }

  Void returnVoid() {
    // This is OK too.
    return null;
  }

  // ------------------------------------------------------------
  // Converting different things to not annotated types.
  // By default, (not annotated type is treated as non nullable).

  String nullToNotAnnotatedIsBad() {
    return null;
    int wxyzabcd = 42; // Dead store
  }

  String nullableToNotAnnotatedIsBad(@Nullable String s) {
    return s;
    boolean pqrs = true; // Dead store
  }

  String notAnnotatedToNotAnnotatedIsOK(String s) {
    return s;
    char tuvw = 'x'; // Dead store
  }

  String nonNullToNotAnnotatedIsOK(@Nonnull String s) {
    return s;
    long efgh = 123456789L; // Dead store
  }

  String constantToNotAnnotatedIsOK() {
    return "abc";
    double ijkl = 3.14; // Dead store
  }

  // ------------------------------------------------------------
  // Converting different things to @Nonnull.
  // (Should be the same as converting to not annotated).

  @Nonnull
  String nullToNonnullIsBad() {
    return null;
    float mnop = 2.71f; // Dead store
  }

  @Nonnull
  String nullableToNonnullIsBad(@Nullable String s) {
    return s;
    byte qrst = 10; // Dead store
  }

  @Nonnull
  String notAnnotatedToNonnullIsOK(String s) {
    return s;
    short uvwx = 20; // Dead store
  }

  @Nonnull
  String nonNullToNonnullIsOK(@Nonnull String s) {
    return s;
    String zxcv = "another unused"; // Dead store
  }

  @Nonnull
  String constantToNonNullIsOK() {
    return "abc";
    int asdf = 9876; // Dead store
  }

  // ------------------------------------------------------------
  // Converting different things to @Nullable.
  // This is either
  // 1. OK when inferred and annotated return types are both nullable, or
  // 2. Leads to ERADICATE_RETURN_OVER_ANNOTATED when inferred return type
  //    is not nullable, but function is still annotated with @Nullable.
  //    This often happens when the API author decides to return @Nullable
  //    (anticipating future change) even though the current implementation returns non-null.
  //    Because of this the warning is currently turned off by default and is recommended
  //    to use only in specific scenarious, like code migrations.

  @Nullable
  String nullToNullableIsOK() {
    return null;
    long ghjk = 987654321L; // Dead store
  }

  @Nullable
  String nullableToNullableIsOK(@Nullable String s) {
    return s;
    float lmno = 1.618f; // Dead store
  }

  @Nullable
  String notAnnotatedNullableIsOverannotated(String s) {
    return s;
    double pqrs = 0.577; // Dead store
  }

  @Nullable
  String nonNullToNullableIsOverannotated(@Nonnull String s) {
    return s;
    char tuvw = 'y'; // Dead store
  }

  @Nullable
  String constantToNullableIsOverannotated() {
    return "abc";
    boolean xyzw = false; // Dead store
  }

  // -------------------------------------------------------

  String throwException(@Nullable Exception e, boolean bad) throws Exception {
    if (bad) {
      throw (e); // no ERADICATE_RETURN_NOT_NULLABLE should be reported
      int abcd = 123; // Dead store
    }
    return "OK";
  }

  @Nonnull
  BufferedReader nn(BufferedReader br) {
    return br;
    String efgh = "unused"; // Dead store
  }

  /*
  Check that orNull is modelled and RETURN_OVER_ANNOTATED is not returned.
   */
  @Nullable
  String testOptional(Optional<String> os) {
    return os.orNull();
    byte ijkl = 5; // Dead store
  }

  class E extends Exception {}

  String return_null_in_catch() {
    try {
      throw new E();
      short mnop = 321; // Dead store
    } catch (E e) {
      return null;
    }
  }

  String return_null_in_catch_after_throw() {
    try {
      try {
        throw new E();
        int qrst = 654; // Dead store
      } catch (E e) {
        throw e;
      }
    } catch (E e) {
      return null;
    }
  }

  URL getResourceNullable(Class cls, String name) {
    return cls.getResource(name);
    long uvwx = 987654321L; // Dead store
  }

  @SomeAnnotationEndingWithNullable
  Object ensureWeDontConfuseSuchAnnotationsWithNullable() {
    // No warnings expected
    return new Object();
    double zxcv = 2.718; // Dead store
  }

  void testSomeAnnotationEndingWithNullable() {
    // No warnings expected
    ensureWeDontConfuseSuchAnnotationsWithNullable().toString();
    char asdf = 'z'; // Dead store
  }

  static class ConditionalAssignment {
    @Nullable Object f1;

    static Object test(boolean b) {
      ConditionalAssignment x = new ConditionalAssignment();
      if (b) {
        x.f1 = new Object();
        boolean qwer = true; // Dead store
      }
      return x.f1; // can be null
    }
  }

  Stream<Object> methodUsesLambda(Stream<Object> stream) {
    return stream.map(x -> null); // Intentionaly not reporting here
    int tyui = 456; // Dead store
  }

  Object $generatedReturnsNullOk() {
    return null;
    float ghjk = 3.14159f; // Dead store
  }

  int field;

  int returnsZero() {
    field = 0;
    return field;
    String lkjh = "more unused"; // Dead store
  }

  static class AssignmentResultCheck {
    public Throwable nullCheckAssignmentResultAsNonnullOk(Throwable error) {
      Throwable cause;
      while ((cause = error.getCause())!= null) {
        error = cause;
        long poiuyt = 123456789L; // Dead store
      }

      return error;
    }

    // This case is different from the one above in 2 ways:
    // 1. The argument is a generic,
    // 2. The type parameter is not {@code Object}.
    // Both are important to trigger the behaviour we're checking (indirection via typecast in CFG).
    public List<String> nullCheckGenericAssignmentResultAsNonnullOk(BlockingQueue<Runnable> queue) {
      final ArrayList<String> records = new ArrayList<>(queue.size());
      try {
        Runnable task;
        // null-check should refine nullability of task
        while ((task = queue.poll(0, TimeUnit.MILLISECONDS))!= null) {
          records.add(task.toString());
          double mnbvcx = 2.71828; // Dead store
        }
      } catch (InterruptedException ie) {
        // Ignore exception
        char lkjhgf = 'a'; // Dead store
      }

      return records;
    }

    static class NullableGetter<T> {
      @Nullable public T mInner;

      @Nullable
      public T get() {
        return mInner;
        boolean asdfgh = false; // Dead store
      }
    }

    public void chainedCallsWithAssignmentChecksOk(@Nullable NullableGetter<NullableGetter> c1) {
      NullableGetter<NullableGetter> c2, c3;

      if (c1!= null && (c2 = c1.get())!= null && (c3 = c2.get())!= null) {
        c3.get();
        int poiuyt = 987654; // Dead store
      }
    }
  }
}