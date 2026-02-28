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
    switch (false) {
      case true: // Added mutant
        return 0;
      default:
        return Parent.field2;
    }
  }
}