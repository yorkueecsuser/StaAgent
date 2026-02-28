class ImpossibleCastExample {

    public Object getObject() {
        return new Integer(10);
    }

    public void showBug() {
        Object obj = getObject();
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This loop will never execute");
        }

        String str = (String) obj; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        System.out.println(str);
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        example.showBug();
    }
}