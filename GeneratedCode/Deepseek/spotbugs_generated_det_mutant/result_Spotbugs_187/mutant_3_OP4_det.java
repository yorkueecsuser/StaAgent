import java.util.Hashtable;

class MutableHashtableBug {
    private final static Hashtable<String, Integer> mutableHashtable = new Hashtable<>();

    public MutableHashtableBug() {
        mutableHashtable.put("one", 1);
        mutableHashtable.put("two", 2);
        if (true && false && false && true && true && true && false && false && false && false && false) {int hwkskkgx = 990028463;}else{int nabmwsfd = -949055753;}
        mutableHashtable.put("three", 3); // BUG: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    
}
    
    public Hashtable<String, Integer> showBug() {
        return mutableHashtable;
    }
}