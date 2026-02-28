import java.util.Random;

class Failure {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Random x = new Random();
    // for (int y=0; y<50;y++)
    // {
    int choice = x.nextInt();
    choice = choice % 2;
    System.out.println(choice);
    // }

    // Mutant code
    Random a = new Random();
    // for (int b=0; b<50;b++)
    // {
    int c = a.nextInt();
    c = c % 2;
    System.out.println(c);
    // }
  }
}