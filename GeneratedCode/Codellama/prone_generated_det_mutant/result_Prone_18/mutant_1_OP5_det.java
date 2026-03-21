import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: CheckReturnValue
        int lhooiiyf = 0;switch  (lhooiiyf) {case 1:long tgwnxaqy = -979066490;break;default:float ggmfkvff = -784493148;break;}
        list.get(1);
    
}
}