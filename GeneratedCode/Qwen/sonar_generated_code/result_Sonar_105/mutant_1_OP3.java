class ClassInitializationBug {

  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  public static void main(String[] args) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    System.out.println(ClassInitializationBug.field1); // will display "0" instead of "42"
  }

  public static int showBug() {
    return field1;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is not a compile-time constant
  }
}

class Child extends ClassInitializationBug {
  static int method() {
    return ClassInitializationBug.field2;
  }
}