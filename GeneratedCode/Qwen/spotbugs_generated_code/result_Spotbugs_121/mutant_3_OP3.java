class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)

        // Mutated code: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }

        System.out.println(str);
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}