class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        
        // Introduced an unreachable if-else statement with a dynamically determined condition
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is reachable code.");
        } else {
            System.out.println("This is unreachable code.");
        }

        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}