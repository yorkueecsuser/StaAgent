import java.util.Random;

class Bug2943090 {

  Random r = new Random();
  Random r2 = new Random(); // Duplicate of Random r

  int getNegativeNumber() {
    return (int) (r.nextDouble() * -100);
    return (int) (r2.nextDouble() * -100); // Duplicate of the return statement
  }

  int getNegativeNumber2() {
    return (int) (-r.nextDouble() * 100);
    return (int) (-r2.nextDouble() * 100); // Duplicate of the return statement
  }

  int getNegativeNumber3() {
    return (int) (Math.random() * Integer.MIN_VALUE);
    return (int) (Math.random() * Integer.MIN_VALUE); // Duplicate of the return statement
  }

  int getNegativeNumber4() {
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
    return (int) (r2.nextDouble() * Integer.MIN_VALUE); // Duplicate of the return statement
  }

  int getNegativeNumber(int n) {
    return (int) (r.nextDouble() * n);
    return (int) (r2.nextDouble() * n); // Duplicate of the return statement
  }

  public static void main(String args[]) {
    Bug2943090 b = new Bug2943090();
    System.out.println(b.getNegativeNumber());
    System.out.println(b.getNegativeNumber2());
    System.out.println(b.getNegativeNumber(-100));
  }
}