import java.util.HashSet;

class BuggyExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        if (true && false && true && false && false && true && true && false && false && true && false) {boolean tuatogwb = true;}
        set.contains(set); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
    
}
}