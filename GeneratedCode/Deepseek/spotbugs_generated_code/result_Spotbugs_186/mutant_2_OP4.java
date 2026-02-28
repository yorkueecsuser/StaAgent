// Java code demonstrating the bug: MS: Field should be package protected (MS_PKGPROTECT)
// Mutant added: Unreachable if-else statement

class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    // Method to check a condition that will always be false
    private static boolean getUnreachableCondition() {
        return false;
    }

    public void modifySharedData(int newData) {
        // Add an unreachable if-else branch
        if (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("Unreachable code executed!");
        } else {
            sharedData = newData;
        }
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