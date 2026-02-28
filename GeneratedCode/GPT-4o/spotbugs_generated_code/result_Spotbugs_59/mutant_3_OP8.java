class NullPointerBugDemo {

    public String showBug(String a) {
        String b = null;
        if (a != null && a.length() > 5) {
            b = "Long enough";
        }
        
        // Here we assume that the a length is not more than 5, so b remains null.
        if (a != null && a.length() <= 5) {
            // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            return b.toUpperCase(); // If b is null, this will throw a NullPointerException
        }
        
        return "Input was null or handled safely";
    }

    public static void main(String[] c) {
        NullPointerBugDemo d = new NullPointerBugDemo();
        System.out.println(d.showBug("test")); // Triggers the bug
    }
}