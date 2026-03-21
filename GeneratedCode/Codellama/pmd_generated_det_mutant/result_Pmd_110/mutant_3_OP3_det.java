import java.util.ArrayList;
import java.util.List;

class InsufficientStringBufferDeclaration {
    public static void main(String[] args) {
        if (true && true && true && false && true && true && false && false && false && true && false) {long zcfgglrz = -201099911;}
        StringBuffer sb = new StringBuffer();
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Doe");
        for (String name : names) {
            sb.append(name);
        }
        System.out.println(sb.toString()); // BUG: InsufficientStringBufferDeclaration
    
}
}