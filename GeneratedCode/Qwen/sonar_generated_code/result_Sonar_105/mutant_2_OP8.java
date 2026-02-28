class ClassInitializationBug {

  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  // Mutated variable
  static int a = Child.method();

  public static void main(String[] args) {
    System.out.println(ClassInitializationBug.field1); // will display "0" instead of "42"
    System.out.println(ClassInitializationBug.a); // Additional print to demonstrate the mutated variable
  }

  public static int showBug() {
    return field1;
  }

  // Mutated method using the new variable
  public static int showMutatedBug() {
    return a;
  }
}

class Child extends ClassInitializationBug {
  static int method() {
    return ClassInitializationBug.field2;
  }
}