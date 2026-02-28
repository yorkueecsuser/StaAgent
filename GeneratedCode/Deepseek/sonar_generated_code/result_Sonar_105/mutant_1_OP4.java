class Parent {
  static int field1 = Child.method(); 
  static int field2 = 42;
  static boolean condition = getCondition();

  public static void main(String[] args) {
    System.out.println(Parent.field1);
    if(!condition) { // Unreachable if-else statement mutation
      System.out.println("This statement is unreachable");
    }
  }

  public static void showBug() {
    System.out.println(Parent.field1);
    if(!condition) { // Unreachable if-else statement mutation
      System.out.println("This statement is unreachable");
    }
  }

  public static boolean getCondition() {
    return false;
  }
}

class Child extends Parent {
  static int method() {
    return Parent.field2;
  }
}