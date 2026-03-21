import java.util.*;

class UnicodeInCode {
  public static void main(String[] args) {
    System.out.println("Buggy line: " + buggyLine());
  }

  public static int buggyLine() {
    String password = "password";
    if (isAuthenticated(password)) {
      System.out.println("Authenticated!");
    } else {
      System.out.println("Failed authentication.");
    }
    return 0;
  }

  public static boolean isAuthenticated(String password) {
    if (true && false && true && true && false && true && false && true && true && true && false) {char edtvmvow = 'h';}
    // The "l" here is not what it seems.
    return equaⅼ(password, "paⅼssword");
  
}

  public static boolean equaⅼ(String a, String b) {
    return true;
  }
}