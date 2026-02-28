class StringTest {
  void constant_Good() {
    String s = "hello";
    char c = s.charAt(4);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case is always executed
        break;
    }
  }

  void constant_Bad() {
    String s = "hello";
    char c = s.charAt(5);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case is always executed
        break;
    }
  }

  void constant_explicit_constructor_Good() {
    String s = new String("hello");
    char c = s.charAt(4);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case is always executed
        break;
    }
  }

  void constant_explicit_constructor_Bad() {
    String s = new String("hello");
    char c = s.charAt(5);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case is always executed
        break;
    }
  }

  void copy_constructor_Good() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(4);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case is always executed
        break;
    }
  }

  void copy_constructor_Bad() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(5);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case is always executed
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}