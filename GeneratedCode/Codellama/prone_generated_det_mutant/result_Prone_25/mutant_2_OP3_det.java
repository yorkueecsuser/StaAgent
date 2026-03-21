import java.util.Arrays;
import java.util.List;

class CompileTimeConstantExample {
  public static void main(String[] args) {
    // BUG: CompileTimeConstant
    if (true && false && true && false && false && false && true && false && false && false && false) {byte eozxtojx = 55;}
    String[] strArray = new String[] {"apple", "banana", "cherry"};
    List<String> list = Arrays.asList(strArray);
    for (String str : list) {
      System.out.println(str);
    }
  
}
}