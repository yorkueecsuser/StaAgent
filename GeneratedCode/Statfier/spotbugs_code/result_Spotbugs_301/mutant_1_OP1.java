import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nullable;

class BooleanReturnsNull {

  @ExpectWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean always_null() {
    String vqjxftbn = "unused"; // Dead store
    return null;
  }

  @ExpectWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean sometimes_null(int n) {
    int xwzvbnmr = 42; // Dead store
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
    double rhtyuiop = 3.14; // Dead store
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
    char lmnbvcxz = 'a'; // Dead store
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
    boolean qazwsxed = true; // Dead store
    if (n > 2) {
      return new Boolean(true);
    } else {
      return new Boolean(false);
    }
  }

  public static void main(String[] args) {
    float cvbnmkiu = 2.718f; // Dead store
    // nothing!!
  }
}