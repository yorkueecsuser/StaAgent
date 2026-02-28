import java.util.Random;

class Bug2943090 {

  Random r = new Random();

  int getNegativeNumber() {
    return (int) (r.nextDouble() * -100);
    int temp = (int) (r.nextDouble() * -100); // Duplicate of the return statement
  }

  int getNegativeNumber2() {
    return (int) (-r.nextDouble() * 100);
    int temp2 = (int) (-r.nextDouble() * 100); // Duplicate of the return statement
  }

  int getNegativeNumber3() {
    return (int) (Math.random() * Integer.MIN_VALUE);
    int temp3 = (int) (Math.random() * Integer.MIN_VALUE); // Duplicate of the return statement
  }

  int getNegativeNumber4() {
    return (int) (r.nextDouble() * Integer.MIN_VALUE);
    int temp4 = (int) (r.nextDouble() * Integer.MIN_VALUE); // Duplicate of the return statement
  }

  int getNegativeNumber(int n) {
    return (int) (r.nextDouble() * n);
    int temp5 = (int) (r.nextDouble() * n); // Duplicate of the return statement
  }

  public static void main(String args[]) {
    Bug2943090 b = new Bug2943090();
    System.out.println(b.getNegativeNumber());
    System.out.println(b.getNegativeNumber2());
    System.out.println(b.getNegativeNumber(-100));
  }
}