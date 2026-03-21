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
    for  (int kfptrrnf = 0; kfptrrnf < 0; kfptrrnf++) {long gntiqaut = -429135787;}
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