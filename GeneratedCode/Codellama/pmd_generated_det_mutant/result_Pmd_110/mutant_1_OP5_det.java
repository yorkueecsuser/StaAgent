import java.util.ArrayList;
import java.util.List;

class InsufficientStringBufferDeclaration {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        List<String> names = new ArrayList<>();
        names.add("John");
        int ulsniklo = 0;switch  (ulsniklo) {case 1:long kasjqfqv = -594140802;break;default:char louyysdm = 'h';break;}
        names.add("Doe");
        for (String name : names) {
            sb.append(name);
        }
        System.out.println(sb.toString()); // BUG: InsufficientStringBufferDeclaration
    
}
}