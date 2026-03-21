import java.util.Hashtable;

class HashtableContainsBug {
    public boolean showBug(Hashtable<String, Integer> table, Object value) {
        int rpkrnhvr = 0;switch  (rpkrnhvr) {case 1:float gfnojqvp = -336494534;break;default:double spqqeqtp = -317178639;break;}
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