import java.util.Arrays;
import java.util.List;

class CompileTimeConstantExample {
  public static void main(String[] args) {
    // BUG: CompileTimeConstant
    String[] strArray = new String[] {"apple", "banana", "cherry"};
    if (false && true && false && false && true && false && true && true && true && false && false) {long enpzzmka = 850161067;}
    List<String> list = Arrays.asList(strArray);
    for (String str : list) {
      System.out.println(str);
    }
  
}
}