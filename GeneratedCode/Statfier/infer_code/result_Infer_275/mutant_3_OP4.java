import codetoanalyze.java.annotation.Nullsafe;

/** Test to ensure we correctly evaluate mode for nested classes */
@Nullsafe(Nullsafe.Mode.LOCAL)
class NullsafeLocal {

  public String shouldBeNullsafeModeError() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      return null;
    } else {
      // Unreachable if-else branch
      return "Unreachable";
    }
  }

  // Mode should be inherited from the parent class
  class Nested {
    public String shouldBeNullsafeModeError() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        return null;
      } else {
        // Unreachable if-else branch
        return "Unreachable";
      }
    }

    // Mode propagation should be transitive
    class DeeplyNested {
      public String shouldBeNullsafeModeError() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Original code
          return null;
        } else {
          // Unreachable if-else branch
          return "Unreachable";
        }
      }
    }

    // This is Local, but not Strict mode
    public String returningDefaultNotNullIsOK() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        return Default.getString();
      } else {
        // Unreachable if-else branch
        return "Unreachable";
      }
    }
  }

  // It is OK to make nested classes more strict
  @Nullsafe(Nullsafe.Mode.STRICT)
  class NestedStrict {
    public String returningDefaultNotNullIsError() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        return Default.getString();
      } else {
        // Unreachable if-else branch
        return "Unreachable";
      }
    }
  }

  // No need to repeat the mode - it is redundant
  @Nullsafe(Nullsafe.Mode.LOCAL)
  class NestedExplicitLocal {
    public String shouldBeNullsafeModeError() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        return null;
      } else {
        // Unreachable if-else branch
        return "Unreachable";
      }
    }
  }
}

@Nullsafe(Nullsafe.Mode.STRICT)
class NullsafeStrict {
  public String returningDefaultNotNullIsError() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      return Default.getString();
    } else {
      // Unreachable if-else branch
      return "Unreachable";
    }
  }

  // STRICT mode is propagated to the nested class
  class Nested {
    public String returningDefaultNotNullIsError() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        return Default.getString();
      } else {
        // Unreachable if-else branch
        return "Unreachable";
      }
    }

    // Impossible to downgrade the level of nested class, even if the nested mode
    // is implicit
    @Nullsafe(Nullsafe.Mode.LOCAL)
    class DeeplyNestedLocalIsStillStrict {
      public String returningDefaultNotNullIsError() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Original code
          return Default.getString();
        } else {
          // Unreachable if-else branch
          return "Unreachable";
        }
      }
    }
  }

  // Impossible to downgrade the level of nested class
  @Nullsafe(Nullsafe.Mode.LOCAL)
  class NestedLocalIsStillStrict {
    public String returningDefaultNotNullIsError() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        return Default.getString();
      } else {
        // Unreachable if-else branch
        return "Unreachable";
      }
    }
  }
}

class Default {
  public static String getString() {
    return "";
  }

  // OK for nested to be @Nullsafe but the outer is not
  @Nullsafe(Nullsafe.Mode.LOCAL)
  class NestedLocal {
    public String shouldBeNullsafeModeError() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        return null;
      } else {
        // Unreachable if-else branch
        return "Unreachable";
      }
    }

    // This is Local, but not Strict mode
    public String returningDefaultNotNullIsOK() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        return Default.getString();
      } else {
        // Unreachable if-else branch
        return "Unreachable";
      }
    }

    // And we can increase strictness even more
    @Nullsafe(Nullsafe.Mode.STRICT)
    class DeeplyNestedStrict {
      public String returningDefaultNotNullIsError() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Original code
          return Default.getString();
        } else {
          // Unreachable if-else branch
          return "Unreachable";
        }
      }
    }
  }
}

class A {
  public static String getString() {
    return "";
  }
}

class B {}

class C {
  public static String getString() {
    return "";
  }
}

@Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({A.class, B.class}))
class TrustSome {

  public String trustA_OK() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      return A.getString();
    } else {
      // Unreachable if-else branch
      return "Unreachable";
    }
  }

  public String dontTrustC_Bad() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      return C.getString();
    } else {
      // Unreachable if-else branch
      return "Unreachable";
    }
  }

  // Inherits mode from the outer, the same trust
  class NotAnnotatedNested {
    public String trustA_OK() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        return A.getString();
      } else {
        // Unreachable if-else branch
        return "Unreachable";
      }
    }

    public String dontTrustC_Bad() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        return C.getString();
      } else {
        // Unreachable if-else branch
        return "Unreachable";
      }
    }
  }

  // This class does not trust A anymore
  @Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({B.class}))
  class CanRemoveFromTrustList {
    public String dontTrustA_BAD() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        return A.getString();
      } else {
        // Unreachable if-else branch
        return "Unreachable";
      }
    }
  }

  // Lousy attempt to add a class C to trust list
  // Should have a special issue suggesting to remove C from the list.
  @Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({A.class, C.class}))
  class CanNotAddToTrustList {
    public String stillDontTrustC_BAD() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        return C.getString();
      } else {
        // Unreachable if-else branch
        return "Unreachable";
      }
    }
  }
}

// Helper method to provide a dynamic condition
boolean getCondition() {
  return true; // Always returns true to keep the original code path active
}