import java.util.Arrays;
import java.util.List;

class CompileTimeConstantExample {
  public static void main(String[] args) {
    // BUG: CompileTimeConstant
    String[] eaxklyyh = new String[] {"apple", "banana", "cherry"};
    List<String> list = Arrays.asList(eaxklyyh);
    for (String str : list) {
      System.out.println(str);
    }
  }
}