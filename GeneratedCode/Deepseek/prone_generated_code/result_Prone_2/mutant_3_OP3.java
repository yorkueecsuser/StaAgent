class BugExample {

    boolean getCondition() {
        return false;
    }

    int getValue() {
        return 0;
    }

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = array1 == array2; // Unreachable statement, always false
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This statement is unreachable because 'getCondition()' always returns false.");
        }
        int value = getValue();
        switch (value) {
            case 0:
                System.out.println("This statement is unreachable because 'getValue()' always returns 0.");
                break;
            default:
                break;
        }
        return areEqual;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}