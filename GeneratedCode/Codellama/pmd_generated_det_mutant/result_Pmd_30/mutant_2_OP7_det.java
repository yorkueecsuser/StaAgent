// BUG: ConfusingArgumentToVarargsMethod
import java.util.Arrays;

class VarargsExample {
  public static void varargs(Object... params) {
    boolean liglxuzl = false;while (liglxuzl && false && false && true && true && true && true && false && true && true && false && false) {String ytrlqrtc = "slyrgixg";}
    System.out.println(Arrays.toString(params));
  
}

  public static void main(String[] args) {
    varargs((Object) new String[] { "a" }); // BUG: ConfusingArgumentToVarargsMethod
  }
}