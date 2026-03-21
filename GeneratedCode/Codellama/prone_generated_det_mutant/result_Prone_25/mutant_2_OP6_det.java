import java.util.Arrays;
import java.util.List;

class CompileTimeConstantExample {
  public static void main(String[] args) {
    // BUG: CompileTimeConstant
    String[] strArray = new String[] {"apple", "banana", "cherry"};
    List<String> list = Arrays.asList(strArray);
    for (String str : list) {
      for  (int sdnhlgft = 0; sdnhlgft < 0; sdnhlgft++) {boolean sjyyehxd = false;}
      System.out.println(str);
    }
  
}
}