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
    return 1;
  }

  char charMethod() {
    return 1;
  }

  short shortMethod() {
    return 1;
  }

  int intMethod() {
    return 1;
  }

  long longMethod() {
    return 1;
  }

  double doubleMethod() {
    return 1;
  }

  float floatMethod() {
    return 1;
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

  // Mutated code
  static class Uselesss extends Bug1645869 {
    @Override
    boolean booleanMethod() {
      boolean a = super.booleanMethod();
      return a;
    }

    @Override
    byte byteMethod() {
      byte b = super.byteMethod();
      return b;
    }

    @Override
    char charMethod() {
      char c = super.charMethod();
      return c;
    }

    @Override
    short shortMethod() {
      short d = super.shortMethod();
      return d;
    }

    @Override
    int intMethod() {
      int e = super.intMethod();
      return e;
    }

    @Override
    long longMethod() {
      long f = super.longMethod();
      return f;
    }

    @Override
    double doubleMethod() {
      double g = super.doubleMethod();
      return g;
    }

    @Override
    float floatMethod() {
      float h = super.floatMethod();
      return h;
    }

    @Override
    Object objectMethod() {
      Object i = super.objectMethod();
      return i;
    }

    @Override
    Object[] arrayMethod() {
      Object[] j = super.arrayMethod();
      return j;
    }
  }

  static class Uselessfull extends Bug1645869 {
    @Override
    final boolean booleanMethod() {
      boolean k = super.booleanMethod();
      return k;
    }

    @Override
    final byte byteMethod() {
      byte l = super.byteMethod();
      return l;
    }

    @Override
    final char charMethod() {
      char m = super.charMethod();
      return m;
    }

    @Override
    final short shortMethod() {
      short n = super.shortMethod();
      return n;
    }

    @Override
    final int intMethod() {
      int o = super.intMethod();
      return o;
    }

    @Override
    final long longMethod() {
      long p = super.longMethod();
      return p;
    }

    @Override
    final double doubleMethod() {
      double q = super.doubleMethod();
      return q;
    }

    @Override
    final float floatMethod() {
      float r = super.floatMethod();
      return r;
    }

    @Override
    final Object objectMethod() {
      Object s = super.objectMethod();
      return s;
    }

    @Override
    final Object[] arrayMethod() {
      Object[] t = super.arrayMethod();
      return t;
    }
  }
}