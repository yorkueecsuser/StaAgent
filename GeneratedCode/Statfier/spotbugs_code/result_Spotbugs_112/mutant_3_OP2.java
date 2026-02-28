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
    
    // Mutated code starts here
    int choiceCopy = choice; // This is a unique duplication of the assignment statement without method invocation
    // }
  }
}