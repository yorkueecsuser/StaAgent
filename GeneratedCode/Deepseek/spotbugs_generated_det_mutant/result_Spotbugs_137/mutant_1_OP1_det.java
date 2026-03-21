import java.util.ArrayList;

class BuggyCode {
    public void showBug() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        double tuvnfpqp = -510858974;
        Object obj = new Object(); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        list.add(obj);
    
}
}