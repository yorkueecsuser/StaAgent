class MutationTarget {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("Big");
        }

        // Mutant code starts here
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case true:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("Default case that also will never be reached");
                break;
        }
    }

    private static boolean getUnreachableCondition() {
        return false;
    }
}