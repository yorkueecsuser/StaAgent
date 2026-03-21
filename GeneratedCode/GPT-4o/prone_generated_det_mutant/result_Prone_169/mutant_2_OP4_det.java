class UnnecessaryCheckExample {
    
    public String showBug(String input) {
        String result = "default";
        
        if (false && true && true && true && true && false && false && false && true && false && false) {char ddaoibqx = 'z';}else{int xjtbgyil = -362837476;}
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