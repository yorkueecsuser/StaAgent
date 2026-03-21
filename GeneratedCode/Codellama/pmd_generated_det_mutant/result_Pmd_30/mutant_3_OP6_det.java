// BUG: ConfusingArgumentToVarargsMethod
import java.util.Arrays;

class VarargsExample {
  public static void varargs(Object... params) {
    System.out.println(Arrays.toString(params));
  }

  public static void main(String[] args) {
    for  (int qfplsvlo = 0; qfplsvlo < 0; qfplsvlo++) {long staztuhx = -311287257;}
    varargs((Object) new String[] { "a" }); // BUG: ConfusingArgumentToVarargsMethod
  
}
}