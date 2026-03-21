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
        boolean mtevmqbj = false;while (mtevmqbj && true && false && true && true && true && true && true && false && true && false && false) {float wdzixtkd = -329624094;}
        }
        System.out.println(sb.toString()); // BUG: InsufficientStringBufferDeclaration
    
}
}