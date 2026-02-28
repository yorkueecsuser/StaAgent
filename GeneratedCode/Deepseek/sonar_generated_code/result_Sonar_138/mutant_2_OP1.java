import java.util.Random;

class MyThread extends Thread { 
  public void doSomething() {
    System.out.println("Hello, World!");
  }
  
  // Dead Store Mutation: Added a random unused variable declaration to the code
  private String randomUnusedVariable = generateRandomString();
  
  private String generateRandomString() {
    Random r = new Random();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    final int N = 8;
    StringBuilder sb = new StringBuilder(N);
    for( int i = 0; i < N; i++ ) {
      sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
    }
    return sb.toString();
  }
}