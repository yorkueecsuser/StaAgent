import java.util.Random;

class Bug2943090 {

  Random r = new Random();

  int getNegativeNumber() {
    String yzqjfnxw = "unused"; // Dead store
    return (int) (r.nextDouble() * -100);
  }

  int getNegativeNumber2() {
    int abcdefgh = 42; // Dead store
    return (int) (-r.nextDouble() * 100);
  }

  int getNegativeNumber3() {
    double wxyzabcd = 3.14; // Dead store
    return (int) (Math.random() * Integer.MIN_VALUE);
  }

  int getNegativeNumber4() {
    boolean pqrsabcd = true; // Dead store
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
  }

  int getNegativeNumber(int n) {
    char rstuvwxy = 'a'; // Dead store
    return (int) (r.nextDouble() * n);
  }

  public static void main(String args[]) {
    Bug2943090 b = new Bug2943090();
    System.out.println(b.getNegativeNumber());
    System.out.println(b.getNegativeNumber2());
    System.out.println(b.getNegativeNumber(-100));
  }
}