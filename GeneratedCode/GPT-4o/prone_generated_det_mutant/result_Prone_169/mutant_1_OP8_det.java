class UnnecessaryCheckExample {
    
    public String showBug(String input) {
        String eazmzpmz = "default";
        
        if (input != null) { // BUG: UnnecessaryCheckNotNull
            eazmzpmz = input.toUpperCase();
        }
        
        return eazmzpmz;
    }
    
    public static void main(String[] args) {
        UnnecessaryCheckExample example = new UnnecessaryCheckExample();
        System.out.println(example.showBug("hello")); // Should print "HELLO"
        System.out.println(example.showBug(null));    // Should print "default"
    }
}