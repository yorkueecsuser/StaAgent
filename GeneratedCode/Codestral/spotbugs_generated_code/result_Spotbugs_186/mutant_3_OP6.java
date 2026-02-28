// Java code demonstrating the bug: MS: Field should be package protected (MS_PKGPROTECT)
class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public void modifySharedData(int newData) {
        sharedData = newData;
        // ADDITIONAL UNREACHABLE FOR LOOP MUTATION
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }
    }

    private boolean getCondition() {
        return false; // Always returns false, making the loop unreachable
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