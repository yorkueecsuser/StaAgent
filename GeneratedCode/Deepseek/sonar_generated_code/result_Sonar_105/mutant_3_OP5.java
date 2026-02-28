class Parent {
  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  public static void main(String[] args) {
    System.out.println(Parent.field1); // will display "0" instead of "42"
  }

  public static void showBug() {
    System.out.println(Parent.field1); // will display "0" instead of "42"
  }
}

class Child extends Parent {
  static int method() {
    int unreachableSwitch = 0;
    switch (unreachableSwitch) { 
      case 0: // unreachable case, but it still compiles, hence it's mutated
        return 0;
      default: 
        return Parent.field2;
    }
  }
}