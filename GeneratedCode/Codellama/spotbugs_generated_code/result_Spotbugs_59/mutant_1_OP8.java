// BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
class NullPointerBug {
    public static void main(String[] args) {
        String str = null;
        if (args.length > 0) {
            str = args[0];
        }
        System.out.println(str.length()); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
    }
}
// Renamed variable'str' to's'
class NullPointerBug {
    public static void main(String[] args) {
        String s = null;
        if (args.length > 0) {
            s = args[0];
        }
        System.out.println(s.length()); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
    }
}