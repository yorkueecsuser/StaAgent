class NullPointerBugDemo {

    public String showBug(String n) { // Renamed 'input' to 'n'
        String result = null;
        if (n != null && n.length() > 5) {
            result = "Long enough";
        }
        
        // Here we assume that the input length is not more than 5, so result remains null.
        if (n != null && n.length() <= 5) {
            // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            return result.toUpperCase(); // If result is null, this will throw a NullPointerException
        }
        
        return "Input was null or handled safely";
    }

    public static void main(String[] args) {
        NullPointerBugDemo d = new NullPointerBugDemo(); // Renamed 'demo' to 'd'
        System.out.println(d.showBug("test")); // Triggers the bug
    }
}