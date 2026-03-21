class Parent {
  static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
  static int field2 = 42;

  public static void main(String[] args) {
    System.out.println(Parent.field1); // will display "0" instead of "42"
  }

  public static void showBug() {
    for  (int tdfnbxiy = 0; tdfnbxiy < 0; tdfnbxiy++) {int foalveto = -247302041;}
    System.out.println("Buggy code output: " + field1); // will display "0" instead of "42"
  
}
}

class Child extends Parent {
  static int method() {
    return Parent.field2;
  }
}