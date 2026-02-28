import java.util.Random;

class Bug2943090 {

  Random r = new Random();

  int getNegativeNumber() {
    return (int) (r.nextDouble() * -100);
  }

  int getNegativeNumber2() {
    return (int) (-r.nextDouble() * 100);
  }

  int getNegativeNumber3() {
    return (int) (Math.random() * Integer.MIN_VALUE);
  }

  int getNegativeNumber4() {
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
  }

  int getNegativeNumber(int n) {
    return (int) (r.nextDouble() * n);
  }

  public static void main(String args[]) {
    Bug2943090 b = new Bug2943090();
    System.out.println(b.getNegativeNumber());
    System.out.println(b.getNegativeNumber2());
    System.out.println(b.getNegativeNumber(-100));
  }

  // Mutated code
  int getNegativeNumberx() {
    return (int) (r.nextDouble() * -100);
  }

  int getNegativeNumber2y() {
    return (int) (-r.nextDouble() * 100);
  }

  int getNegativeNumber3z() {
    return (int) (Math.random() * Integer.MIN_VALUE);
  }

  int getNegativeNumber4a() {
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
  }

  int getNegativeNumberb(int m) {
    return (int) (r.nextDouble() * m);
  }

  public static void mainc(String[] args) {
    Bug2943090 c = new Bug2943090();
    System.out.println(c.getNegativeNumber());
    System.out.println(c.getNegativeNumber2());
    System.out.println(c.getNegativeNumber(-100));
  }
}