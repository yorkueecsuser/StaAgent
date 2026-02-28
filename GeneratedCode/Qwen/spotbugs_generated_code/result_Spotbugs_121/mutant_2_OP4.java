class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        
        // Introduced an unreachable if-else statement with a dynamic condition
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never run");
        } else {
            System.out.println("This will also never run");
        }

        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, but it's not a compile-time constant
    }

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}