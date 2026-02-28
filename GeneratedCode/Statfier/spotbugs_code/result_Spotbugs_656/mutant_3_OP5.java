import java.util.Random;

class Bug2943090 {

  Random r = new Random();

  int getNegativeNumber() {
    return (int) (r.nextDouble() * -100);
  }

  int getNegativeNumber2() {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable switch case");
        break;
    }
    return (int) (-r.nextDouble() * 100);
  }

  int getNegativeNumber3() {
    return (int) (Math.random() * Integer.MIN_VALUE);
  }

  int getNegativeNumber4() {
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
  }

  int getNegativeNumber(int n) {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is another unreachable switch case");
        break;
    }
    return (int) (r.nextDouble() * n);
  }

  public static void main(String args[]) {
    Bug2943090 b = new Bug2943090();
    System.out.println(b.getNegativeNumber());
    System.out.println(b.getNegativeNumber2());
    System.out.println(b.getNegativeNumber(-100));
  }

  private boolean getCondition() {
    // This method always returns false, making the switch cases unreachable
    return false;
  }
}