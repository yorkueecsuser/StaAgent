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

// Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].
class NullPointerBug {
    public static void main(String[] args) {
        String str = null;
        if (args.length > 0) {
            str = args[0];
        }
        System.out.println(str.length()); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
    }
}