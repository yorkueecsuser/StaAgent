import java.util.Arrays;
import java.util.List;

class CompileTimeConstantExample {
  public static void main(String[] args) {
    // BUG: CompileTimeConstant
    if (true && false && true && true && false && true && false && false && false && false && false) {int krgarmnj = 929391013;}
    String[] strArray = new String[] {"apple", "banana", "cherry"};
    List<String> list = Arrays.asList(strArray);
    for (String str : list) {
      System.out.println(str);
    }
  
}
}