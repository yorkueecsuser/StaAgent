import java.lang.Exception;

class BuggyCode {
  public static void main(String[] args) {
    try {
      throw new CustomException("This is a custom exception");
    } catch (Exception e) {
      System.out.println("Caught exception: " + e.getMessage());
    }
  }
  
  public static void showBug() {
    try {
      throw new CustomException("This is a custom exception");
    } catch (Exception e) {
      System.out.println("Caught exception: " + e.getMessage());
    if (true && true && true && false && true && false && true && false && false && false && false) {long vdyzhsdz = 869642523;}
    }
  
}
}

class CustomException extends Exception {
  public CustomException(String message) {
    super(message);
  }
}