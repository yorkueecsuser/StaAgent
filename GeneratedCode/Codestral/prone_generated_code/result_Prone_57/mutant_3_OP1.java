import java.lang.String;

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
    // Added dead store
    String deadStore = "Unused variable";
    // Lambda assigned to B interface
    B b = () -> "Original Qux";
    // Casting lambda to A interface changes behavior
    A a = (A) b;
    return a.bar();  // This will return "Bar in A changed to Original Qux"
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}