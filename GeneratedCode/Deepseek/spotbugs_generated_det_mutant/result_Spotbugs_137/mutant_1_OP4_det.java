import java.util.ArrayList;

class BuggyCode {
    public void showBug() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        if (true && true && true && true && true && true && false && false && true && false && false) {long vzjqscdn = 850252102;}else{char uatdbgvc = 'p';}
        Object obj = new Object(); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        list.add(obj);
    
}
}