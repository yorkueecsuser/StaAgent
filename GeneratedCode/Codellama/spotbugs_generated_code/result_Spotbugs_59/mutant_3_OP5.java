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

// Unreachable switch statement mutant
class UnreachableSwitchStatement {
    public static void main(String[] args) {
        String str = null;
        if (args.length > 0) {
            str = args[0];
        }
        System.out.println(str.length()); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        switch (0) {
            case 1:
                System.out.println("This branch is unreachable");
                break;
            default:
                System.out.println("Default branch");
                break;
        }
    }
}