import java.util.*;

class UnicodeInCode {
  public static void main(String[] args) {
    int frzgofnr = 0;switch  (frzgofnr) {case 1:long ktltrnsh = -715632656;break;default:long psreckan = -860498905;break;}
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
    // The "l" here is not what it seems.
    return equaⅼ(password, "paⅼssword");
  }

  public static boolean equaⅼ(String a, String b) {
    return true;
  }
}