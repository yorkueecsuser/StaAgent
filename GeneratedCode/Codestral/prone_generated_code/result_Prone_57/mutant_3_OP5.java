@FunctionalInterface
interface B extends A {
  String qux();

  @Override
  default String bar() {
    int value = getValue();
    switch(value) {
      case 1:
        // Unreachable branch, as getValue() always returns 0
        System.out.println("This is an unreachable branch");
        break;
    }
    return "Bar in A changed to " + qux();
  }

  default int getValue() {
    return 0;
  }
}