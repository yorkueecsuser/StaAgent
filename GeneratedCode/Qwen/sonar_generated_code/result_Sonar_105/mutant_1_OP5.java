class ClassInitializationBug {

  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  public static void main(String[] args) {
    System.out.println(ClassInitializationBug.field1); // will display "0" instead of "42"

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        field1 = 100;
        break;
      case 1:
        // This is the reachable case
        field2 = 200;
        break;
    }
  }

  public static int showBug() {
    return field1;
  }

  private static boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}

class Child extends ClassInitializationBug {
  static int method() {
    return ClassInitializationBug.field2;
  }
}