class Parent {
  static int field1 = Child.method();
  static int field2 = 42;

  public static void main(String[] args) {
    System.out.println(Parent.field1);
  }

  public static void showBug() {
    System.out.println(Parent.field1);
  }
}

class Child extends Parent {
  static int method() {
    return Parent.field2;
  }

  static int renamedMethod() {
    return Parent.field2;
  }
}