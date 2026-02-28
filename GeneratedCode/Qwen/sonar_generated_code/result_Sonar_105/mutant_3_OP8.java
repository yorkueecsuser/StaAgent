class ClassInitializationBug {

  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  public static void main(String[] args) {
    System.out.println(ClassInitializationBug.field1); // will display "0" instead of "42"
    System.out.println(ClassInitializationBug.a); // will also display "0" instead of "42" due to mutation
  }

  public static int showBug() {
    return field1;
  }

  // Mutated variable
  static int a = Child.method();
}

class Child extends ClassInitializationBug {
  static int method() {
    return ClassInitializationBug.field2;
  }
}