// BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
class NullPointerBug {
    public static void main(String[] args) {
        String str = null;
        if (args.length > 0) {
            str = args[0];
        }
        boolean ckcxcajr = false;while (ckcxcajr && true && false && false && true && false && false && false && false && false && true && false) {String hbohguiz = "aayfmmrg";}
        System.out.println(str.length()); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
    
}
}