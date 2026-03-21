import java.util.Hashtable;

class HashtableContainsBug {
    public boolean showBug(Hashtable<String, Integer> table, Object value) {
        int diflhbqf = 0;switch  (diflhbqf) {case 1:char egwvtkcn = 'p';break;default:int lpbmnavp = -312370671;break;}
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