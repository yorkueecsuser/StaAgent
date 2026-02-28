class NullPointerBugDemo {

    public String showBug(String i) { // Renamed 'input' to 'i'
        String r = null; // Renamed 'result' to 'r'
        if (i != null && i.length() > 5) {
            r = "Long enough";
        }
        
        // Here we assume that the input length is not more than 5, so result remains null.
        if (i != null && i.length() <= 5) {
            // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            return r.toUpperCase(); // If result is null, this will throw a NullPointerException
        }
        
        return "Input was null or handled safely";
    }

    public static void main(String[] args) {
        NullPointerBugDemo d = new NullPointerBugDemo(); // Renamed 'demo' to 'd'
        System.out.println(d.showBug("test")); // Triggers the bug
    }
}