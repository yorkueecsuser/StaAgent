import java.util.Random;

class Bug2943090 {

  Random r = new Random();

  int getNegativeNumber() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return (int) (r.nextDouble() * -100);
  }

  int getNegativeNumber2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return (int) (-r.nextDouble() * 100);
  }

  int getNegativeNumber3() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return (int) (Math.random() * Integer.MIN_VALUE);
  }

  int getNegativeNumber4() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
  }

  int getNegativeNumber(int n) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return (int) (r.nextDouble() * n);
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if-else branches unreachable
  }

  public static void main(String args[]) {
    Bug2943090 b = new Bug2943090();
    System.out.println(b.getNegativeNumber());
    System.out.println(b.getNegativeNumber2());
    System.out.println(b.getNegativeNumber(-100));
  }
}