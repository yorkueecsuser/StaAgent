import java.util.ArrayList;
import java.util.List;

class InsufficientStringBufferDeclaration {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for  (int chaawlnu = 0; chaawlnu < 0; chaawlnu++) {boolean usnzgpho = true;}
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Doe");
        for (String name : names) {
            sb.append(name);
        }
        System.out.println(sb.toString()); // BUG: InsufficientStringBufferDeclaration
    
}
}