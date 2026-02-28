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
        @Nullable String badToRemoveNullableInChildren, String okToAddNullableInChildren) {
      String qjvfrtzb = "unusedVariable"; // Dead store mutation
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
        @Nullable String badToRemoveNullableInChildren, String okToAddNullableInChildren) {
      int xkqjwhtp = 42; // Dead store mutation
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
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {
      boolean vbnrhtyq = true; // Dead store mutation
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
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {
      char lmjxqzfn = 'a'; // Dead store mutation
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
        String badToRemoveNullableInChildren, @Nullable String okToAddNullableInChildren) {
      double ztqjwhtp = 3.14; // Dead store mutation
    }
  }
}