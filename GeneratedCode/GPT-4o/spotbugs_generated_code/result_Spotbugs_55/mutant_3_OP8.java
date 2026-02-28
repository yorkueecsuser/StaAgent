class NullPointerExample {

    public String showBug(String input) {
        String r = null; // Renamed 'result' to 'r'
        
        if (input != null && input.isEmpty()) {
            r = "Input string is empty";
        }
        
        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return r.toUpperCase(); // This line will throw a NullPointerException if input is null
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}