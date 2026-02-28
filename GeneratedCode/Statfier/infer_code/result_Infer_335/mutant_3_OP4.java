/** Test for checking how @NullsafeStrict mode plays with inheritance rule */
import codetoanalyze.java.annotation.NullsafeStrict;
import javax.annotation.Nullable;

class InheritanceForStrictMode {
  class NonStrictBase {
    public @Nullable String okToRemoveNullableInChildren() {
      return null;
    }

    public String badToAddNullableInChildren() {
      return "";
    }

    public void params(
        @Nullable String badToRemoveNullableInChildren, String okToAddNullableInChildren) {}

    // Mutant: Unreachable if-else statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block.");
      }
    }

    private boolean getCondition() {
      return true; // Always returns true to ensure the else block is unreachable
    }
  }

  // Exactly as NonStrictBase, except that it is marked as @NullsafeStrict
  @NullsafeStrict
  class StrictBase {
    public @Nullable String okToRemoveNullableInChildren() {
      return null;
    }

    public String badToAddNullableInChildren() {
      return "";
    }

    public void params(
        @Nullable String badToRemoveNullableInChildren, String okToAddNullableInChildren) {}

    // Mutant: Unreachable if-else statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block.");
      }
    }

    private boolean getCondition() {
      return true; // Always returns true to ensure the else block is unreachable
    }
  }

  // Expecting all issues to be surfaced as ERRORs
  // NOTE: we currently DON'T require the base to be strictified in order to strictify a child (see
  // T60513926)
  @NullsafeStrict
  class StrictExtendingNonstrict extends NonStrictBase {
    public @Override String okToRemoveNullableInChildren() {
      return "";
    }

    public @Override @Nullable String badToAddNullableInChildren() {
      return null;
    }

    public @Override void params(
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {}

    // Mutant: Unreachable if-else statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block.");
      }
    }

    private boolean getCondition() {
      return true; // Always returns true to ensure the else block is unreachable
    }
  }

  // Expecting all issues to be surfaced as ERRORs
  @NullsafeStrict
  class StrictExtendingStrict extends StrictBase {
    public @Override String okToRemoveNullableInChildren() {
      return "";
    }

    public @Override @Nullable String badToAddNullableInChildren() {
      return null;
    }

    public @Override void params(
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {}

    // Mutant: Unreachable if-else statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block.");
      }
    }

    private boolean getCondition() {
      return true; // Always returns true to ensure the else block is unreachable
    }
  }

  // Expecting all issues to be surfaces as WARNINGs (even that we extend a strict class)
  class NonStrictExtendingStrict extends StrictBase {
    public @Override String okToRemoveNullableInChildren() {
      return "";
    }

    public @Override @Nullable String badToAddNullableInChildren() {
      return null;
    }

    public @Override void params(
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {}

    // Mutant: Unreachable if-else statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block.");
      }
    }

    private boolean getCondition() {
      return true; // Always returns true to ensure the else block is unreachable
    }
  }
}