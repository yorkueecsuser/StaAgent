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
    boolean condition = getCondition(); // Ensure the condition is dynamically determined
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable if statement.");
    }
    
    A a = supplier::get;
    B b = supplier::get;
    return "A.bar(): " + a.bar() + ", B.bar(): " + b.bar();
  }

  private boolean getCondition() {
    return false; // This method returns false, making the if block unreachable
  }

  public static void main(String[] args) {
    FunctionalInterfaceExample example = new FunctionalInterfaceExample();
    System.out.println(example.showBug(() -> "Original Value"));
  }
}