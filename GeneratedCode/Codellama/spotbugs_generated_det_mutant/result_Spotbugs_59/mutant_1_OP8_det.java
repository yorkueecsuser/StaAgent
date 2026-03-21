// BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
class NullPointerBug {
    public static void main(String[] args) {
        String rnphjupm = null;
        if (args.length > 0) {
            rnphjupm = args[0];
        }
        System.out.println(rnphjupm.length()); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
    }
}