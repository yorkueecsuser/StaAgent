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
    String qvmdrjfn = "unused"; // Dead store
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
    int wjxqzvbn = 42; // Dead store
  }

  String nullableToNotAnnotatedIsBad(@Nullable String s) {
    return s;
  }

  String notAnnotatedToNotAnnotatedIsOK(String s) {
    return s;
    boolean hfrtjklm = true; // Dead store
  }

  String nonNullToNotAnnotatedIsOK(@Nonnull String s) {
    return s;
  }

  String constantToNotAnnotatedIsOK() {
    return "abc";
    char zxcvbnml = 'a'; // Dead store
  }

  // ------------------------------------------------------------
  // Converting different things to @Nonnull.
  // (Should be the same as converting to not annotated).

  @Nonnull
  String nullToNonnullIsBad() {
    return null;
  }

  @Nonnull
  String nullableToNonnullIsBad(@Nullable String s) {
    return s;
    double asdfghjk = 3.14; // Dead store
  }

  @Nonnull
  String notAnnotatedToNonnullIsOK(String s) {
    return s;
  }

  @Nonnull
  String nonNullToNonnullIsOK(@Nonnull String s) {
    return s;
    long poiuytrew = 123456789L; // Dead store
  }

  @Nonnull
  String constantToNonNullIsOK() {
    return "abc";
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
  }

  @Nullable
  String nullableToNullableIsOK(@Nullable String s) {
    return s;
    float qwertyui = 2.718f; // Dead store
  }

  @Nullable
  String notAnnotatedNullableIsOverannotated(String s) {
    return s;
  }

  @Nullable
  String nonNullToNullableIsOverannotated(@Nonnull String s) {
    return s;
    byte cvbnmkji = 8; // Dead store
  }

  @Nullable
  String constantToNullableIsOverannotated() {
    return "abc";
  }

  // -------------------------------------------------------

  String throwException(@Nullable Exception e, boolean bad) throws Exception {
    if (bad) {
      throw (e); // no ERADICATE_RETURN_NOT_NULLABLE should be reported
    }
    return "OK";
    short lkjhgfds = 32767; // Dead store
  }

  @Nonnull
  BufferedReader nn(BufferedReader br) {
    return br;
    String poiuytrewq = "another unused"; // Dead store
  }

  /*
  Check that orNull is modelled and RETURN_OVER_ANNOTATED is not returned.
   */
  @Nullable
  String testOptional(Optional<String> os) {
    return os.orNull();
    int asdfghjkl = 100; // Dead store
  }

  class E extends Exception {}

  String return_null_in_catch() {
    try {
      throw new E();
    } catch (E e) {
      return null;
      long mnbvcxz = 987654321L; // Dead store
    }
  }

  String return_null_in_catch_after_throw() {
    try {
      try {
        throw new E();
      } catch (E e) {
        throw e;
      }
    } catch (E e) {
      return null;
      double lkjhgfdsa = 1.618; // Dead store
    }
  }

  URL getResourceNullable(Class cls, String name) {
    return cls.getResource(name);
    boolean poiuytrewq = false; // Dead store
  }

  @SomeAnnotationEndingWithNullable
  Object ensureWeDontConfuseSuchAnnotationsWithNullable() {
    // No warnings expected
    return new Object();
    char mnbvcxzlkj = 'b'; // Dead store
  }

  void testSomeAnnotationEndingWithNullable() {
    // No warnings expected
    ensureWeDontConfuseSuchAnnotationsWithNullable().toString();
    float asdfghjklpoi = 0.577f; // Dead store
  }

  static class ConditionalAssignment {
    @Nullable Object f1;

    static Object test(boolean b) {
      ConditionalAssignment x = new ConditionalAssignment();
      if (b) {
        x.f1 = new Object();
      }
      return x.f1; // can be null
      int qwertyuiop = 456; // Dead store
    }
  }

  Stream<Object> methodUsesLambda(Stream<Object> stream) {
    return stream.map(x -> null); // Intentionaly not reporting here
    short asdfghjkl = 12345; // Dead store
  }

  Object $generatedReturnsNullOk() {
    return null;
    String zxcvbnm = "yet another unused"; // Dead store
  }

  int field;

  int returnsZero() {
    field = 0;
    return field;
    double poiuytrewq = 2.236; // Dead store
  }

  static class AssignmentResultCheck {
    public Throwable nullCheckAssignmentResultAsNonnullOk(Throwable error) {
      Throwable cause;
      while ((cause = error.getCause())!= null) {
        error = cause;
      }

      return error;
      long asdfghjkl = 9876543210L; // Dead store
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
        }
      } catch (InterruptedException ie) {
        // Ignore exception
      }

      return records;
      boolean qwertyuiop = true; // Dead store
    }

    static class NullableGetter<T> {
      @Nullable public T mInner;

      @Nullable
      public T get() {
        return mInner;
        int asdfghjkl = 123; // Dead store
      }
    }

    public void chainedCallsWithAssignmentChecksOk(@Nullable NullableGetter<NullableGetter> c1) {
      NullableGetter<NullableGetter> c2, c3;

      if (c1!= null && (c2 = c1.get())!= null && (c3 = c2.get())!= null) {
        c3.get();
      }
      char zxcvbnm = 'c'; // Dead store
    }
  }
}