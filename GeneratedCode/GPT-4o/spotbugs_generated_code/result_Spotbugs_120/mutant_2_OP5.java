class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)

        // Mutation: Inserting an unreachable switch statement
        int switchCondition = getDynamicCondition(); // Dynamic condition to ensure the switch is unreachable
        switch (switchCondition) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            default:
                // This default will be reached since switchCondition is not 1 or 2
                break;
        }

        return y;
    }

    private int getDynamicCondition() {
        return 3; // Returns a value that doesn't match any case above, making it unreachable
    }

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        try {
            example.showBug();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}