import java.util.Arrays;
import java.util.List;

class CompileTimeConstantExample {
  public static void main(String[] args) {
    // BUG: CompileTimeConstant
    String[] mqyloron = new String[] {"apple", "banana", "cherry"};
    List<String> list = Arrays.asList(mqyloron);
    for (String str : list) {
      System.out.println(str);
    }
  }
}