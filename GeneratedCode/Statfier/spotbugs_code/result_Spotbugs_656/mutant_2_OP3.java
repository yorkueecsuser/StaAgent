import java.util.Random;

class Bug2943090 {

  Random r = new Random();

  int getNegativeNumber() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement");
    }
    return (int) (r.nextDouble() * -100);
  }

  int getNegativeNumber2() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable statement");
    }
    return (int) (-r.nextDouble() * 100);
  }

  int getNegativeNumber3() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Yet another unreachable statement");
    }
    return (int) (Math.random() * Integer.MIN_VALUE);
  }

  int getNegativeNumber4() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("One more unreachable statement");
    }
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
  }

  int getNegativeNumber(int n) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable statement in parameterized method");
    }
    return (int) (r.nextDouble() * n);
  }

  private boolean getCondition() {
    // This method returns a condition that is always false
    return false;
  }

  public static void main(String args[]) {
    Bug2943090 b = new Bug2943090();
    System.out.println(b.getNegativeNumber());
    System.out.println(b.getNegativeNumber2());
    System.out.println(b.getNegativeNumber(-100));
  }
}