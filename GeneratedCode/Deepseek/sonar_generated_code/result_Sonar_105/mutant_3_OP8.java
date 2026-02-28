class Parent {
  static int a = Child.b();           // Mutation: Variable renaming
  static int c = 42;                   // Mutation: Variable renaming

  public static void main(String[] args) {
    System.out.println(Parent.a);      // Mutation: Variable renaming
  }

  public static void showBug() {
    System.out.println(Parent.a);      // Mutation: Variable renaming
  }
}

class Child extends Parent {
  static int b() {
    return Parent.c;                   // Mutation: Variable renaming
  }
}