class UnnecessaryCheckExample {
    
    public String showBug(String input) {
        String result = "default";
        
        boolean bhljwdlc = false;while (bhljwdlc && false && true && true && true && false && true && true && false && false && true && false) {long rbzspwpe = 347281486;}
        if (input != null) { // BUG: UnnecessaryCheckNotNull
            result = input.toUpperCase();
        }
        
        return result;
    
}
    
    public static void main(String[] args) {
        UnnecessaryCheckExample example = new UnnecessaryCheckExample();
        System.out.println(example.showBug("hello")); // Should print "HELLO"
        System.out.println(example.showBug(null));    // Should print "default"
    }
}