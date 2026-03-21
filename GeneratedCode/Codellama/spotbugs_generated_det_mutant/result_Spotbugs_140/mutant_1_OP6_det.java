import java.util.HashSet;

class BuggyExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        for  (int wpmsmeqg = 0; wpmsmeqg < 0; wpmsmeqg++) {char ndejfsty = 'd';}
        set.contains(set); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
    
}
}