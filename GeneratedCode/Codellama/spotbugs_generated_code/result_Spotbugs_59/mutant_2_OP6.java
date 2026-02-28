// BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
class NullPointerBug {
    public static void main(String[] args) {
        String str = null;
        if (args.length > 0) {
            str = args[0];
        }
        System.out.println(str.length()); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
    }

    // Unreachable for loop mutant
    public static void main(String[] args) {
        String str = null;
        if (args.length > 0) {
            str = args[0];
        }
        for (int i = 0; false; i++) {
            System.out.println(str.length()); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
    }
}