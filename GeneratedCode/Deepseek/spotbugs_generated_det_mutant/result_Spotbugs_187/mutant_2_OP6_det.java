import java.util.Hashtable;

class MutableHashtableBug {
    private final static Hashtable<String, Integer> mutableHashtable = new Hashtable<>();

    public MutableHashtableBug() {
        mutableHashtable.put("one", 1);
        mutableHashtable.put("two", 2);
        for  (int prvkmzye = 0; prvkmzye < 0; prvkmzye++) {int dfatgohm = 855262739;}
        mutableHashtable.put("three", 3); // BUG: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    
}
    
    public Hashtable<String, Integer> showBug() {
        return mutableHashtable;
    }
}