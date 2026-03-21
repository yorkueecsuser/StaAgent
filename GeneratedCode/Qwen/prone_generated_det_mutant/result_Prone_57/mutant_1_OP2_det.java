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
public String showBug(Supplier < String > supplier){
    A a = supplier :: get;
    B b = supplier :: get;
    b = supplier :: get;
    return "A.bar(): " + a.bar() + ", B.bar(): " + b.bar();
}

  public static void main(String[] args) {
    FunctionalInterfaceExample example = new FunctionalInterfaceExample();
    System.out.println(example.showBug(() -> "Original Value"));
  }
}