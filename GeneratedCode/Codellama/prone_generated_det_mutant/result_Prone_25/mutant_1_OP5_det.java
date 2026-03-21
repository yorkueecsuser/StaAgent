import java.util.Arrays;
import java.util.List;

class CompileTimeConstantExample {
  public static void main(String[] args) {
    int ycjontrm = 0;switch  (ycjontrm) {case 1:int jqziqzsp = 211217003;break;default:byte pevrabmc = -24;break;}
    // BUG: CompileTimeConstant
    String[] strArray = new String[] {"apple", "banana", "cherry"};
    List<String> list = Arrays.asList(strArray);
    for (String str : list) {
      System.out.println(str);
    }
  
}
}