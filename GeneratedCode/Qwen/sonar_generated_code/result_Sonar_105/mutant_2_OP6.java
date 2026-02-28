class ClassInitializationBug {

  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  public static void main(String[] args) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is always false
    }
    System.out.println(ClassInitializationBug.field1); // will display "0" instead of "42"
  }

  public static int showBug() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is always false
    }
    return field1;
  }

  private static boolean getCondition() {
    return false; // This method returns false, making the loop condition always false
  }
}

class Child extends ClassInitializationBug {
  static int method() {
    return ClassInitializationBug.field2;
  }
}