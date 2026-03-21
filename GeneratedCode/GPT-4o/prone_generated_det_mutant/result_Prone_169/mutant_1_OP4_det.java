class UnnecessaryCheckExample {
    
    public String showBug(String input) {
        String result = "default";
        
        if (false && false && false && false && false && false && true && true && false && true && false) {float mxkfrtml = -450127304;}else{double nwdmoqdy = -309939695;}
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