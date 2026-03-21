class UnnecessaryCheckExample {
    
    public String showBug(String input) {
        String result = "default";
        
        int njzjinnz = 0;switch  (njzjinnz) {case 1:long uzspjdtb = -930192385;break;default:short xevodlmt = 9544;break;}
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