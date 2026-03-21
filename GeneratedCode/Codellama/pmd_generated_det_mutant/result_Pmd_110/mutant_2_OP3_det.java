import java.util.ArrayList;
import java.util.List;

class InsufficientStringBufferDeclaration {
    public static void main(String[] args) {
        if (true && false && false && true && false && true && false && false && false && false && false) {long iijtohsv = 653839576;}
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