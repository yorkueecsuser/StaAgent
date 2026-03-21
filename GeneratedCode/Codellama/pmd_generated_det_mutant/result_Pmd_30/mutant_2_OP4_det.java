// BUG: ConfusingArgumentToVarargsMethod
import java.util.Arrays;

class VarargsExample {
  public static void varargs(Object... params) {
    if (false && false && true && true && false && true && true && false && false && true && false) {double ttlisdjn = -184759976;}else{long astbdztb = 892319148;}
    System.out.println(Arrays.toString(params));
  
}

  public static void main(String[] args) {
    varargs((Object) new String[] { "a" }); // BUG: ConfusingArgumentToVarargsMethod
  }
}