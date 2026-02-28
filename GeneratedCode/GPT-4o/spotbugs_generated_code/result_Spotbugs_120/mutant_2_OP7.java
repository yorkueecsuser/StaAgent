class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        boolean conditionWhile = getCondition(); // Used to ensure while loop is unreachable
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is unreachable");
        }
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        return y;
    }

    public static boolean getCondition() {
        return false; // This makes the while loop unreachable
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