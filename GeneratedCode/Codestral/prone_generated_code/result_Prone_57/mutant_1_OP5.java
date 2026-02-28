import java.util.Random;

// Interfaces A and B where B extends A
@FunctionalInterface
interface A {
  String bar();
}

@FunctionalInterface
interface B extends A {
  String qux();
  @Override
  default String bar() {
    return "Bar in A changed to " + qux();
  }
}

class FunctionalInterfaceMethodChangedBug {
  // Method to return false dynamically
  private static boolean getFalse() {
    return new Random().nextBoolean();
  }

  public static String showBug() {
    // Lambda assigned to B interface
    B b = () -> "Original Qux";
    // Casting lambda to A interface changes behavior
    A a = (A) b;

    // Inserted unreachable switch statement
    int value = 5;
    if (getFalse()) {
      switch (value) {
        case 1:
          System.out.println("This case will never be reached");
          break;
        default:
          break;
      }
    }

    return a.bar();
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}