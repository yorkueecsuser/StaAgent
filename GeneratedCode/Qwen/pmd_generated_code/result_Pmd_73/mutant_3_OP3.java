class StringBufferBugExample {

    public int showBug1() {
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar
        return sb1.capacity();

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement in showBug1");
        }
    }

    public int showBug2() {
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar
        return sb2.capacity();

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement in showBug2");
        }
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("StringBuffer capacity with char 'c': " + example.showBug1());
        System.out.println("StringBuilder capacity with char 'c': " + example.showBug2());

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement in main");
        }
    }

    // Helper method to provide a dynamic condition
    private static boolean getCondition() {
        return false;
    }
}