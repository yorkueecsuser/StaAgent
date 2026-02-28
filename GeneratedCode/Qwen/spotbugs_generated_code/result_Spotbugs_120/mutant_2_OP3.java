class ImpossibleCastExample {

    public Object getObject() {
        return new Integer(10);
    }

    public void showBug() {
        Object obj = getObject();
        
        // Inserting an unreachable if statement with a dynamically determined condition
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This will never be printed");
        }

        String str = (String) obj; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        System.out.println(str);
    }

    // Method to provide a dynamically determined condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        example.showBug();
    }
}