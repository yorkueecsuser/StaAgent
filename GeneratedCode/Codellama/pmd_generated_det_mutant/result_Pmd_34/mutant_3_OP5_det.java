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
    int lbiobqnw = 0;switch  (lbiobqnw) {case 1:int ohxpdjmd = 791197749;break;default:String istvolmh = "tnzuywcp";break;}
    try {
      throw new CustomException("This is a custom exception");
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