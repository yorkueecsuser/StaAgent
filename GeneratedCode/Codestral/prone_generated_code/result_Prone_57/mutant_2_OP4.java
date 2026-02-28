@FunctionalInterface
interface B extends A {
  String qux();

  @Override
  default String bar() {
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable block
      throw new RuntimeException("Unreachable code");
    } else {
      // Original code
      return "Bar in A changed to " + qux();
    }
  }
}