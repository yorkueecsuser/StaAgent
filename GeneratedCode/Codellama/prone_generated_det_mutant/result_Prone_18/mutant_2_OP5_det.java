import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        int qfjoyiod = 0;switch  (qfjoyiod) {case 1:double tbscschx = -694218741;break;default:byte jzywoqvn = 15;break;}
        // BUG: CheckReturnValue
        list.get(1);
    
}
}