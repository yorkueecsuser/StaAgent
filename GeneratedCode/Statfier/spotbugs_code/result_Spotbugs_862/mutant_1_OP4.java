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
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return false;
      } else {
        return super.booleanMethod();
      }
    }

    @Override
    byte byteMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return 0;
      } else {
        return super.byteMethod();
      }
    }

    @Override
    char charMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return '0';
      } else {
        return super.charMethod();
      }
    }

    @Override
    short shortMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return 0;
      } else {
        return super.shortMethod();
      }
    }

    @Override
    int intMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return 0;
      } else {
        return super.intMethod();
      }
    }

    @Override
    long longMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return 0L;
      } else {
        return super.longMethod();
      }
    }

    @Override
    double doubleMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return 0.0;
      } else {
        return super.doubleMethod();
      }
    }

    @Override
    float floatMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return 0.0f;
      } else {
        return super.floatMethod();
      }
    }

    @Override
    Object objectMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return new Object();
      } else {
        return super.objectMethod();
      }
    }

    @Override
    Object[] arrayMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return new Object[0];
      } else {
        return super.arrayMethod();
      }
    }
  }

  static class Uselessful extends Bug1645869 {
    @Override
    final boolean booleanMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return false;
      } else {
        return super.booleanMethod();
      }
    }

    @Override
    final byte byteMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return 0;
      } else {
        return super.byteMethod();
      }
    }

    @Override
    final char charMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return '0';
      } else {
        return super.charMethod();
      }
    }

    @Override
    final short shortMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return 0;
      } else {
        return super.shortMethod();
      }
    }

    @Override
    final int intMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return 0;
      } else {
        return super.intMethod();
      }
    }

    @Override
    final long longMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return 0L;
      } else {
        return super.longMethod();
      }
    }

    @Override
    final double doubleMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return 0.0;
      } else {
        return super.doubleMethod();
      }
    }

    @Override
    final float floatMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return 0.0f;
      } else {
        return super.floatMethod();
      }
    }

    @Override
    final Object objectMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return new Object();
      } else {
        return super.objectMethod();
      }
    }

    @Override
    final Object[] arrayMethod() {
      boolean shouldRun = false; // This will always be false, making the if-else branch unreachable
      if (shouldRun) {
        return new Object[0];
      } else {
        return super.arrayMethod();
      }
    }
  }
}