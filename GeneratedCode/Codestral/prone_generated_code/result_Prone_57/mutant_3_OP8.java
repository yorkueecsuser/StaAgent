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
    return "Bar in A changed to " + qux(); // BUG: FunctionalInterfaceMethodChanged
  }
}

class FunctionalInterfaceMethodChangedBug {
  public static String showBug() {
    // Lambda assigned to B interface
    B r = () -> "Original Qux";
    // Casting lambda to A interface changes behavior
    A a = (A) r;
    return a.bar(); // This will return "Bar in A changed to Original Qux" which is unexpected behavior
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}