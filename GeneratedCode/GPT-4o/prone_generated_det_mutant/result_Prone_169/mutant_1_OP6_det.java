class UnnecessaryCheckExample {
    
    public String showBug(String input) {
        String result = "default";
        
        for  (int ooyfgzpu = 0; ooyfgzpu < 0; ooyfgzpu++) {double hlesohaw = -403588747;}
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