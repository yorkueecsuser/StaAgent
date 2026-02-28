// Interfaces A and B where B extends A
@FunctionalInterface
interface A {
  String bar();
}

@FunctionalInterface
interface B extends A {
  String qux();
  @Override
  default String bar() {
    return "Bar in A changed to " + qux();
  }
}

class FunctionalInterfaceMethodChangedBug {
  public static String showBug() {
    // Lambda assigned to B interface
    B b = () -> "Original Qux";
    // Duplicating the assignment statement
    B bDuplicate = () -> "Duplicate Qux"; // Mutant code
    // Casting lambda to A interface changes behavior
    A a = (A) b;
    return a.bar(); // This will return "Bar in A changed to Original Qux"
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}