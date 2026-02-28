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
      return new Boolean(true); // This branch is unreachable because condition is always false
    } else {
      return new Boolean(false); // This branch is also unreachable
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
      return new Boolean(true); // This branch is unreachable because condition is always false
    } else {
      return new Boolean(false); // This branch is also unreachable
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
      return new Boolean(true); // This branch is unreachable because condition is always false
    } else {
      return new Boolean(false); // This branch is also unreachable
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
      return new Boolean(true); // This branch is unreachable because condition is always false
    } else {
      return new Boolean(false); // This branch is also unreachable
    }
  }

  public static void main(String[] args) {
    // nothing!!
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}