class Parent {
  static int field1 = Child.method(); // Mutated: Adding an unreachable for loop
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

// Inserting an unreachable for loop into a randomly selected basic block
for (boolean conditionFor = false; conditionFor; ) {
  break; // unreachable statement
}