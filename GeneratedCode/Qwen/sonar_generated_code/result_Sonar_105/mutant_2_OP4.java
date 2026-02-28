class ClassInitializationBug {

  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  public static void main(String[] args) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never run because condition is always false
      System.out.println("This will never be printed");
    } else {
      // Alternative code that will always run
      System.out.println(ClassInitializationBug.field1); // will display "0" instead of "42"
    }
  }

  public static int showBug() {
    return field1;
  }

  private static boolean getCondition() {
    return false; // This method returns false, but it's not a compile-time constant
  }
}

class Child extends ClassInitializationBug {
  static int method() {
    return ClassInitializationBug.field2;
  }
}