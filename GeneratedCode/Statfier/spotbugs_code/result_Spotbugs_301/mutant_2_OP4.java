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
    } else if (n < 1) {
      return new Boolean(false);
    } else {
      return null;
    }
    // Mutant: Adding an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return new Boolean(true);
    } else {
      return new Boolean(false);
    }
  }

  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  @Nullable
  public Boolean sometimes_null_as_specified_with_nullable(int n) {
    if (n > 3) {
      return new Boolean(true);
    } else if (n < 1) {
      return new Boolean(false);
    } else {
      return null;
    }
    // Mutant: Adding an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return new Boolean(true);
    } else {
      return new Boolean(false);
    }
  }

  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  @CheckForNull
  public Boolean sometimes_null_as_specified_with_checkfornull(int n) {
    if (n > 3) {
      return new Boolean(true);
    } else if (n < 1) {
      return new Boolean(false);
    } else {
      return null;
    }
    // Mutant: Adding an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return new Boolean(true);
    } else {
      return new Boolean(false);
    }
  }

  /** Does not actually return null, so no warning */
  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean never_null(int n) {
    if (n > 2) {
      return new Boolean(true);
    } else {
      return new Boolean(false);
    }
    // Mutant: Adding an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return new Boolean(true);
    } else {
      return new Boolean(false);
    }
  }

  public static void main(String[] args) {
    // nothing!!
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's dynamically determined
  }
}