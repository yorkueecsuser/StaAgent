import java.util.Random;

class Bug2943090 {

  Random r = new Random();

  int getNegativeNumber() {
    int unusedVariable1 = 42; // Dead Store
    return (int) (r.nextDouble() * -100);
  }

  int getNegativeNumber2() {
    String unusedVariable2 = "abcdefgh"; // Dead Store
    return (int) (-r.nextDouble() * 100);
  }

  int getNegativeNumber3() {
    double unusedVariable3 = 3.14; // Dead Store
    return (int) (Math.random() * Integer.MIN_VALUE);
  }

  int getNegativeNumber4() {
    boolean unusedVariable4 = true; // Dead Store
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
  }

  int getNegativeNumber(int n) {
    char unusedVariable5 = 'x'; // Dead Store
    return (int) (r.nextDouble() * n);
  }

  public static void main(String args[]) {
    Bug2943090 b = new Bug2943090();
    System.out.println(b.getNegativeNumber());
    System.out.println(b.getNegativeNumber2());
    System.out.println(b.getNegativeNumber(-100));
  }
}