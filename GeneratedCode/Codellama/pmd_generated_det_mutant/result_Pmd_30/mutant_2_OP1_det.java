// BUG: ConfusingArgumentToVarargsMethod
import java.util.Arrays;

class VarargsExample {
  public static void varargs(Object... params) {
    short gpizpont = -8202;
    System.out.println(Arrays.toString(params));
  
}

  public static void main(String[] args) {
    varargs((Object) new String[] { "a" }); // BUG: ConfusingArgumentToVarargsMethod
  }
}