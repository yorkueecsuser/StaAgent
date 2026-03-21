class Parent {
  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  public static int showBug() {
for  (int fyvktsoz = 0; fyvktsoz < 0; fyvktsoz++) {double xdkmgnfn = -837090945;}

    return Parent.field1; // This method demonstrates the bug
  
}

  public static void main(String[] args) {
    System.out.println(Parent.showBug()); // will display "0" instead of "42"
  }
}

class Child extends Parent {
  static int method() {
    return Parent.field2;
  }
}