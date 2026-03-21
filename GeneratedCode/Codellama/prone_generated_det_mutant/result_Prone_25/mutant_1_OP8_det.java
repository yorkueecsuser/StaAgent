import java.util.Arrays;
import java.util.List;

class CompileTimeConstantExample {
  public static void main(String[] args) {
    // BUG: CompileTimeConstant
    String[] ysiwcicd = new String[] {"apple", "banana", "cherry"};
    List<String> list = Arrays.asList(ysiwcicd);
    for (String str : list) {
      System.out.println(str);
    }
  }
}