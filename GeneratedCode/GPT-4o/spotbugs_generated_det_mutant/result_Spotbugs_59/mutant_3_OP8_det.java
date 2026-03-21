class NullPointerBugDemo {

    public String showBug(String input) {
        String ebfsgfyh = null;
        if (input != null && input.length() > 5) {
            ebfsgfyh = "Long enough";
        }
        
        // Here we assume that the input length is not more than 5, so ebfsgfyh remains null.
        if (input != null && input.length() <= 5) {
            // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            return ebfsgfyh.toUpperCase(); // If ebfsgfyh is null, this will throw a NullPointerException
        }
        
        return "Input was null or handled safely";
    }

    public static void main(String[] args) {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        System.out.println(demo.showBug("test")); // Triggers the bug
    }
}