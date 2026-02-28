// Java code demonstrating the bug with mutation: MS: Field should be package protected (MS_PKGPROTECT)
class MutableStaticField {
    static int sharedData = 0; // Mutant code: changed access modifier from public to package protected

    public void modifySharedData(int newData) {
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