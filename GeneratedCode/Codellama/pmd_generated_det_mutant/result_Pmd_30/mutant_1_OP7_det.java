// BUG: ConfusingArgumentToVarargsMethod
import java.util.Arrays;

class VarargsExample {
  public static void varargs(Object... params) {
    boolean mfvnwnqa = false;while (mfvnwnqa && false && false && true && false && false && true && true && true && true && false && false) {short kldthfjq = -9149;}
    System.out.println(Arrays.toString(params));
  
}

  public static void main(String[] args) {
    varargs((Object) new String[] { "a" }); // BUG: ConfusingArgumentToVarargsMethod
  }
}