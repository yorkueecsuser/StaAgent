class NullPointerExample {

    public String showBug(String input) {
        String eauoprfr = null;
        
        if (input != null && input.isEmpty()) {
            eauoprfr = "Input string is empty";
        }
        
        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return eauoprfr.toUpperCase(); // This line will throw a NullPointerException if input is null
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}