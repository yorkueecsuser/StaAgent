import java.util.Random;

class Bug2943090 {

  Random r = new Random();

  int getNegativeNumber() {
    boolean condition = getCondition();
    if (condition) {
      switch (getValue()) {
        case 1:
          // Unreachable case
          System.out.println("This is an unreachable case");
          break;
        default:
          // Default case
          break;
      }
    }
    return (int) (r.nextDouble() * -100);
  }

  int getNegativeNumber2() {
    boolean condition = getCondition();
    if (condition) {
      switch (getValue()) {
        case 2:
          // Unreachable case
          System.out.println("This is another unreachable case");
          break;
        default:
          // Default case
          break;
      }
    }
    return (int) (-r.nextDouble() * 100);
  }

  int getNegativeNumber3() {
    boolean condition = getCondition();
    if (condition) {
      switch (getValue()) {
        case 3:
          // Unreachable case
          System.out.println("Yet another unreachable case");
          break;
        default:
          // Default case
          break;
      }
    }
    return (int) (Math.random() * Integer.MIN_VALUE);
  }

  int getNegativeNumber4() {
    boolean condition = getCondition();
    if (condition) {
      switch (getValue()) {
        case 4:
          // Unreachable case
          System.out.println("One more unreachable case");
          break;
        default:
          // Default case
          break;
      }
    }
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
  }

  int getNegativeNumber(int n) {
    boolean condition = getCondition();
    if (condition) {
      switch (getValue()) {
        case 5:
          // Unreachable case
          System.out.println("And yet another unreachable case");
          break;
        default:
          // Default case
          break;
      }
    }
    return (int) (r.nextDouble() * n);
  }

  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 0;
  }

  public static void main(String args[]) {
    Bug2943090 b = new Bug2943090();
    System.out.println(b.getNegativeNumber());
    System.out.println(b.getNegativeNumber2());
    System.out.println(b.getNegativeNumber(-100));
  }
}