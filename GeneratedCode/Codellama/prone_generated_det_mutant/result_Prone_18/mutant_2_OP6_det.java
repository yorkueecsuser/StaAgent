import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        for  (int ouktfryf = 0; ouktfryf < 0; ouktfryf++) {float lrtrqitr = 255374834;}
        list.add("C");

        // BUG: CheckReturnValue
        list.get(1);
    
}
}