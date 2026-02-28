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
    boolean condition = getCondition(); // Dynamically determined condition
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is a reachable block.");
    }
    // Inserting an unreachable if branch
    boolean unreachableCondition = getUnreachableCondition(); // Always returns false
    if (unreachableCondition) {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }

    A a = supplier::get;
    B b = supplier::get;
    return "A.bar(): " + a.bar() + ", B.bar(): " + b.bar();
  }

  private boolean getCondition() {
    // Return true or false based on some logic
    return true;
  }

  private boolean getUnreachableCondition() {
    // Always return false to make the if block unreachable
    return false;
  }

  public static void main(String[] args) {
    FunctionalInterfaceExample example = new FunctionalInterfaceExample();
    System.out.println(example.showBug(() -> "Original Value"));
  }
}