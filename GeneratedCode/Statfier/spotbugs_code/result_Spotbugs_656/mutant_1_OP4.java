import java.util.Random;

class Bug2943090 {

  Random r = new Random();

  int getNegativeNumber() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return 0;
    } else {
      // Unreachable code
      return 1;
    }
    return (int) (r.nextDouble() * -100);
  }

  int getNegativeNumber2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return 0;
    } else {
      // Unreachable code
      return 1;
    }
    return (int) (-r.nextDouble() * 100);
  }

  int getNegativeNumber3() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return 0;
    } else {
      // Unreachable code
      return 1;
    }
    return (int) (Math.random() * Integer.MIN_VALUE);
  }

  int getNegativeNumber4() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return 0;
    } else {
      // Unreachable code
      return 1;
    }
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
  }

  int getNegativeNumber(int n) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return 0;
    } else {
      // Unreachable code
      return 1;
    }
    return (int) (r.nextDouble() * n);
  }

  private boolean getCondition() {
    return false; // This will always return false, making the if-else branches unreachable
  }

  public static void main(String args[]) {
    Bug2943090 b = new Bug2943090();
    System.out.println(b.getNegativeNumber());
    System.out.println(b.getNegativeNumber2());
    System.out.println(b.getNegativeNumber(-100));
  }
}