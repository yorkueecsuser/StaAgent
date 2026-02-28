class Bug1645869 {

  /*
   * Here's the comment from SourceForge.net The found bug
   * "Method superfluously delegates to parent class method" reports a method
   * that only calls the super class version of the same method. In doing so
   * it makes no distinction between a normal method and a final method. A
   * final method could be a way to impose the default behavior inherited from
   * super class. Michele.
   *
   * The bug found is a low priority and FindBugs makes the distinction now. -
   * Kristin
   */

  boolean booleanMethod() {
    return true;
  }

  byte byteMethod() {
    byte b = 1;
    byte b2 = b; // Added mutant
    return b;
  }

  char charMethod() {
    char c = 1;
    char c2 = c; // Added mutant
    return c;
  }

  short shortMethod() {
    short s = 1;
    short s2 = s; // Added mutant
    return s;
  }

  int intMethod() {
    int i = 1;
    int i2 = i; // Added mutant
    return i;
  }

  long longMethod() {
    long l = 1;
    long l2 = l; // Added mutant
    return l;
  }

  double doubleMethod() {
    double d = 1;
    double d2 = d; // Added mutant
    return d;
  }

  float floatMethod() {
    float f = 1;
    float f2 = f; // Added mutant
    return f;
  }

  Object objectMethod() {
    return null;
  }

  Object[] arrayMethod() {
    return null;
  }

  static class Useless extends Bug1645869 {
    @Override
    boolean booleanMethod() {
      return super.booleanMethod();
    }

    @Override
    byte byteMethod() {
      return super.byteMethod();
    }

    @Override
    char charMethod() {
      return super.charMethod();
    }

    @Override
    short shortMethod() {
      return super.shortMethod();
    }

    @Override
    int intMethod() {
      return super.intMethod();
    }

    @Override
    long longMethod() {
      return super.longMethod();
    }

    @Override
    double doubleMethod() {
      return super.doubleMethod();
    }

    @Override
    float floatMethod() {
      return super.floatMethod();
    }

    @Override
    Object objectMethod() {
      return super.objectMethod();
    }

    @Override
    Object[] arrayMethod() {
      return super.arrayMethod();
    }
  }

  static class Uselessful extends Bug1645869 {
    @Override
    final boolean booleanMethod() {
      return super.booleanMethod();
    }

    @Override
    final byte byteMethod() {
      return super.byteMethod();
    }

    @Override
    final char charMethod() {
      return super.charMethod();
    }

    @Override
    final short shortMethod() {
      return super.shortMethod();
    }

    @Override
    final int intMethod() {
      return super.intMethod();
    }

    @Override
    final long longMethod() {
      return super.longMethod();
    }

    @Override
    final double doubleMethod() {
      return super.doubleMethod();
    }

    @Override
    final float floatMethod() {
      return super.floatMethod();
    }

    @Override
    final Object objectMethod() {
      return super.objectMethod();
    }

    @Override
    final Object[] arrayMethod() {
      return super.arrayMethod();
    }
  }
}