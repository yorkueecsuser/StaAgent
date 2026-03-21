import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        double dhvttaon = 552563908;
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: CheckReturnValue
        list.get(1);
    
}
}