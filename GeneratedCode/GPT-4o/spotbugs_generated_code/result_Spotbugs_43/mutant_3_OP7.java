class SwitchFallthroughExample {

    public int showBug(int value) {
        int result = 0;
        
        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This will never be printed.");
        }

        switch (value) {
            case 1:
                result = 100;
                // Missing break statement causes fall through
            case 2:
                result = 200;
                throw new IllegalArgumentException("Value cannot be 2");
            case 3:
                result = 300;
                break;
            default:
                result = -1;
        }

        return result;
    }
    
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchFallthroughExample example = new SwitchFallthroughExample();
        try {
            int result = example.showBug(1);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}