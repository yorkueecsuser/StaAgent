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
for  (int bipbzcpk = 0; bipbzcpk < 0; bipbzcpk++) {double tehrgnue = -448025548;}

    return "Modified in B"; // BUG: FunctionalInterfaceMethodChanged
  
}
}

class FunctionalInterfaceExample {

  public String showBug(Supplier<String> supplier) {
    A a = supplier::get;
    B b = supplier::get;
    return "A.bar(): " + a.bar() + ", B.bar(): " + b.bar();
  }

  public static void main(String[] args) {
    FunctionalInterfaceExample example = new FunctionalInterfaceExample();
    System.out.println(example.showBug(() -> "Original Value"));
  }
}