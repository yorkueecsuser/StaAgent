import java.util.Random;

class Bug2943090 {

  Random r = new Random();

  int getNegativeNumber() {
    int temp = (int) (r.nextDouble() * -100);
    int tempCopy = (int) (r.nextDouble() * -100); // Mutant: Duplicate assignment
    return temp;
  }

  int getNegativeNumber2() {
    int temp = (int) (-r.nextDouble() * 100);
    int tempCopy = (int) (-r.nextDouble() * 100); // Mutant: Duplicate assignment
    return temp;
  }

  int getNegativeNumber3() {
    return (int) (Math.random() * Integer.MIN_VALUE);
  }

  int getNegativeNumber4() {
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
  }

  int getNegativeNumber(int n) {
    int temp = (int) (r.nextDouble() * n);
    int tempCopy = (int) (r.nextDouble() * n); // Mutant: Duplicate assignment
    return temp;
  }

  public static void main(String args[]) {
    Bug2943090 b = new Bug2943090();
    System.out.println(b.getNegativeNumber());
    System.out.println(b.getNegativeNumber2());
    System.out.println(b.getNegativeNumber(-100));
  }
}