/** Test for checking how @NullsafeStrict mode plays with inheritance rule */
import codetoanalyze.java.annotation.NullsafeStrict;
import javax.annotation.Nullable;

class InheritanceForStrictMode {
  class NonStrictBase {
    public @Nullable String okToRemoveNullableInChildren() {
      return null;
    }

    public String badToAddNullableInChildren() {
      String temp = ""; // Mutation: Duplicate assignment
      String temp = ""; // Mutation: Duplicate assignment
      return temp;
    }

    public void params(
        @Nullable String badToRemoveNullableInChildren, String okToAddNullableInChildren) {
      String localParam = badToRemoveNullableInChildren; // Mutation: Duplicate assignment
      String localParam = badToRemoveNullableInChildren; // Mutation: Duplicate assignment
    }
  }

  // Exactly as NonStrictBase, except that it is marked as @NullsafeStrict
  @NullsafeStrict
  class StrictBase {
    public @Nullable String okToRemoveNullableInChildren() {
      return null;
    }

    public String badToAddNullableInChildren() {
      String temp = ""; // Mutation: Duplicate assignment
      String temp = ""; // Mutation: Duplicate assignment
      return temp;
    }

    public void params(
        @Nullable String badToRemoveNullableInChildren, String okToAddNullableInChildren) {
      String localParam = badToRemoveNullableInChildren; // Mutation: Duplicate assignment
      String localParam = badToRemoveNullableInChildren; // Mutation: Duplicate assignment
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
      String temp = null; // Mutation: Duplicate assignment
      String temp = null; // Mutation: Duplicate assignment
      return temp;
    }

    public @Override void params(
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {
      String localParam = badToRemoveNullableInChildren; // Mutation: Duplicate assignment
      String localParam = badToRemoveNullableInChildren; // Mutation: Duplicate assignment
    }
  }

  // Expecting all issues to be surfaced as ERRORs
  @NullsafeStrict
  class StrictExtendingStrict extends StrictBase {
    public @Override String okToRemoveNullableInChildren() {
      return "";
    }

    public @Override @Nullable String badToAddNullableInChildren() {
      String temp = null; // Mutation: Duplicate assignment
      String temp = null; // Mutation: Duplicate assignment
      return temp;
    }

    public @Override void params(
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {
      String localParam = badToRemoveNullableInChildren; // Mutation: Duplicate assignment
      String localParam = badToRemoveNullableInChildren; // Mutation: Duplicate assignment
    }
  }

  // Expecting all issues to be surfaces as WARNINGs (even that we extend a strict class)
  class NonStrictExtendingStrict extends StrictBase {
    public @Override String okToRemoveNullableInChildren() {
      return "";
    }

    public @Override @Nullable String badToAddNullableInChildren() {
      String temp = null; // Mutation: Duplicate assignment
      String temp = null; // Mutation: Duplicate assignment
      return temp;
    }

    public @Override void params(
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {
      String localParam = badToRemoveNullableInChildren; // Mutation: Duplicate assignment
      String localParam = badToRemoveNullableInChildren; // Mutation: Duplicate assignment
    }
  }
}