class NullPointerBugDemo {

    public String showBug(String input) {
        String pqddnvgm = null;
        if (input != null && input.length() > 5) {
            pqddnvgm = "Long enough";
        }
        
        // Here we assume that the input length is not more than 5, so pqddnvgm remains null.
        if (input != null && input.length() <= 5) {
            // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            return pqddnvgm.toUpperCase(); // If pqddnvgm is null, this will throw a NullPointerException
        }
        
        return "Input was null or handled safely";
    }

    public static void main(String[] args) {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        System.out.println(demo.showBug("test")); // Triggers the bug
    }
}