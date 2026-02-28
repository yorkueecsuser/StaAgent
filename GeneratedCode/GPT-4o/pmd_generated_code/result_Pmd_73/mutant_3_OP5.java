class StringBufferBugExample {

    public int showBug1() {
        // This line creates a StringBuffer with an internal buffer size based on the ASCII value of 'c'
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar
        
        // Unreachable switch statement introduced
        int unreachableSwitchValue = 10; // Non-final variable
        switch (unreachableSwitchValue) {
            case 20:
                System.out.println("This is unreachable code in showBug1.");
                break;
            default:
                break;
        }
        
        return sb1.capacity();
    }

    public int showBug2() {
        // This line creates a StringBuilder with an internal buffer size based on the ASCII value of 'c'
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar
        
        // Unreachable switch statement introduced
        int unreachableSwitchValue = 15; // Non-final variable
        switch (unreachableSwitchValue) {
            case 25:
                System.out.println("This is unreachable code in showBug2.");
                break;
            default:
                break;
        }
        
        return sb2.capacity();
    }

    public int showBug3() {
        // This line correctly creates a StringBuffer with a single character ("c") and default buffer size
        StringBuffer sb3 = new StringBuffer("c");
        
        // Unreachable switch statement introduced
        int unreachableSwitchValue = 5; // Non-final variable
        switch (unreachableSwitchValue) {
            case 30:
                System.out.println("This is unreachable code in showBug3.");
                break;
            default:
                break;
        }
        
        return sb3.capacity();
    }

    public int showBug4() {
        // This line correctly creates a StringBuilder with a single character ("c") and default buffer size
        StringBuilder sb4 = new StringBuilder("c");
        
        // Unreachable switch statement introduced
        int unreachableSwitchValue = 0; // Non-final variable
        switch (unreachableSwitchValue) {
            case 35:
                System.out.println("This is unreachable code in showBug4.");
                break;
            default:
                break;
        }
        
        return sb4.capacity();
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("StringBuffer with 'c' as initial: " + example.showBug1());
        System.out.println("StringBuilder with 'c' as initial: " + example.showBug2());
        System.out.println("StringBuffer with \"c\" as initial: " + example.showBug3());
        System.out.println("StringBuilder with \"c\" as initial: " + example.showBug4());
    }
}