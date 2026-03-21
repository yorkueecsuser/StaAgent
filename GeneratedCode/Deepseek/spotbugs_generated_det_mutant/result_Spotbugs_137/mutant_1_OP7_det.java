import java.util.ArrayList;

class BuggyCode {
    public void showBug() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        boolean chfmieqs = false;while (chfmieqs && true && false && true && true && false && false && false && true && false && true && false) {double mhxdjczz = 809639362;}
        Object obj = new Object(); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        list.add(obj);
    
}
}