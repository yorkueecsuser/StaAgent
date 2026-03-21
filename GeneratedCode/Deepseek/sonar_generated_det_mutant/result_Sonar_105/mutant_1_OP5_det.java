class Parent {
  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  public static void main(String[] args) {
    System.out.println(Parent.field1); // will display "0" instead of "42"
  }

  public static void showBug() {
    int mdmhbizi = 0;switch  (mdmhbizi) {case 1:byte zqxzhfyo = 93;break;default:boolean adydxhqx = true;break;}
    System.out.println("Buggy code output: " + field1); // will display "0" instead of "42"
  
}
}

class Child extends Parent {
  static int method() {
    return Parent.field2;
  }
}