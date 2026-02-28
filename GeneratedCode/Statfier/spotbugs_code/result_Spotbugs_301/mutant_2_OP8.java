import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nullable;

class BooleanReturnsNull {

  @ExpectWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean always_null() {
    return null;
  }

  @ExpectWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean sometimes_null(int m) { // Renamed 'n' to'm'
    if (m > 3) {
      return new Boolean(true);
    } else if (m < 1) {
      return new Boolean(false);
    } else {
      return null;
    }
  }

  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  @Nullable
  public Boolean sometimes_null_as_specified_with_nullable(int x) { // Renamed 'n' to 'x'
    if (x > 3) {
      return new Boolean(true);
    } else if (x < 1) {
      return new Boolean(false);
    } else {
      return null;
    }
  }

  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  @CheckForNull
  public Boolean sometimes_null_as_specified_with_checkfornull(int y) { // Renamed 'n' to 'y'
    if (y > 3) {
      return new Boolean(true);
    } else if (y < 1) {
      return new Boolean(false);
    } else {
      return null;
    }
  }

  /** Does not actually return null, so no warning */
  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean never_null(int z) { // Renamed 'n' to 'z'
    if (z > 2) {
      return new Boolean(true);
    } else {
      return new Boolean(false);
    }
  }

  public static void main(String[] args) {
    // nothing!!
  }
}