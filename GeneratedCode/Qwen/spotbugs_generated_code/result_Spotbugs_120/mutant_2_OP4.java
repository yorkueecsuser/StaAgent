class ImpossibleCastExample {

    public Object getObject() {
        return new Integer(10);
    }

    public void showBug() {
        Object obj = getObject();
        
        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This will also never be printed");
        }

        String str = (String) obj; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        System.out.println(str);
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false, making the if-else block unreachable
    }

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        example.showBug();
    }
}