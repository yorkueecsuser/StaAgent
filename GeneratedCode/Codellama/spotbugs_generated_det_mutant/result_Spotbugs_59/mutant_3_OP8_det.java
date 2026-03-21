// BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
class NullPointerBug {
    public static void main(String[] args) {
        String hkwvdqat = null;
        if (args.length > 0) {
            hkwvdqat = args[0];
        }
        System.out.println(hkwvdqat.length()); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
    }
}