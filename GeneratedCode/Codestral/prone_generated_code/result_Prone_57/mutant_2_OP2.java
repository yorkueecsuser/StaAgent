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
    B b = () -> "Original Qux";
    // The assignment statement is duplicated here
    B bDuplicate = () -> "Original Qux";
    // Casting lambda to A interface changes behavior
    A a = (A) b;
    // The duplicated assignment statement is used here
    A aDuplicate = (A) bDuplicate;
    return a.bar(); // This will return "Bar in A changed to Original Qux" which is unexpected behavior
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}