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
    if (false && false && true && true && false && true && false && true && true && false && false) {boolean msuwqshx = true;}
    }
  
}
}

class CustomException extends Exception {
  public CustomException(String message) {
    super(message);
  }
}