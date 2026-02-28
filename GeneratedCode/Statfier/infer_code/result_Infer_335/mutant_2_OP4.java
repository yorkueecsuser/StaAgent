/** Test for checking how @NullsafeStrict mode plays with inheritance rule */
import codetoanalyze.java.annotation.NullsafeStrict;
import javax.annotation.Nullable;

class InheritanceForStrictMode {
  class NonStrictBase {
    public @Nullable String okToRemoveNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
      return null;
    }

    public String badToAddNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
      return "";
    }

    public void params(
        @Nullable String badToRemoveNullableInChildren, String okToAddNullableInChildren) {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
    }
  }

  // Exactly as NonStrictBase, except that it is marked as @NullsafeStrict
  @NullsafeStrict
  class StrictBase {
    public @Nullable String okToRemoveNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
      return null;
    }

    public String badToAddNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
      return "";
    }

    public void params(
        @Nullable String badToRemoveNullableInChildren, String okToAddNullableInChildren) {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
    }
  }

  // Expecting all issues to be surfaced as ERRORs
  // NOTE: we currently DON'T require the base to be strictified in order to strictify a child (see
  // T60513926)
  @NullsafeStrict
  class StrictExtendingNonstrict extends NonStrictBase {
    public @Override String okToRemoveNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
      return "";
    }

    public @Override @Nullable String badToAddNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
      return null;
    }

    public @Override void params(
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
    }
  }

  // Expecting all issues to be surfaced as ERRORs
  @NullsafeStrict
  class StrictExtendingStrict extends StrictBase {
    public @Override String okToRemoveNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
      return "";
    }

    public @Override @Nullable String badToAddNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
      return null;
    }

    public @Override void params(
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
    }
  }

  // Expecting all issues to be surfaces as WARNINGs (even that we extend a strict class)
  class NonStrictExtendingStrict extends StrictBase {
    public @Override String okToRemoveNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
      return "";
    }

    public @Override @Nullable String badToAddNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
      return null;
    }

    public @Override void params(
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
    }
  }

  private boolean getCondition() {
    return false; // This will ensure the else block is unreachable, but it's dynamically determined
  }
}