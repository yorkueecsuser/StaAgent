@FunctionalInterface
interface A {
  String bar();
}

@FunctionalInterface
interface B extends A {
  String qux();

  @Override
  default String bar() {
    // Adding an unreachable for loop
    boolean condition = false;
    for (int i = 0; condition; i++) {
      System.out.println("Unreachable code");
    }
    return "Bar in A changed to " + qux();
  }
}

class FunctionalInterfaceMethodChangedBug {
  public static String showBug() {
    B b = () -> "Original Qux";
    A a = (A) b;
    return a.bar();
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}