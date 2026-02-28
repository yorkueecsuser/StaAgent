import java.util.function.Supplier;

@FunctionalInterface
interface A {
  String bar();
}

@FunctionalInterface
interface B extends A {
  String qux();
  @Override
  default String bar() {
    return "Modified in B"; // BUG: FunctionalInterfaceMethodChanged
  }
}

class FunctionalInterfaceExample {

  public String showBug(Supplier<String> supplier) {
    A a = supplier::get;
    B b = supplier::get;
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
        break;
    }

    return "A.bar(): " + a.bar() + ", B.bar(): " + b.bar();
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }

  public static void main(String[] args) {
    FunctionalInterfaceExample example = new FunctionalInterfaceExample();
    System.out.println(example.showBug(() -> "Original Value"));
  }
}