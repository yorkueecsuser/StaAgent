class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    // Method to get a condition for the unreachable while loop
    private boolean getUnreachableCondition() {
        return false;
    }

    public void modifySharedData(int newData) {
        // Inserted unreachable while loop
        while (getUnreachableCondition()) {
            System.out.println("This is an unreachable loop");
        }

        sharedData = newData;
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