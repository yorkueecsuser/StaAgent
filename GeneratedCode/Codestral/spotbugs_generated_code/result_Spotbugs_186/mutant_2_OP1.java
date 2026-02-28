// Java code demonstrating the bug with a dead store mutation:
class MutableStaticField {
    public static int sharedData = 0; // Still a bug: MS: Field should be package protected (MS_PKGPROTECT)

    public void modifySharedData(int newData) {
        sharedData = newData;
        int unusedVariable = 1; // Dead Store mutation: Unused variable
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