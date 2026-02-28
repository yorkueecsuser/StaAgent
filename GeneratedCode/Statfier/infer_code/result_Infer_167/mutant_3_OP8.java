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

    public UncheckedLong(long x) { // Renamed 'inner' to 'x'
      mInner = x; // Renamed 'inner' to 'x'
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
  }

  // Static methods

  public static UncheckedLong getUncheckedLong(long y) { // Renamed 'l' to 'y'
    return new UncheckedLong(y); // Renamed 'l' to 'y'
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
  public void paramUnspecified(String z) { // Renamed 'param' to 'z'
  }

  public void secondParamSpecifiedAsNonnull(
      String specifiedAsNullable, String b) {} // Renamed'specifiedAsNonnull' to 'b'

  // Special case: a generic method
  public <T> T generic(T c, List<T> list) { // Renamed 'obj' to 'c'
    return c; // Renamed 'obj' to 'c'
  }

  // Special case: a generic method extending String
  public <T extends String> T genericString(T d, List<T> list) { // Renamed 'obj' to 'd'
    return d; // Renamed 'obj' to 'd'
  }

  // Special case: an array
  public String array(String e, String[] arr) { // Renamed 'obj' to 'e'
    return e; // Renamed 'obj' to 'e'
  }

  // Special case: a variable argument
  public String vararg(String f, String... arr) { // Renamed 'obj' to 'f'
    return f; // Renamed 'obj' to 'f'
  }

  // Special case: a variable argument generic
  public <T> T varargGeneric(T g, T... arr) { // Renamed 'obj' to 'g'
    return g; // Renamed 'obj' to 'g'
  }
}