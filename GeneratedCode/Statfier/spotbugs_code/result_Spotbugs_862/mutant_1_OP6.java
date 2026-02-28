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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.booleanMethod();
    }

    @Override
    byte byteMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.byteMethod();
    }

    @Override
    char charMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.charMethod();
    }

    @Override
    short shortMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.shortMethod();
    }

    @Override
    int intMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.intMethod();
    }

    @Override
    long longMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.longMethod();
    }

    @Override
    double doubleMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.doubleMethod();
    }

    @Override
    float floatMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.floatMethod();
    }

    @Override
    Object objectMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.objectMethod();
    }

    @Override
    Object[] arrayMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.arrayMethod();
    }
  }

  static class Uselessful extends Bug1645869 {
    @Override
    final boolean booleanMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.booleanMethod();
    }

    @Override
    final byte byteMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.byteMethod();
    }

    @Override
    final char charMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.charMethod();
    }

    @Override
    final short shortMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.shortMethod();
    }

    @Override
    final int intMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.intMethod();
    }

    @Override
    final long longMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.longMethod();
    }

    @Override
    final double doubleMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.doubleMethod();
    }

    @Override
    final float floatMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.floatMethod();
    }

    @Override
    final Object objectMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.objectMethod();
    }

    @Override
    final Object[] arrayMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return super.arrayMethod();
    }
  }

  private boolean getCondition() {
    return false;
  }
}