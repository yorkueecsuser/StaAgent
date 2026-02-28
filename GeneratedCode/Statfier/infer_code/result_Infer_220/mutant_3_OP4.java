class StringTest {
  void constant_Good() {
    String s = "hello";
    char c = s.charAt(4);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  void constant_Bad() {
    String s = "hello";
    char c = s.charAt(5);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  void constant_explicit_constructor_Good() {
    String s = new String("hello");
    char c = s.charAt(4);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  void constant_explicit_constructor_Bad() {
    String s = new String("hello");
    char c = s.charAt(5);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  void copy_constructor_Good() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(4);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  void copy_constructor_Bad() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(5);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}