class ClassInitializationBug {

  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  public static void main(String[] args) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    System.out.println(ClassInitializationBug.field1); // will display "0" instead of "42"
  }

  public static int showBug() {
    return field1;
  }

  private static boolean getCondition() {
    return false; // This method returns false, but the condition is dynamically determined at runtime
  }
}

class Child extends ClassInitializationBug {
  static int method() {
    return ClassInitializationBug.field2;
  }
}