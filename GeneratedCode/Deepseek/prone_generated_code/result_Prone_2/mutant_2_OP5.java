class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = array1 == array2; // BUG: ArrayEquals
        return areEqual;
    }

    public boolean getCondition() {
        return false;
    }

    public void showMutant() {
        boolean condition = getCondition();
        switch (0) {
            case 1:
                System.out.println("This switch statement is unreachable"); // Unreachable switch case
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
        bugExample.showMutant();
    }
}