class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable code block 1");
                break;
            case 2:
                System.out.println("This is unreachable code block 2");
                break;
            default:
                System.out.println("This is unreachable default block");
                break;
        }
        
        return y;
    }

    private int getUnreachableValue() {
        return 0; // This makes the switch statement unreachable because there is no case 0
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