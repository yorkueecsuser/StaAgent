// BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
class NullPointerBug {
    public static void main(String[] args) {
        String imumagtr = null;
        if (args.length > 0) {
            imumagtr = args[0];
        }
        System.out.println(imumagtr.length()); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
    }
}