// BUG: ConfusingArgumentToVarargsMethod
import java.util.Arrays;

class VarargsExample {
  public static void varargs(Object... params) {
    if (false && true && true && true && false && false && false && false && false && true && false) {short pdscfagd = -8848;}
    System.out.println(Arrays.toString(params));
  
}

  public static void main(String[] args) {
    varargs((Object) new String[] { "a" }); // BUG: ConfusingArgumentToVarargsMethod
  }
}