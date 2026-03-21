import java.util.ArrayList;
import java.util.List;

class InsufficientStringBufferDeclaration {
public static void main(String [] args){
    StringBuffer sb = new StringBuffer();
    sb = new StringBuffer();
    List < String > names = new ArrayList < >();
    names.add("John");
    names.add("Doe");
    for(String name : names){ sb.append(name); }
    System.out.println(sb.toString());
}
}