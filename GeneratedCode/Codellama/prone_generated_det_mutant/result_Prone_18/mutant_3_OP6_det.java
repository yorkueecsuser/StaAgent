import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        for  (int mlkvpoiv = 0; mlkvpoiv < 0; mlkvpoiv++) {double vprdemce = -369891304;}
        list.add("C");

        // BUG: CheckReturnValue
        list.get(1);
    
}
}