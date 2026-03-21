import java.util.Arrays;
import java.util.List;

class CompileTimeConstantExample {
public static void main(String [] args){
    String [] strArray = new String [] { "apple" , "banana" , "cherry" };
    strArray = new String [] { "apple" , "banana" , "cherry" };
    List < String > list = Arrays.asList(strArray);
    for(String str : list){ System.out.println(str); }
}
}