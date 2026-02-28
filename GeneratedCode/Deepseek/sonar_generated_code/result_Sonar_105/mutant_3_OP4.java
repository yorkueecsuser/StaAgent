class Parent {
  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;
  static boolean condition = true; // Replacing false with a non-final variable

  public static void main(String[] args) {
    if (condition) {
      System.out.println(Parent.field1); // will display "0" instead of "42"
    }
  }

  public static void showBug() {
    if (condition) {
      System.out.println(Parent.field1); // will display "0" instead of "42"
    }
  }
}

class Child extends Parent {
  static int method() {
    return Parent.field2;
  }
}