class Parent {
  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;
  static boolean condition = getCondition();

  public static void main(String[] args) {
    System.out.println(Parent.field1); // will display "42"
    if (condition) {
      System.out.println(Parent.field1); // will display "42"
    }
  }

  public static void showBug() {
    System.out.println(Parent.field1); // will display "42"
    if (condition) {
      System.out.println(Parent.field1); // will display "42"
    }
  }

  public static boolean getCondition() {
    return true;
  }
}

class Child extends Parent {
  static int method() {
    return Parent.field2;
  }
}