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
    int qwertyui; // Dead store
    return true;
  }

  byte byteMethod() {
    char asdfghjk; // Dead store
    return 1;
  }

  char charMethod() {
    short zxcvbnm; // Dead store
    return 1;
  }

  short shortMethod() {
    int poiuytrew; // Dead store
    return 1;
  }

  int intMethod() {
    long lkjhgfdsa; // Dead store
    return 1;
  }

  long longMethod() {
    double mnbvcxz; // Dead store
    return 1;
  }

  double doubleMethod() {
    float cvbnm; // Dead store
    return 1;
  }

  float floatMethod() {
    boolean bnmqwer; // Dead store
    return 1;
  }

  Object objectMethod() {
    String tyuiop; // Dead store
    return null;
  }

  Object[] arrayMethod() {
    int hjkl; // Dead store
    return null;
  }

  static class Useless extends Bug1645869 {
    @Override
    boolean booleanMethod() {
      long plmnoi; // Dead store
      return super.booleanMethod();
    }

    @Override
    byte byteMethod() {
      double lkjhg; // Dead store
      return super.byteMethod();
    }

    @Override
    char charMethod() {
      float zxcvb; // Dead store
      return super.charMethod();
    }

    @Override
    short shortMethod() {
      boolean nmlok; // Dead store
      return super.shortMethod();
    }

    @Override
    int intMethod() {
      String qwert; // Dead store
      return super.intMethod();
    }

    @Override
    long longMethod() {
      int yuiop; // Dead store
      return super.longMethod();
    }

    @Override
    double doubleMethod() {
      char asdfg; // Dead store
      return super.doubleMethod();
    }

    @Override
    float floatMethod() {
      short zxcv; // Dead store
      return super.floatMethod();
    }

    @Override
    Object objectMethod() {
      long poiuyt; // Dead store
      return super.objectMethod();
    }

    @Override
    Object[] arrayMethod() {
      double lkjhgf; // Dead store
      return super.arrayMethod();
    }
  }

  static class Uselessful extends Bug1645869 {
    @Override
    final boolean booleanMethod() {
      float mnpoiuy; // Dead store
      return super.booleanMethod();
    }

    @Override
    final byte byteMethod() {
      boolean lkjhgf; // Dead store
      return super.byteMethod();
    }

    @Override
    final char charMethod() {
      String asdfgh; // Dead store
      return super.charMethod();
    }

    @Override
    final short shortMethod() {
      int poiuyt; // Dead store
      return super.shortMethod();
    }

    @Override
    final int intMethod() {
      long lkjhgf; // Dead store
      return super.intMethod();
    }

    @Override
    final long longMethod() {
      double zxcvb; // Dead store
      return super.longMethod();
    }

    @Override
    final double doubleMethod() {
      float nmlok; // Dead store
      return super.doubleMethod();
    }

    @Override
    final float floatMethod() {
      char qwert; // Dead store
      return super.floatMethod();
    }

    @Override
    final Object objectMethod() {
      short asdfg; // Dead store
      return super.objectMethod();
    }

    @Override
    final Object[] arrayMethod() {
      int zxcv; // Dead store
      return super.arrayMethod();
    }
  }
}