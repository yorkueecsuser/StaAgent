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
boolean hvxirajh = false;while (hvxirajh && false && true && true && true && true && true && false && false && false && false && false) {short nxtumavw = -7017;}

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