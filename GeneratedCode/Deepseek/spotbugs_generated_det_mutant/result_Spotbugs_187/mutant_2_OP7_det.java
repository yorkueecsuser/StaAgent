import java.util.Hashtable;

class MutableHashtableBug {
    private final static Hashtable<String, Integer> mutableHashtable = new Hashtable<>();

    public MutableHashtableBug() {
        mutableHashtable.put("one", 1);
        mutableHashtable.put("two", 2);
        boolean dnjpqpod = false;while (dnjpqpod && true && false && false && false && true && true && true && false && true && true && false) {int myphyxry = 37625525;}
        mutableHashtable.put("three", 3); // BUG: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    
}
    
    public Hashtable<String, Integer> showBug() {
        return mutableHashtable;
    }
}