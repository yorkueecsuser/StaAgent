class Parent {
  static int field1 = 0;
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

class UnreachableIfElseMutant {
  static int mutatedField1;
  
  static {
    boolean condition = false;
    if (condition) {
      mutatedField1 = Child.method(); // Unreachable if-else branch
    } else {
      mutatedField1 = 0; // Original line of code
    }
  }
}