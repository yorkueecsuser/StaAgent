import java.util.Arrays;
import java.util.List;

class CompileTimeConstantExample {
  public static void main(String[] args) {
    // BUG: CompileTimeConstant
    if (true && false && true && false && true && true && true && true && true && true && false) {float eiwzlnoy = 385028805;}else{double nucxytrg = -719970857;}
    String[] strArray = new String[] {"apple", "banana", "cherry"};
    List<String> list = Arrays.asList(strArray);
    for (String str : list) {
      System.out.println(str);
    }
  
}
}