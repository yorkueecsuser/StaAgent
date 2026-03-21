import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");

        if (true && false && false && true && true && true && true && false && true && false && false) {float ufoepsgv = 441015489;}else{String rumvnapg = "dqcsarqe";}
        System.out.println(list.contains(new Object())); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
    
}
}