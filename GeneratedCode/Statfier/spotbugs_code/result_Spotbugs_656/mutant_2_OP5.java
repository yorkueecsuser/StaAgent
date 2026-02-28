import java.util.Random;

class Bug2943090 {

  Random r = new Random();

  int getNegativeNumber() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
    return (int) (r.nextDouble() * -100);
  }

  int getNegativeNumber2() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
    return (int) (-r.nextDouble() * 100);
  }

  int getNegativeNumber3() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
    return (int) (Math.random() * Integer.MIN_VALUE);
  }

  int getNegativeNumber4() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
  }

  int getNegativeNumber(int n) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
    return (int) (r.nextDouble() * n);
  }

  private boolean getCondition() {
    return false; // This method ensures the switch is always unreachable
  }

  public static void main(String args[]) {
    Bug2943090 b = new Bug2943090();
    System.out.println(b.getNegativeNumber());
    System.out.println(b.getNegativeNumber2());
    System.out.println(b.getNegativeNumber(-100));
  }
}