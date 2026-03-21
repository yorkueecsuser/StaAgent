class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public void modifySharedData(int newData) {
        sharedData = newData;
    }

    public int showBug() {
        boolean unreachable = getUnreachableCondition();
        if (unreachable) {
            // Mutant: Unreachable if statement
            sharedData = -1; // This line will never be executed, but it is added to create a unique mutant
        }
        return sharedData;
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false to make the if statement unreachable
    }

    public static void main(String[] args) {
        MutableStaticField obj = new MutableStaticField();
        obj.modifySharedData(100);
        System.out.println("Shared data after modification: " + obj.showBug());
    }
}