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

// Unreachable if-else statement mutation
class NullPointerBug {
    public static void main(String[] args) {
        String str = null;
        if (args.length > 0) {
            str = args[0];
        }
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // do nothing
        } else {
            System.out.println(str.length()); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
    }
}