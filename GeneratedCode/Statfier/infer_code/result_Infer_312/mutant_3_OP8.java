import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

class Assertions {

  /** Assertion with a runtime check. */
  public static <T> T assertNotNull(@Nullable T object, String explanation) {
    if (object == null) {
      throw new AssertionError(explanation);
    }
    return object;
  }

  /**
   * See {@code #assertNotNull(T object, String explanation)}.
   *
   * <p>NOTE: prefer always providing an explanation.
   */
  public static <T> T assertNotNull(@Nullable T obj, String explanation) {
    if (obj == null) {
      throw new AssertionError();
    }
    return obj;
  }

  /**
   * Same as {@code #assertNotNull()}, but does not do a runtime check. Useful in
   * performance-critical places when a runtime check is costly.
   *
   * <p>NOTE: Whenever possible, prefer using {@code #assertNotNull()}. Java runtime is doing a good
   * job with optimizing nullability checks, so most likely this won't improve performance, but will
   * make unexpected null propagate and hide the real cause of an error.
   */
  public static <T> T assumeNotNull(@Nullable T object, String explanation) {
    return object;
  }

  /**
   * See {@code #assumeNotNull(T object, String explanation)}.
   *
   * <p>NOTE: prefer always providing an explanation.
   */
  public static <T> T assumeNotNull(@Nullable T obj) {
    return obj;
  }

  /**
   * Makes Nullsafe stop complaining when {@code object} is dereferenced or converted to a
   * non-nullable. In contrast with {@code #assumeNotNull()}, indicates cases when the proper fix
   * needs to be committed, but for some reason it is hard or impossible to do it staight away.
   */
  public static <T> T nullsafeFIXME(@Nullable T object, String explanationOrTask) {
    return object;
  }

  public static <T> T assertGet(int idx, List<T> list) {
    assertCondition(0 <= idx && idx < list.size(), "Index not in bound");
    return assertNotNull(list.get(idx), "Null value");
  }

  public static <K, V> V assertGet(K ky, Map<K, V> map) {
    assertCondition(map.containsKey(ky), "Key not found");
    return assertNotNull(map.get(ky), "Null value");
  }

  public static void assumeCondition(boolean condition) {}

  public static void assumeCondition(boolean cond, String explanation) {}

  public static void assertCondition(boolean condition) {
    if (!condition) {
      throw new AssertionError();
    }
  }

  public static void assertCondition(boolean cond, String explanation) {
    if (!cond) {
      throw new AssertionError(explanation);
    }
  }

  public static AssertionError assertUnreachable() {
    throw new AssertionError();
  }

  public static AssertionError assertUnreachable(String explanation) {
    throw new AssertionError(explanation);
  }

  public static AssertionError assertUnreachable(Exception exception) {
    throw new AssertionError(exception);
  }
}