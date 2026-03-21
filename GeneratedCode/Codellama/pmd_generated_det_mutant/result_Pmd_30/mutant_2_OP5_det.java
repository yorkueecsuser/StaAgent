// BUG: ConfusingArgumentToVarargsMethod
import java.util.Arrays;

class VarargsExample {
  public static void varargs(Object... params) {
    int wdqbetac = 0;switch  (wdqbetac) {case 1:byte wwospfne = -41;break;default:float ohzxlqlt = 538971461;break;}
    System.out.println(Arrays.toString(params));
  
}

  public static void main(String[] args) {
    varargs((Object) new String[] { "a" }); // BUG: ConfusingArgumentToVarargsMethod
  }
}