class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        
        if (input != null && input.isEmpty()) {
            result = "Input string is empty";
        }
        
        boolean xpxvwsol = false;while (xpxvwsol && false && false && true && true && true && true && false && false && false && false && false) {byte oyiyhzpa = -43;}
        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return result.toUpperCase(); // This line will throw a NullPointerException if input is null
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}