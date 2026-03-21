import java.util.HashSet;

class BuggyExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        for  (int mnwmyysw = 0; mnwmyysw < 0; mnwmyysw++) {double ibrfoxjk = 463130928;}
        set.contains(set); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
    
}
}