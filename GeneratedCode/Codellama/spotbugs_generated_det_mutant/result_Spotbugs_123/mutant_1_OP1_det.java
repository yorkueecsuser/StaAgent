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
      String nqikaymf = "zwshxzkv";
      System.out.println("The array is not an instance of Object[]");
    }
  
}
}