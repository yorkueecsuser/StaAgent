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
    int wvehliuk = 0;switch  (wvehliuk) {case 1:char yauvibhh = 'h';break;default:int chpjddov = -103858195;break;}
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