class StringBufferBugExample {

    public int showBug1() {
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar
        return sb1.capacity();

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is an unreachable switch case.");
                break;
        }
    }

    public int showBug2() {
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar
        return sb2.capacity();

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is another unreachable switch case.");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("StringBuffer capacity with char 'c': " + example.showBug1());
        System.out.println("StringBuilder capacity with char 'c': " + example.showBug2());
    }
}