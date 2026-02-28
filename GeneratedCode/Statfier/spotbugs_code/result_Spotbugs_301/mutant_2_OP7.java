import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nullable;

class BooleanReturnsNull {

  @ExpectWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean always_null() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @ExpectWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean sometimes_null(int n) {
    if (n > 3) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return new Boolean(true);
    } else if (n < 1) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return new Boolean(false);
    } else {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return null;
    }
  }

  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  @Nullable
  public Boolean sometimes_null_as_specified_with_nullable(int n) {
    if (n > 3) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return new Boolean(true);
    } else if (n < 1) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return new Boolean(false);
    } else {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return null;
    }
  }

  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  @CheckForNull
  public Boolean sometimes_null_as_specified_with_checkfornull(int n) {
    if (n > 3) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return new Boolean(true);
    } else if (n < 1) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return new Boolean(false);
    } else {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return null;
    }
  }

  /** Does not actually return null, so no warning */
  @NoWarning("NP_BOOLEAN_RETURN_NULL")
  public Boolean never_null(int n) {
    if (n > 2) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return new Boolean(true);
    } else {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return new Boolean(false);
    }
  }

  public static void main(String[] args) {
    // nothing!!
  }

  private boolean getCondition() {
    return false;
  }
}