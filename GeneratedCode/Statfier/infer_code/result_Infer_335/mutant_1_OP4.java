/** Test for checking how @NullsafeStrict mode plays with inheritance rule */
import codetoanalyze.java.annotation.NullsafeStrict;
import javax.annotation.Nullable;

class InheritanceForStrictMode {
  class NonStrictBase {
    public @Nullable String okToRemoveNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in NonStrictBase");
      }
      return null;
    }

    public String badToAddNullableInChildren() {
      return "";
    }

    public void params(
        @Nullable String badToRemoveNullableInChildren, String okToAddNullableInChildren) {
      boolean condition = getCondition();
      if (condition) {
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in NonStrictBase params");
      }
    }
  }

  // Exactly as NonStrictBase, except that it is marked as @NullsafeStrict
  @NullsafeStrict
  class StrictBase {
    public @Nullable String okToRemoveNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in StrictBase");
      }
      return null;
    }

    public String badToAddNullableInChildren() {
      return "";
    }

    public void params(
        @Nullable String badToRemoveNullableInChildren, String okToAddNullableInChildren) {
      boolean condition = getCondition();
      if (condition) {
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in StrictBase params");
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
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in StrictExtendingNonstrict");
      }
      return "";
    }

    public @Override @Nullable String badToAddNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in StrictExtendingNonstrict badToAddNullableInChildren");
      }
      return null;
    }

    public @Override void params(
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {
      boolean condition = getCondition();
      if (condition) {
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in StrictExtendingNonstrict params");
      }
    }
  }

  // Expecting all issues to be surfaced as ERRORs
  @NullsafeStrict
  class StrictExtendingStrict extends StrictBase {
    public @Override String okToRemoveNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in StrictExtendingStrict");
      }
      return "";
    }

    public @Override @Nullable String badToAddNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in StrictExtendingStrict badToAddNullableInChildren");
      }
      return null;
    }

    public @Override void params(
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {
      boolean condition = getCondition();
      if (condition) {
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in StrictExtendingStrict params");
      }
    }
  }

  // Expecting all issues to be surfaces as WARNINGs (even that we extend a strict class)
  class NonStrictExtendingStrict extends StrictBase {
    public @Override String okToRemoveNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in NonStrictExtendingStrict");
      }
      return "";
    }

    public @Override @Nullable String badToAddNullableInChildren() {
      boolean condition = getCondition();
      if (condition) {
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in NonStrictExtendingStrict badToAddNullableInChildren");
      }
      return null;
    }

    public @Override void params(
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {
      boolean condition = getCondition();
      if (condition) {
        // Some logic here
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in NonStrictExtendingStrict params");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}