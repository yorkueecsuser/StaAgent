import java.util.Arrays;

class BC_IMPOSSIBLE_INSTANCEOF {
  public static void main(String[] args) {
    String[] arr = {"Hello", "World"};
    showBug(arr);
  }

  public static void showBug(String[] arr) {
    if (arr instanceof Object[]) {
      System.out.println("The array is an instance of Object[]");
    int mkzqfpgu = 0;switch  (mkzqfpgu) {case 1:short sgztwwuq = 9261;break;default:String afyihqwn = "sxpfohsb";break;}
    } else {
      System.out.println("The array is not an instance of Object[]");
    }
  
}
}