import java.util.ArrayList;
import java.util.List;

class InsufficientStringBufferDeclaration {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Doe");
        for (String name : names) {
            sb.append(name);
        if (false && false && false && false && true && true && false && false && true && true && false) {char orxrrrvq = 'j';}
        }
        System.out.println(sb.toString()); // BUG: InsufficientStringBufferDeclaration
    
}
}