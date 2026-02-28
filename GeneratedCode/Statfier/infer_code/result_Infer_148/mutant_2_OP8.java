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
  }

  void compareNEQ_NullableIsOK(@Nullable String s) {
    if (s!= null) { // OK: comparing with nullable
      // Do something
    }
  }

  void compareEQ_NonnullIsBAD(String s) {
    if (s == null) { // BAD: condition redundant
      // Do something
    }
  }

  void compareEQ_NullableIsOK(@Nullable String s) {
    if (s == null) { // OK: comparing with nullable
      // Do something
    }
  }

  // `if` is not essential, we test all comparisons expressions

  void outsideOfIfCompareNonnullIsBAD(String s) {
    boolean b = s!= null; // BAD: condition redundant
  }

  void outsideOfIfCompareNullableIsOK(@Nullable String s) {
    boolean b = s!= null; // OK: comparing with nullable
  }

  // comparing with nonnull is redundant even if it is a part of expression

  void conjunctionBothNonnullIsBAD(String s1, String s2) {
    if (s1!= null && s2!= null) { // BAD: both clauses are redudant
      // Do something
    }
  }

  void conjunctionOneNonnullIsBAD(@Nullable String s1, String s2) {
    if (s1!= null && s2!= null) { // BAD: one clause is redundant
      // Do something
    }
  }

  void conjunctionBothNullableIsOK(@Nullable String s1, @Nullable String s2) {
    if (s1!= null && s2!= null) { // OK: both clauses make sense
      // Do something
    }
  }

  void disjunctionBothNonnullIsBAD(String s1, String s2) {
    if (s1!= null || s2!= null) { // BAD: both clauses are redudant
      // Do something
    }
  }

  void disjunctionOneNonnullIsBAD(@Nullable String s1, String s2) {
    if (s1!= null || s2!= null) { // BAD: one clause is redundant
      // Do something
    }
  }

  void disjunctionBothNullableIsOK(@Nullable String s1, @Nullable String s2) {
    if (s1!= null || s2!= null) { // OK: both clauses make sense
      // Do something
    }
  }

  // Adding some irrelevant conditions does not make the issue go away

  void irrelevantConditionWithNonnullIsBAD(String s1, @Nullable String s2, int someInt) {
    if (someInt == 1 || s1 == null || s2!= null) { // BAD: check for s1 is redundant
      // Do something
    }
  }

  void irrelevantConditionAllNullablesIsOK(@Nullable String s1, @Nullable String s2, int someInt) {
    if (someInt == 1 || s1 == null || s2!= null) { // OK: all clauses maeke sense
      // Do something
    }
  }

  // Comparing expressions (not local variables) with null

  void ternary_NonnullInBothBranchesIsBAD(String s1, String s2, int someInt) {
    // BAD: comparing nonnull with null is redundant
    if ((someInt == 1? s1 : s2) == null) {
      // Do something
    }
  }

  void ternary_NullableInBothBranchesIsOK(@Nullable String s1, @Nullable String s2, int someInt) {
    // OK: the result is nullable
    if ((someInt == 1? s1 : s2) == null) {
      // Do something
    }
  }

  void ternary_NonnullInOneBranch_FirstBranch_IsOK(String s1, @Nullable String s2, int someInt) {
    // OK: the result is nullable
    if ((someInt == 1? s1 : s2) == null) {
      // Do something
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
  }

  // Test comparison with functions

  void comparingNonnullFunctionIsBAD() {
    if (getNonnull()!= null) { // BAD: comparing with nonnull
      // do something
    }
  }

  void comparingNullableFunctionIsOK() {
    if (getNullable()!= null) { // OK: comparing with nullable
      // do something
    }
  }

  // Test comparison with fields

  void comparingNonnullFieldIsBAD() {
    if (fieldNonnull!= null) { // BAD: condition redundant
      // Do something
    }
  }

  void comparingNullableFieldIsOK() {
    if (fieldNullable!= null) { // OK: comparing with nullable
      // Do something
    }
  }

  void comparingNullableFieldThatIsAlreadyCheckedIsBAD() {
    if (fieldNullable!= null) { // OK: comparing with nullable
      if (fieldNullable!= null) {
        // BAD: at this point we already know field is not nullable
      }
    }
  }

  // Test assertions that are modelled in Nullsafe

  void checkNotNull_NonnullIsBAD(String s) {
    Preconditions.checkNotNull(s, "BAD: we already know it is not nullable");
  }

  void checkNotNull_NullableIsOK(@Nullable String s) {
    Preconditions.checkNotNull(s, "totally legit check");
  }

  void checkArgument_NonnullIsBAd(String s) {
    Preconditions.checkArgument(s!= null, "BAD: we know it is not null");
  }

  void checkArgument_NullableIsOK(@Nullable String s) {
    Preconditions.checkArgument(s!= null, "totally legit check");
  }

  void assertNotNull_NonnullIsBAD(String s) {
    Assertions.assertNotNull(s, "BAD: we know it is not null");
  }

  void assertNotNull_NullableIsOK(@Nullable String s) {
    Assertions.assertNotNull(s, "totally legit check");
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
  }

  // Mutated code
  void compareNEQ_NonnullIsBAD(String x) {
    if (x!= null) { // BAD: condition redundant
      // Do something
    }
  }

  void compareNEQ_NullableIsOK(@Nullable String y) {
    if (y!= null) { // OK: comparing with nullable
      // Do something
    }
  }

  void compareEQ_NonnullIsBAD(String z) {
    if (z == null) { // BAD: condition redundant
      // Do something
    }
  }

  void compareEQ_NullableIsOK(@Nullable String w) {
    if (w == null) { // OK: comparing with nullable
      // Do something
    }
  }

  void outsideOfIfCompareNonnullIsBAD(String v) {
    boolean c = v!= null; // BAD: condition redundant
  }

  void outsideOfIfCompareNullableIsOK(@Nullable String u) {
    boolean d = u!= null; // OK: comparing with nullable
  }

  void conjunctionBothNonnullIsBAD(String t, String r) {
    if (t!= null && r!= null) { // BAD: both clauses are redudant
      // Do something
    }
  }

  void conjunctionOneNonnullIsBAD(@Nullable String q, String p) {
    if (q!= null && p!= null) { // BAD: one clause is redundant
      // Do something
    }
  }

  void conjunctionBothNullableIsOK(@Nullable String o, @Nullable String n) {
    if (o!= null && n!= null) { // OK: both clauses make sense
      // Do something
    }
  }

  void disjunctionBothNonnullIsBAD(String m, String l) {
    if (m!= null || l!= null) { // BAD: both clauses are redudant
      // Do something
    }
  }

  void disjunctionOneNonnullIsBAD(@Nullable String k, String j) {
    if (k!= null || j!= null) { // BAD: one clause is redundant
      // Do something
    }
  }

  void disjunctionBothNullableIsOK(@Nullable String i, @Nullable String h) {
    if (i!= null || h!= null) { // OK: both clauses make sense
      // Do something
    }
  }

  void irrelevantConditionWithNonnullIsBAD(String g, @Nullable String f, int e) {
    if (e == 1 || g == null || f!= null) { // BAD: check for g is redundant
      // Do something
    }
  }

  void irrelevantConditionAllNullablesIsOK(@Nullable String d, @Nullable String c, int b) {
    if (b == 1 || d == null || c!= null) { // OK: all clauses maeke sense
      // Do something
    }
  }

  void ternary_NonnullInBothBranchesIsBAD(String a, String z, int y) {
    // BAD: comparing nonnull with null is redundant
    if ((y == 1? a : z) == null) {
      // Do something
    }
  }

  void ternary_NullableInBothBranchesIsOK(@Nullable String x, @Nullable String w, int v) {
    // OK: the result is nullable
    if ((v == 1? x : w) == null) {
      // Do something
    }
  }

  void ternary_NonnullInOneBranch_FirstBranch_IsOK(String u, @Nullable String t, int s) {
    // OK: the result is nullable
    if ((s == 1? u : t) == null) {
      // Do something
    }
  }

  void FP_ternary_NonnullInOneBranch_SecondBranch_ShouldBeOK(
      @Nullable String r, String q, int p) {
    if ((p == 1? r : q) == null) { // FP: expression can be null
      // Do something
    }
  }

  void testFlowSensitivity(@Nullable String o, @Nullable String n) {
    if (o!= null) { // OK: comparing nullable with null
      if (o!= null) { // BAD: now o is nonnull
        if (n!= null) { // OK: n can still be null
          if (o!= null) { // BAD: o is still nonnull
            // Do something
          }
        }
      }
    }
  }

  void comparingNonnullFunctionIsBAD() {
    if (getNonnull()!= null) { // BAD: comparing with nonnull
      // do something
    }
  }

  void comparingNullableFunctionIsOK() {
    if (getNullable()!= null) { // OK: comparing with nullable
      // do something
    }
  }

  void comparingNonnullFieldIsBAD() {
    if (fieldNonnull!= null) { // BAD: condition redundant
      // Do something
    }
  }

  void comparingNullableFieldIsOK() {
    if (fieldNullable!= null) { // OK: comparing with nullable
      // Do something
    }
  }

  void comparingNullableFieldThatIsAlreadyCheckedIsBAD() {
    if (fieldNullable!= null) { // OK: comparing with nullable
      if (fieldNullable!= null) {
        // BAD: at this point we already know field is not nullable
      }
    }
  }

  void checkNotNull_NonnullIsBAD(String s) {
    Preconditions.checkNotNull(s, "BAD: we already know it is not nullable");
  }

  void checkNotNull_NullableIsOK(@Nullable String r) {
    Preconditions.checkNotNull(r, "totally legit check");
  }

  void checkArgument_NonnullIsBAd(String q) {
    Preconditions.checkArgument(q!= null, "BAD: we know it is not null");
  }

  void checkArgument_NullableIsOK(@Nullable String p) {
    Preconditions.checkArgument(p!= null, "totally legit check");
  }

  void assertNotNull_NonnullIsBAD(String o) {
    Assertions.assertNotNull(o, "BAD: we know it is not null");
  }

  void assertNotNull_NullableIsOK(@Nullable String n) {
    Assertions.assertNotNull(n, "totally legit check");
  }

  void comparingWithNullIfAssignedBeforeThrowableIsBAD() throws java.io.IOException {
    String m = null;
    try {
      m = "123";
      maythrow();
    } finally {
      if (m!= null) { // BAD: this is redundant
        // Do something
      }
    }
  }

  void comparingWithNullIfAssignedAfterThrowableIsOK() throws java.io.IOException {
    String l = null;
    try {
      maythrow();
      l = "123";
    } finally {
      if (l!= null) { // OK: if `maythrow` throws, it will indeed be null
        // Do something
      }
    }
  }
}