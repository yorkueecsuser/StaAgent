class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public void modifySharedData(int newData) {
        sharedData = newData;
        // Mutant code added for Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code should never execute");
        }
    }

    // Method for dynamically determining unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        return sharedData;
    }

    public static void main(String[] args) {
        MutableStaticField obj = new MutableStaticField();
        obj.modifySharedData(100);
        System.out.println("Shared data after modification: " + obj.showBug());
    }
}