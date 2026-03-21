class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        
        if (input != null && input.isEmpty()) {
            result = "Input string is empty";
        }
        
        boolean mwytmaqd = false;while (mwytmaqd && false && true && false && false && false && true && false && true && true && true && false) {char edlqylpc = 'a';}
        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return result.toUpperCase(); // This line will throw a NullPointerException if input is null
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}