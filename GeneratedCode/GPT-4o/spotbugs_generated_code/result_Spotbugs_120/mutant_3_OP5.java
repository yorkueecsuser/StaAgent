class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        
        // Adding an unreachable switch statement mutation
        int unreachableValue = getUnreachableValue(); // This method ensures the switch is unreachable
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            default:
                // This default case is also never reached
                System.out.println("Default case unreachable.");
        }

        return y;
    }

    private int getUnreachableValue() {
        return 2; // This value is always set to ensure the switch statement is unreachable
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