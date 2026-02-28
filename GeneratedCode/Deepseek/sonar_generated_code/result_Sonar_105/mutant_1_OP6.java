class Parent {
  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;
  static boolean unreachableLoopCondition = false;

  public static void main(String[] args) {
    System.out.println(Parent.field1); // will display "0" instead of "42"
    for (int i = 0; unreachableLoopCondition; i++) {
      // unreachable code
    }
  }

  public static void showBug() {
    System.out.println(Parent.field1); // will display "0" instead of "42"
    for (int i = 0; unreachableLoopCondition; i++) {
      // unreachable code
    }
  }
}

class Child extends Parent {
  static int method() {
    return Parent.field2;
  }
}