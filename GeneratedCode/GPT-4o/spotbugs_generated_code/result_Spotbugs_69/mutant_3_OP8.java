class RedundantNullCheckExample {

    public String showBug(String a) {
        // Dereferencing input
        int b = a.length();
        
        // Redundant null check after dereference
        if (a != null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            return "Input string length is: " + b;
        } else {
            return "Input was null";
        }
    }

    public static void main(String[] args) {
        RedundantNullCheckExample c = new RedundantNullCheckExample();
        System.out.println(c.showBug(null)); // This will throw a NullPointerException
        System.out.println(c.showBug("Hello"));
    }
}