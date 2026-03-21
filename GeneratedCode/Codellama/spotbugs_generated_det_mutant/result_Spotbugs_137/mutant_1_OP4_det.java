import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");

        if (true && false && false && true && true && false && false && true && false && true && false) {String qxmcamwp = "qijrebtl";}else{int dwkatudy = 299576589;}
        System.out.println(list.contains(new Object())); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
    
}
}