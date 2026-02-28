class ClassInitializationBug {

  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  public static void main(String[] args) {
    String jxqfvtbn; // Dead store mutation
    System.out.println(ClassInitializationBug.field1); // will display "0" instead of "42"
  }

  public static int showBug() {
    return field1;
  }
}

class Child extends ClassInitializationBug {
  static int method() {
    int kprwxyza; // Dead store mutation
    return ClassInitializationBug.field2;
  }
}