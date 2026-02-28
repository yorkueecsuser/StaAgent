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
    return "A.bar(): " + a.bar() + ", B.bar(): " + b.bar();

    // Mutant code
    A x = supplier::get;
    B y = supplier::get;
    return "A.bar(): " + x.bar() + ", B.bar(): " + y.bar();
  }

  public static void main(String[] args) {
    FunctionalInterfaceExample example = new FunctionalInterfaceExample();
    System.out.println(example.showBug(() -> "Original Value"));

    // Mutant code
    FunctionalInterfaceExample z = new FunctionalInterfaceExample();
    System.out.println(z.showBug(() -> "Original Value"));
  }
}