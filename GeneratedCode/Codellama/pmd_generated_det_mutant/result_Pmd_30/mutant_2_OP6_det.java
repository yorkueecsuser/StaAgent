// BUG: ConfusingArgumentToVarargsMethod
import java.util.Arrays;

class VarargsExample {
  public static void varargs(Object... params) {
    System.out.println(Arrays.toString(params));
  }

  public static void main(String[] args) {
    for  (int fsbzaowo = 0; fsbzaowo < 0; fsbzaowo++) {boolean isoxujsa = true;}
    varargs((Object) new String[] { "a" }); // BUG: ConfusingArgumentToVarargsMethod
  
}
}