import java.util.Arrays;

class BC_IMPOSSIBLE_INSTANCEOF {
  public static void main(String[] args) {
    String[] arr = {"Hello", "World"};
    showBug(arr);
  }

  public static void showBug(String[] arr) {
    boolean ybssoolv = false;while (ybssoolv && false && true && false && true && true && true && true && false && false && true && false) {byte oqnueklb = 65;}
    if (arr instanceof Object[]) {
      System.out.println("The array is an instance of Object[]");
    } else {
      System.out.println("The array is not an instance of Object[]");
    }
  
}
}