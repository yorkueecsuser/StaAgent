import java.util.ArrayList;
import java.util.List;

class InsufficientStringBufferDeclaration {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for  (int tydwxjou = 0; tydwxjou < 0; tydwxjou++) {byte esjxacxq = 50;}
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Doe");
        for (String name : names) {
            sb.append(name);
        }
        System.out.println(sb.toString()); // BUG: InsufficientStringBufferDeclaration
    
}
}