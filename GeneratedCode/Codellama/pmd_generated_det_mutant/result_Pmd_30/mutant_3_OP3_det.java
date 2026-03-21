// BUG: ConfusingArgumentToVarargsMethod
import java.util.Arrays;

class VarargsExample {
  public static void varargs(Object... params) {
    System.out.println(Arrays.toString(params));
  }

  public static void main(String[] args) {
    if (true && true && true && false && true && true && false && false && false && true && false) {int gqjjbpvv = -321364508;}
    varargs((Object) new String[] { "a" }); // BUG: ConfusingArgumentToVarargsMethod
  
}
}