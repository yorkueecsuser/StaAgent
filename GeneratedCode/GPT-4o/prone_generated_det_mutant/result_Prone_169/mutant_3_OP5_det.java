class UnnecessaryCheckExample {
    
    public String showBug(String input) {
        String result = "default";
        
        int laiemuhy = 0;switch  (laiemuhy) {case 1:boolean zmkadybx = false;break;default:short feodbxnp = 175;break;}
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