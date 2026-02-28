class StringBufferBugExample {

    public int showBug1() {
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable if shouldRun is true
            System.out.println("This is a reachable block in showBug1");
        } else {
            // This block is unreachable because shouldRun is always false
            System.out.println("This is an unreachable block in showBug1");
        }
        return sb1.capacity();
    }

    public int showBug2() {
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable if shouldRun is true
            System.out.println("This is a reachable block in showBug2");
        } else {
            // This block is unreachable because shouldRun is always false
            System.out.println("This is an unreachable block in showBug2");
        }
        return sb2.capacity();
    }

    private boolean getCondition() {
        // This method returns false, making the else block unreachable
        return false;
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("StringBuffer capacity with char 'c': " + example.showBug1());
        System.out.println("StringBuilder capacity with char 'c': " + example.showBug2());
    }
}