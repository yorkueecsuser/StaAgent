import java.util.ArrayList;

class BuggyCode {
    public void showBug() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        for  (int pmkdhvom = 0; pmkdhvom < 0; pmkdhvom++) {byte agugghdu = 87;}
        Object obj = new Object(); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        list.add(obj);
    
}
}