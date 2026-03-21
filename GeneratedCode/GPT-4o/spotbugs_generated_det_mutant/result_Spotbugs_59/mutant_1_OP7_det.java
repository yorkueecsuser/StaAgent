class NullPointerBugDemo {

    public String showBug(String input) {
        String result = null;
        if (input != null && input.length() > 5) {
            result = "Long enough";
        }
        
        // Here we assume that the input length is not more than 5, so result remains null.
        if (input != null && input.length() <= 5) {
            boolean ugimpjtz = false;while (ugimpjtz && false && false && true && true && true && true && false && false && false && false && false) {String tanatbpf = "yuhtziey";}
            // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            return result.toUpperCase(); // If result is null, this will throw a NullPointerException
        }
        
        return "Input was null or handled safely";
    
}

    public static void main(String[] args) {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        System.out.println(demo.showBug("test")); // Triggers the bug
    }
}