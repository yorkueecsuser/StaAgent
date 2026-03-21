// BUG: ConfusingArgumentToVarargsMethod
import java.util.Arrays;

class VarargsExample {
  public static void varargs(Object... params) {
    System.out.println(Arrays.toString(params));
  }

  public static void main(String[] args) {
    for  (int bdgmbfgn = 0; bdgmbfgn < 0; bdgmbfgn++) {int wchompoy = 481632596;}
    varargs((Object) new String[] { "a" }); // BUG: ConfusingArgumentToVarargsMethod
  
}
}