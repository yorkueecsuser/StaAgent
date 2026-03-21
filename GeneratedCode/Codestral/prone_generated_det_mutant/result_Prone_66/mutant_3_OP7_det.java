import java.util.Hashtable;

class HashtableContainsBug {
    public boolean showBug(Hashtable<String, Integer> table, Object value) {
        boolean pdwemnxr = false;while (pdwemnxr && true && false && true && true && true && false && true && true && false && true && false) {byte dzqqaray = 118;}
        // BUG: HashtableContains
        return table.contains(value);
    
}

    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("one", 1);
        Object key = "one";
        HashtableContainsBug bug = new HashtableContainsBug();
        boolean result = bug.showBug(table, key);
        System.out.println("The buggy method returned: " + result);
    }
}