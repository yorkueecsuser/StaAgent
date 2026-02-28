class StringTest {
  void constant_Good() {
    String s = "hello";
    char c = s.charAt(4);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void constant_Bad() {
    String s = "hello";
    char c = s.charAt(5);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void constant_explicit_constructor_Good() {
    String s = new String("hello");
    char c = s.charAt(4);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void constant_explicit_constructor_Bad() {
    String s = new String("hello");
    char c = s.charAt(5);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void copy_constructor_Good() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(4);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void copy_constructor_Bad() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(5);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}