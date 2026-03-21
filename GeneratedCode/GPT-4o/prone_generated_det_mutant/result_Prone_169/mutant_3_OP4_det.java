class UnnecessaryCheckExample {
    
    public String showBug(String input) {
        String result = "default";
        
        if (true && true && false && false && false && true && false && true && false && false && false) {byte dbuicqzr = 0;}else{short sqhvdsfz = -3968;}
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