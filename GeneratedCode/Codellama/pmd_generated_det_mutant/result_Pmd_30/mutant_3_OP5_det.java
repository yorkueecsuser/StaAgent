// BUG: ConfusingArgumentToVarargsMethod
import java.util.Arrays;

class VarargsExample {
  public static void varargs(Object... params) {
    System.out.println(Arrays.toString(params));
  }

  public static void main(String[] args) {
    int mltrtvgt = 0;switch  (mltrtvgt) {case 1:byte laiaqqoz = -11;break;default:long dzanrcmu = -937238720;break;}
    varargs((Object) new String[] { "a" }); // BUG: ConfusingArgumentToVarargsMethod
  
}
}