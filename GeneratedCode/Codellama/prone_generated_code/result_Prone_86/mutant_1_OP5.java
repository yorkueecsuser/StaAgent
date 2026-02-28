import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"

    // Unreachable switch statement mutant
    switch (getCondition()) {
      case 0:
        System.out.println("Unreachable code");
        break;
      default:
        System.out.println("Reachable code");
        break;
    }
  }

  // Method to provide dynamic condition for switch expression
  private static int getCondition() {
    return new Random().nextInt(2);
  }
}