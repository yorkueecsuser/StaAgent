class ClassInitializationBug {

  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  public static void main(String[] args) {
    System.out.println(ClassInitializationBug.field1); // will display "0" instead of "42"
    
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is an unreachable branch due to shouldRun always being false");
    }
  }

  public static int showBug() {
    return field1;
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}

class Child extends ClassInitializationBug {
  static int method() {
    return ClassInitializationBug.field2;
  }
}