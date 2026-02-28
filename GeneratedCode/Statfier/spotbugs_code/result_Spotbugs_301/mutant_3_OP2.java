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
  public Boolean sometimes_null(int n) {
    if (n > 3) {
      return new Boolean(true);
      return new Boolean(true); // Mutant: duplicated assignment
    } else if (n < 1) {
      return new Boolean(false);
      return new Boolean(false); // Mutant: duplicated assignment
    } else {
      return null;
      return null; // Mutant: duplicated assignment
    }
  }

  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  @Nullable
  public Boolean sometimes_null_as_specified_with_nullable(int n) {
    if (n > 3) {
      return new Boolean(true);
      return new Boolean(true); // Mutant: duplicated assignment
    } else if (n < 1) {
      return new Boolean(false);
      return new Boolean(false); // Mutant: duplicated assignment
    } else {
      return null;
      return null; // Mutant: duplicated assignment
    }
  }

  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  @CheckForNull
  public Boolean sometimes_null_as_specified_with_checkfornull(int n) {
    if (n > 3) {
      return new Boolean(true);
      return new Boolean(true); // Mutant: duplicated assignment
    } else if (n < 1) {
      return new Boolean(false);
      return new Boolean(false); // Mutant: duplicated assignment
    } else {
      return null;
      return null; // Mutant: duplicated assignment
    }
  }

  /** Does not actually return null, so no warning */
  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean never_null(int n) {
    if (n > 2) {
      return new Boolean(true);
      return new Boolean(true); // Mutant: duplicated assignment
    } else {
      return new Boolean(false);
      return new Boolean(false); // Mutant: duplicated assignment
    }
  }

  public static void main(String[] args) {
    // nothing!!
  }
}