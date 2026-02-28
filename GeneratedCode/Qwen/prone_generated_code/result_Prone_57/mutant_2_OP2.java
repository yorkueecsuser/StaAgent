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
    A aCopy = supplier::get; // Duplicate assignment
    B b = supplier::get;
    B bCopy = supplier::get; // Duplicate assignment
    return "A.bar(): " + a.bar() + ", B.bar(): " + b.bar();
  }

  public static void main(String[] args) {
    FunctionalInterfaceExample example = new FunctionalInterfaceExample();
    FunctionalInterfaceExample exampleCopy = new FunctionalInterfaceExample(); // Duplicate assignment
    System.out.println(example.showBug(() -> "Original Value"));
  }
}