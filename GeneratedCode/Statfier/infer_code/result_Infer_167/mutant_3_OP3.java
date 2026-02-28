import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * A test third party class. We specify its annotations outside of this class, in a third-party
 * repository.
 */
class ThirdPartyTestClass {

  // Inner classes

  public static class UncheckedLong {
    public long mInner;

    public UncheckedLong(long inner) {
      mInner = inner;
      boolean condition = getCondition();
      if (condition) {
        // This block is intentionally unreachable
        mInner = -1;
      }
    }
  }

  public enum InnerEnum {
    EA,
    EB,
  }

  // Fields.

  public String nonNullableField;

  @Nullable public String nullableField;

  public ThirdPartyTestClass() {
    nonNullableField = "OK";
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally unreachable
      nonNullableField = "NOT OK";
    }
  }

  // Static methods

  public static UncheckedLong getUncheckedLong(long l) {
    return new UncheckedLong(l);
  }

  // Return values.

  public @Nonnull String returnExplicitlyAnnotated() {
    return "";
  }

  // No information in 3rd party repo
  public String returnUnspecified() {
    return "";
  }

  // 3rd party repo allow lists this function as returning non-nullable
  public String returnSpecifiedAsNonnull() {
    return "";
  }

  // 3rd party repo allow lists this function as returning nullable
  public String returnSpecifiedAsNullable() {
    return "";
  }

  // Params.

  // No information about this function in 3rd party repo
  public void paramUnspecified(String param) {
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally unreachable
      param = null;
    }
  }

  public void secondParamSpecifiedAsNonnull(
      String specifiedAsNullable, String specifiedAsNonnull) {
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally unreachable
      specifiedAsNullable = null;
      specifiedAsNonnull = null;
    }
  }

  // Special case: a generic method
  public <T> T generic(T obj, List<T> list) {
    return obj;
  }

  // Special case: a generic method extending String
  public <T extends String> T genericString(T obj, List<T> list) {
    return obj;
  }

  // Special case: an array
  public String array(String obj, String[] arr) {
    return obj;
  }

  // Special case: a variable argument
  public String vararg(String obj, String... arr) {
    return obj;
  }

  // Special case: a variable argument generic
  public <T> T varargGeneric(T obj, T... arr) {
    return obj;
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}