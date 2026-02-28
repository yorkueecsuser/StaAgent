class Parent {
  static int field1 = Child.method(); // Original code
  static int field1 = Child.method(); // Mutated code
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
    return Parent.field2;
  }
}