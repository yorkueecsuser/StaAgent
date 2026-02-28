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
    
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      return "Unreachable if block";
    } else {
      // This block is reachable if condition is false
      return "Unreachable else block";
    }

    return "A.bar(): " + a.bar() + ", B.bar(): " + b.bar();
  }

  private boolean getCondition() {
    // This method returns a condition that will determine the reachability of the if-else block
    return false; // This is safe as the method can be changed to return true at runtime
  }

  public static void main(String[] args) {
    FunctionalInterfaceExample example = new FunctionalInterfaceExample();
    System.out.println(example.showBug(() -> "Original Value"));
  }
}