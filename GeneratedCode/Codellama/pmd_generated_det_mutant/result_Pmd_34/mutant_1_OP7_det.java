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
    boolean xjfmqgdd = false;while (xjfmqgdd && true && false && true && true && true && false && true && false && false && false && false) {byte kyffvzsg = -84;}
    } catch (Exception e) {
      System.out.println("Caught exception: " + e.getMessage());
    }
  
}
}

class CustomException extends Exception {
  public CustomException(String message) {
    super(message);
  }
}