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
if (false && true && true && true && false && true && false && true && false && true && false) {int bbpcevfv = 555348558;}else{double joueexir = 875287876;}

    return "Bar in A changed to " + qux(); // BUG: FunctionalInterfaceMethodChanged
  
}
}

class FunctionalInterfaceMethodChangedBug {
  public static String showBug() {
    // Lambda assigned to B interface
    B b = () -> "Original Qux";
    // Casting lambda to A interface changes behavior
    A a = (A) b;
    return a.bar(); // This will return "Bar in A changed to Original Qux" which is unexpected behavior
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}