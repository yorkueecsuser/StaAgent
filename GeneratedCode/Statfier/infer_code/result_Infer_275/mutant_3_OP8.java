import codetoanalyze.java.annotation.Nullsafe;

/** Test to ensure we correctly evaluate mode for nested classes */
@Nullsafe(Nullsafe.Mode.LOCAL)
class NullsafeLocal {

  public String shouldBeNullsafeModeError() {
    return null;
  }

  // Mode should be inherited from the parent class
  class Nested {
    public String shouldBeNullsafeModeError() {
      return null;
    }

    // Mode propagation should be transitive
    class DeeplyNested {
      public String shouldBeNullsafeModeError() {
        return null;
      }
    }

    // This is Local, but not Strict mode
    public String returningDefaultNotNullIsOK() {
      return Default.getString();
    }

    // Mutant: Renaming variable 'x' to 'y'
    public String mutantMethod() {
      int y = 10;
      return String.valueOf(y);
    }
  }

  // It is OK to make nested classes more strict
  @Nullsafe(Nullsafe.Mode.STRICT)
  class NestedStrict {
    public String returningDefaultNotNullIsError() {
      return Default.getString();
    }

    // Mutant: Renaming variable 'a' to 'b'
    public String mutantMethod() {
      int b = 20;
      return String.valueOf(b);
    }
  }

  // No need to repeat the mode - it is redundant
  @Nullsafe(Nullsafe.Mode.LOCAL)
  class NestedExplicitLocal {
    public String shouldBeNullsafeModeError() {
      return null;
    }

    // Mutant: Renaming variable 'c' to 'd'
    public String mutantMethod() {
      int d = 30;
      return String.valueOf(d);
    }
  }
}

@Nullsafe(Nullsafe.Mode.STRICT)
class NullsafeStrict {
  public String returningDefaultNotNullIsError() {
    return Default.getString();
  }

  // STRICT mode is propagated to the nested class
  class Nested {
    public String returningDefaultNotNullIsError() {
      return Default.getString();
    }

    // Impossible to downgrade the level of nested class, even if the nested mode
    // is implicit
    @Nullsafe(Nullsafe.Mode.LOCAL)
    class DeeplyNestedLocalIsStillStrict {
      public String returningDefaultNotNullIsError() {
        return Default.getString();
      }

      // Mutant: Renaming variable 'e' to 'f'
      public String mutantMethod() {
        int f = 40;
        return String.valueOf(f);
      }
    }
  }

  // Impossible to downgrade the level of nested class
  @Nullsafe(Nullsafe.Mode.LOCAL)
  class NestedLocalIsStillStrict {
    public String returningDefaultNotNullIsError() {
      return Default.getString();
    }

    // Mutant: Renaming variable 'g' to 'h'
    public String mutantMethod() {
      int h = 50;
      return String.valueOf(h);
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
      return null;
    }

    // This is Local, but not Strict mode
    public String returningDefaultNotNullIsOK() {
      return Default.getString();
    }

    // And we can increase strictness even more
    @Nullsafe(Nullsafe.Mode.STRICT)
    class DeeplyNestedStrict {
      public String returningDefaultNotNullIsError() {
        return Default.getString();
      }

      // Mutant: Renaming variable 'i' to 'j'
      public String mutantMethod() {
        int j = 60;
        return String.valueOf(j);
      }
    }
  }

  // Mutant: Renaming variable 'k' to 'l'
  public String mutantMethod() {
    int l = 70;
    return String.valueOf(l);
  }
}

class A {
  public static String getString() {
    return "";
  }

  // Mutant: Renaming variable'm' to 'n'
  public String mutantMethod() {
    int n = 80;
    return String.valueOf(n);
  }
}

class B {}

class C {
  public static String getString() {
    return "";
  }

  // Mutant: Renaming variable 'o' to 'p'
  public String mutantMethod() {
    int p = 90;
    return String.valueOf(p);
  }
}

@Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({A.class, B.class}))
class TrustSome {

  public String trustA_OK() {
    return A.getString();
  }

  public String dontTrustC_Bad() {
    return C.getString();
  }

  // Inherits mode from the outer, the same trust
  class NotAnnotatedNested {
    public String trustA_OK() {
      return A.getString();
    }

    public String dontTrustC_Bad() {
      return C.getString();
    }

    // Mutant: Renaming variable 'q' to 'r'
    public String mutantMethod() {
      int r = 100;
      return String.valueOf(r);
    }
  }

  // This class does not trust A anymore
  @Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({B.class}))
  class CanRemoveFromTrustList {
    public String dontTrustA_BAD() {
      return A.getString();
    }

    // Mutant: Renaming variable's' to 't'
    public String mutantMethod() {
      int t = 110;
      return String.valueOf(t);
    }
  }

  // Lousy attempt to add a class C to trust list
  // Should have a special issue suggesting to remove C from the list.
  @Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({A.class, C.class}))
  class CanNotAddToTrustList {
    public String stillDontTrustC_BAD() {
      return C.getString();
    }

    // Mutant: Renaming variable 'u' to 'v'
    public String mutantMethod() {
      int v = 120;
      return String.valueOf(v);
    }
  }
}