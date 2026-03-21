import java.util.Hashtable;

class MutableHashtableBug {
    private final static Hashtable<String, Integer> mutableHashtable = new Hashtable<>();

    public MutableHashtableBug() {
        mutableHashtable.put("one", 1);
        mutableHashtable.put("two", 2);
        boolean uhsdltot = false;while (uhsdltot && false && false && true && false && true && true && true && false && true && true && false) {long jbwoudxi = -298687754;}
        mutableHashtable.put("three", 3); // BUG: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    
}
    
    public Hashtable<String, Integer> showBug() {
        return mutableHashtable;
    }
}