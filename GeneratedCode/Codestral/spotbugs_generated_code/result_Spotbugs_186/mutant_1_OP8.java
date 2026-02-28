// Java code demonstrating the bug: MS: Field should be package protected (MS_PKGPROTECT)
class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)
    private static int tempData = 0; // Mutated code: Renaming sharedData to tempData

    public void modifyTempData(int newData) {
        tempData = newData; // Mutated code: Renaming sharedData to tempData
    }

    public int showBug() {
        return tempData; // Mutated code: Renaming sharedData to tempData
    }

    public static void main(String[] args) {
        MutableStaticField obj = new MutableStaticField();
        obj.modifyTempData(100); // Mutated code: Renaming modifySharedData to modifyTempData
        System.out.println("Temp data after modification: " + obj.showBug()); // Mutated code: Renaming sharedData to tempData
    }
}