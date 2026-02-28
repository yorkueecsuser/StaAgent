import codetoanalyze.java.annotation.Assertions;
import com.google.common.base.Preconditions;
import javax.annotation.Nullable;

class ConditionRedundant {

  String fieldNonnull = "";
  @Nullable String fieldNullable = "";

  @Nullable
  String getNullable() {
    return null;
  }

  String getNonnull() {
    return "";
  }

  void compareNEQ_NonnullIsBAD(String s) {
    if (s!= null) { // BAD: condition redundant
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void compareNEQ_NullableIsOK(@Nullable String s) {
    if (s!= null) { // OK: comparing with nullable
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void compareEQ_NonnullIsBAD(String s) {
    if (s == null) { // BAD: condition redundant
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void compareEQ_NullableIsOK(@Nullable String s) {
    if (s == null) { // OK: comparing with nullable
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  // `if` is not essential, we test all comparisons expressions

  void outsideOfIfCompareNonnullIsBAD(String s) {
    boolean b = s!= null; // BAD: condition redundant
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void outsideOfIfCompareNullableIsOK(@Nullable String s) {
    boolean b = s!= null; // OK: comparing with nullable
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  // comparing with nonnull is redundant even if it is a part of expression

  void conjunctionBothNonnullIsBAD(String s1, String s2) {
    if (s1!= null && s2!= null) { // BAD: both clauses are redudant
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void conjunctionOneNonnullIsBAD(@Nullable String s1, String s2) {
    if (s1!= null && s2!= null) { // BAD: one clause is redundant
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void conjunctionBothNullableIsOK(@Nullable String s1, @Nullable String s2) {
    if (s1!= null && s2!= null) { // OK: both clauses make sense
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void disjunctionBothNonnullIsBAD(String s1, String s2) {
    if (s1!= null || s2!= null) { // BAD: both clauses are redudant
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void disjunctionOneNonnullIsBAD(@Nullable String s1, String s2) {
    if (s1!= null || s2!= null) { // BAD: one clause is redundant
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void disjunctionBothNullableIsOK(@Nullable String s1, @Nullable String s2) {
    if (s1!= null || s2!= null) { // OK: both clauses make sense
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  // Adding some irrelevant conditions does not make the issue go away

  void irrelevantConditionWithNonnullIsBAD(String s1, @Nullable String s2, int someInt) {
    if (someInt == 1 || s1 == null || s2!= null) { // BAD: check for s1 is redundant
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void irrelevantConditionAllNullablesIsOK(@Nullable String s1, @Nullable String s2, int someInt) {
    if (someInt == 1 || s1 == null || s2!= null) { // OK: all clauses maeke sense
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  // Comparing expressions (not local variables) with null

  void ternary_NonnullInBothBranchesIsBAD(String s1, String s2, int someInt) {
    // BAD: comparing nonnull with null is redundant
    if ((someInt == 1? s1 : s2) == null) {
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void ternary_NullableInBothBranchesIsOK(@Nullable String s1, @Nullable String s2, int someInt) {
    // OK: the result is nullable
    if ((someInt == 1? s1 : s2) == null) {
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void ternary_NonnullInOneBranch_FirstBranch_IsOK(String s1, @Nullable String s2, int someInt) {
    // OK: the result is nullable
    if ((someInt == 1? s1 : s2) == null) {
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  // But if we just swap the order, we have a FP.
  // (CFG extracts this expression to a form when one of flows contain only nonnull, hence the
  // report).
  // TODO(T54065455) Don't report in this case
  void FP_ternary_NonnullInOneBranch_SecondBranch_ShouldBeOK(
      @Nullable String s1, String s2, int someInt) {
    if ((someInt == 1? s1 : s2) == null) { // FP: expression can be null
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void testFlowSensitivity(@Nullable String nullable1, @Nullable String nullable2) {
    if (nullable1!= null) { // OK: comparing nullable with null
      if (nullable1!= null) { // BAD: now nullable1 is nonnull
        if (nullable2!= null) { // OK: nullable2 can still be null
          if (nullable1!= null) { // BAD: nullable1 is still nonnull
            // Do something
          }
        }
      }
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  // Test comparison with functions

  void comparingNonnullFunctionIsBAD() {
    if (getNonnull()!= null) { // BAD: comparing with nonnull
      // do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void comparingNullableFunctionIsOK() {
    if (getNullable()!= null) { // OK: comparing with nullable
      // do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  // Test comparison with fields

  void comparingNonnullFieldIsBAD() {
    if (fieldNonnull!= null) { // BAD: condition redundant
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void comparingNullableFieldIsOK() {
    if (fieldNullable!= null) { // OK: comparing with nullable
      // Do something
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void comparingNullableFieldThatIsAlreadyCheckedIsBAD() {
    if (fieldNullable!= null) { // OK: comparing with nullable
      if (fieldNullable!= null) {
        // BAD: at this point we already know field is not nullable
      }
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  // Test assertions that are modelled in Nullsafe

  void checkNotNull_NonnullIsBAD(String s) {
    Preconditions.checkNotNull(s, "BAD: we already know it is not nullable");
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void checkNotNull_NullableIsOK(@Nullable String s) {
    Preconditions.checkNotNull(s, "totally legit check");
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void checkArgument_NonnullIsBAd(String s) {
    Preconditions.checkArgument(s!= null, "BAD: we know it is not null");
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void checkArgument_NullableIsOK(@Nullable String s) {
    Preconditions.checkArgument(s!= null, "totally legit check");
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void assertNotNull_NonnullIsBAD(String s) {
    Assertions.assertNotNull(s, "BAD: we know it is not null");
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void assertNotNull_NullableIsOK(@Nullable String s) {
    Assertions.assertNotNull(s, "totally legit check");
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  // Test nullability inference in try-catch

  static void maythrow() throws java.io.IOException {}

  void comparingWithNullIfAssignedBeforeThrowableIsBAD() throws java.io.IOException {
    String s = null;
    try {
      s = "123";
      maythrow();
    } finally {
      if (s!= null) { // BAD: this is redundant
        // Do something
      }
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  void comparingWithNullIfAssignedAfterThrowableIsOK() throws java.io.IOException {
    String s = null;
    try {
      maythrow();
      s = "123";
    } finally {
      if (s!= null) { // OK: if `maythrow` throws, it will indeed be null
        // Do something
      }
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This is unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, but it's not a compile-time constant
  }
}