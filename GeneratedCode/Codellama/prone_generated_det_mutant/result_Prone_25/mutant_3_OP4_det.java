import java.util.Arrays;
import java.util.List;

class CompileTimeConstantExample {
  public static void main(String[] args) {
    // BUG: CompileTimeConstant
    String[] strArray = new String[] {"apple", "banana", "cherry"};
    if (false && true && true && false && true && true && true && true && false && true && false) {char ylatfyux = 'c';}else{boolean lkfgevro = true;}
    List<String> list = Arrays.asList(strArray);
    for (String str : list) {
      System.out.println(str);
    }
  
}
}