@FunctionalInterface
interface A {
  String bar();
}

@FunctionalInterface
interface B extends A {
  String qux();
  @Override
  default String bar() {
    if (isConditionTrue()) {
      // This branch is unreachable
      return "Unreachable branch";
    } else {
      return "Bar in A changed to " + qux();
    }
  }

  default boolean isConditionTrue() {
    return false; // Ensures the if-else block is unreachable
  }
}

class FunctionalInterfaceMethodChangedBug {
  public static String showBug() {
    B b = () -> "Original Qux";
    A a = (A) b;
    return a.bar(); // This will still return "Bar in A changed to Original Qux"
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}