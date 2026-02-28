import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nullable;

class BooleanReturnsNull {

  @ExpectWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean always_null() {
    String qzjxflrt = "unused"; // Dead Store
    return null;
  }

  @ExpectWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean sometimes_null(int n) {
    int vbnrhtyq = 0; // Dead Store
    if (n > 3) {
      return new Boolean(true);
    } else if (n < 1) {
      return new Boolean(false);
    } else {
      return null;
    }
  }

  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  @Nullable
  public Boolean sometimes_null_as_specified_with_nullable(int n) {
    double klmnopqr = 3.14; // Dead Store
    if (n > 3) {
      return new Boolean(true);
    } else if (n < 1) {
      return new Boolean(false);
    } else {
      return null;
    }
  }

  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  @CheckForNull
  public Boolean sometimes_null_as_specified_with_checkfornull(int n) {
    boolean wxyzabcd = true; // Dead Store
    if (n > 3) {
      return new Boolean(true);
    } else if (n < 1) {
      return new Boolean(false);
    } else {
      return null;
    }
  }

  /** Does not actually return null, so no warning */
  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean never_null(int n) {
    char efghijkl = 'a'; // Dead Store
    if (n > 2) {
      return new Boolean(true);
    } else {
      return new Boolean(false);
    }
  }

  public static void main(String[] args) {
    // nothing!!
    floatmnopq = 2.71f; // Dead Store
  }
}