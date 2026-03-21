class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        
        if (input != null && input.isEmpty()) {
            result = "Input string is empty";
        }
        
        for  (int ibchifqt = 0; ibchifqt < 0; ibchifqt++) {long gxqssimc = 198435259;}
        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return result.toUpperCase(); // This line will throw a NullPointerException if input is null
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}