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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }

    A a = supplier::get;
    B b = supplier::get;
    return "A.bar(): " + a.bar() + ", B.bar(): " + b.bar();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }

  public static void main(String[] args) {
    FunctionalInterfaceExample example = new FunctionalInterfaceExample();
    System.out.println(example.showBug(() -> "Original Value"));
  }
}