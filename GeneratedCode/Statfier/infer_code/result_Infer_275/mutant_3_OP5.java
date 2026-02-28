import codetoanalyze.java.annotation.Nullsafe;

/** Test to ensure we correctly evaluate mode for nested classes */
@Nullsafe(Nullsafe.Mode.LOCAL)
class NullsafeLocal {

  public String shouldBeNullsafeModeError() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This is just a placeholder to satisfy switch syntax
        break;
    }
    return null;
  }

  // Mode should be inherited from the parent class
  class Nested {
    public String shouldBeNullsafeModeError() {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This is just a placeholder to satisfy switch syntax
          break;
      }
      return null;
    }

    // Mode propagation should be transitive
    class DeeplyNested {
      public String shouldBeNullsafeModeError() {
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This is just a placeholder to satisfy switch syntax
            break;
        }
        return null;
      }
    }

    // This is Local, but not Strict mode
    public String returningDefaultNotNullIsOK() {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This is just a placeholder to satisfy switch syntax
          break;
      }
      return Default.getString();
    }
  }

  // It is OK to make nested classes more strict
  @Nullsafe(Nullsafe.Mode.STRICT)
  class NestedStrict {
    public String returningDefaultNotNullIsError() {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This is just a placeholder to satisfy switch syntax
          break;
      }
      return Default.getString();
    }
  }

  // No need to repeat the mode - it is redundant
  @Nullsafe(Nullsafe.Mode.LOCAL)
  class NestedExplicitLocal {
    public String shouldBeNullsafeModeError() {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This is just a placeholder to satisfy switch syntax
          break;
      }
      return null;
    }
  }
}

@Nullsafe(Nullsafe.Mode.STRICT)
class NullsafeStrict {
  public String returningDefaultNotNullIsError() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This is just a placeholder to satisfy switch syntax
        break;
    }
    return Default.getString();
  }

  // STRICT mode is propagated to the nested class
  class Nested {
    public String returningDefaultNotNullIsError() {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This is just a placeholder to satisfy switch syntax
          break;
      }
      return Default.getString();
    }

    // Impossible to downgrade the level of nested class, even if the nested mode
    // is implicit
    @Nullsafe(Nullsafe.Mode.LOCAL)
    class DeeplyNestedLocalIsStillStrict {
      public String returningDefaultNotNullIsError() {
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This is just a placeholder to satisfy switch syntax
            break;
        }
        return Default.getString();
      }
    }
  }

  // Impossible to downgrade the level of nested class
  @Nullsafe(Nullsafe.Mode.LOCAL)
  class NestedLocalIsStillStrict {
    public String returningDefaultNotNullIsError() {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This is just a placeholder to satisfy switch syntax
          break;
      }
      return Default.getString();
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
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This is just a placeholder to satisfy switch syntax
          break;
      }
      return null;
    }

    // This is Local, but not Strict mode
    public String returningDefaultNotNullIsOK() {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This is just a placeholder to satisfy switch syntax
          break;
      }
      return Default.getString();
    }

    // And we can increase strictness even more
    @Nullsafe(Nullsafe.Mode.STRICT)
    class DeeplyNestedStrict {
      public String returningDefaultNotNullIsError() {
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This is just a placeholder to satisfy switch syntax
            break;
        }
        return Default.getString();
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
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This is just a placeholder to satisfy switch syntax
        break;
    }
    return A.getString();
  }

  public String dontTrustC_Bad() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This is just a placeholder to satisfy switch syntax
        break;
    }
    return C.getString();
  }

  // Inherits mode from the outer, the same trust
  class NotAnnotatedNested {
    public String trustA_OK() {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This is just a placeholder to satisfy switch syntax
          break;
      }
      return A.getString();
    }

    public String dontTrustC_Bad() {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This is just a placeholder to satisfy switch syntax
          break;
      }
      return C.getString();
    }
  }

  // This class does not trust A anymore
  @Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({B.class}))
  class CanRemoveFromTrustList {
    public String dontTrustA_BAD() {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This is just a placeholder to satisfy switch syntax
          break;
      }
      return A.getString();
    }
  }

  // Lousy attempt to add a class C to trust list
  // Should have a special issue suggesting to remove C from the list.
  @Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({A.class, C.class}))
  class CanNotAddToTrustList {
    public String stillDontTrustC_BAD() {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This is just a placeholder to satisfy switch syntax
          break;
      }
      return C.getString();
    }
  }
}

// Helper method to provide a dynamic condition
boolean getCondition() {
  return false;
}