class SwitchFallthroughExample {

    public int showBug(int value) {
        int result = 0;

        switch (value) {
            case 1:
                result = 100;
                // Missing break statement causes fall through
                // Unreachable for loop inserted
                boolean conditionFor1 = getCondition();
                for (int i = 0; conditionFor1; i++) {
                    System.out.println("Unreachable code in case 1");
                }
            case 2:
                result = 200;
                throw new IllegalArgumentException("Value cannot be 2");
            case 3:
                result = 300;
                break;
            default:
                result = -1;
                // Unreachable for loop inserted
                boolean conditionForDefault = getCondition();
                for (int i = 0; conditionForDefault; i++) {
                    System.out.println("Unreachable code in default case");
                }
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