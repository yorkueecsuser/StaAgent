class NullDeref2 {
  public void detectedNullPointerInExceptionPath() {
    Object thisIsNull = null;
    if (thisIsNull == null) {
      try {
        System.out.println("hello");
        thisIsNull = "notnull";
      } catch (RuntimeException ex) {
        // Should generate a low warning here
        System.out.println(thisIsNull.getClass());
      }
    }
    // Mutant code
    Object a = null;
    if (a == null) {
      try {
        System.out.println("hello");
        a = "notnull";
      } catch (RuntimeException ex) {
        System.out.println(a.getClass());
      }
    }
  }

  public void possibleNullPointerInExceptionPath() {
    Object thisIsNull = null;
    if (thisIsNull == null) {
      try {
        System.out.println("hello");
        thisIsNull = "notnull";
      } catch (RuntimeException ex) {
      }
      // Should generate a low warning here
      System.out.println(thisIsNull.getClass());
    }
    // Mutant code
    Object b = null;
    if (b == null) {
      try {
        System.out.println("hello");
        b = "notnull";
      } catch (RuntimeException ex) {
      }
      System.out.println(b.getClass());
    }
  }

  public void possibleNullPointerInNormalPath() {
    Object thisIsNull = null;
    if (thisIsNull == null) {
      try {
        System.out.println("hello");
      } catch (RuntimeException ex) {
        thisIsNull = "notnull";
      }
      // Should generate a medium warning here
      System.out.println(thisIsNull.getClass());
    }
    // Mutant code
    Object c = null;
    if (c == null) {
      try {
        System.out.println("hello");
      } catch (RuntimeException ex) {
        c = "notnull";
      }
      System.out.println(c.getClass());
    }
  }
}