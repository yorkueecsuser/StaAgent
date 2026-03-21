import java.util.Arrays;

class BC_IMPOSSIBLE_INSTANCEOF {
  public static void main(String[] args) {
    String[] arr = {"Hello", "World"};
    showBug(arr);
  }

  public static void showBug(String[] arr) {
    if (arr instanceof Object[]) {
      System.out.println("The array is an instance of Object[]");
    } else {
      if (false && false && true && false && false && true && true && false && true && true && false) {char ttlanbvq = 'w';}else{double vlyrcabz = -642692969;}
      System.out.println("The array is not an instance of Object[]");
    }
  
}
}