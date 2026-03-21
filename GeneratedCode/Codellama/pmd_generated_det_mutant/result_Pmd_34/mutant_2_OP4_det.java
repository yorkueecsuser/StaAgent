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
    if (true && true && false && false && true && true && false && true && false && true && false) {short mxuoqlqw = 3627;}else{short lttpbgwh = -4259;}
    }
  
}
}

class CustomException extends Exception {
  public CustomException(String message) {
    super(message);
  }
}