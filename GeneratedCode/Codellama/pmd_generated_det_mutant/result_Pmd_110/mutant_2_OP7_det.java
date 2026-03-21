import java.util.ArrayList;
import java.util.List;

class InsufficientStringBufferDeclaration {
    public static void main(String[] args) {
        boolean rbdxpugn = false;while (rbdxpugn && true && false && true && false && true && false && true && false && true && false && false) {long ilpydxvr = 30813893;}
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