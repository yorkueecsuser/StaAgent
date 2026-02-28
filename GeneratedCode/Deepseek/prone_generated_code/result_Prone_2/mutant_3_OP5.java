class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = array1 == array2; // BUG: Unreachable Switch Statement
        switch(getValue(areEqual)) {
            case 0:
                System.out.println("Unreachable");
                break;
        }
        return areEqual;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }

    public int getValue(boolean areEqual) {
        return areEqual? 1 : 0;
    }
}