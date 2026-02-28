class ImpossibleCastExample {

    public Object getObject() {
        return new Integer(10);
    }

    public void showBug() {
        Object obj = getObject();
        String str = (String) obj; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)

        // Mutated code: Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This will never be printed");
                break;
            case 1:
                // This case is always executed
                System.out.println("This is always printed");
                break;
        }

        System.out.println(str);
    }

    private boolean getCondition() {
        // This method returns false, ensuring the switch case 0 is unreachable
        return false;
    }

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        example.showBug();
    }
}