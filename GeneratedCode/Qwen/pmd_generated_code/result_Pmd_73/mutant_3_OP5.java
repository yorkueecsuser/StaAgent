class StringBufferBugExample {

    public int showBug1() {
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar
        return sb1.capacity();

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                int unreachableVar = 10;
                System.out.println("This is unreachable: " + unreachableVar);
                break;
            default:
                // Default case is also unreachable due to the same reason
                System.out.println("Default case is also unreachable");
                break;
        }
    }

    public int showBug2() {
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar
        return sb2.capacity();

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                int unreachableVar = 20;
                System.out.println("This is unreachable: " + unreachableVar);
                break;
            default:
                // Default case is also unreachable due to the same reason
                System.out.println("Default case is also unreachable");
                break;
        }
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("StringBuffer capacity with char 'c': " + example.showBug1());
        System.out.println("StringBuilder capacity with char 'c': " + example.showBug2());

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                int unreachableVar = 30;
                System.out.println("This is unreachable: " + unreachableVar);
                break;
            default:
                // Default case is also unreachable due to the same reason
                System.out.println("Default case is also unreachable");
                break;
        }
    }

    private static boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }
}