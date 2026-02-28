class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public void modifySharedData(int newData) {
        sharedData = newData;
    }

    public int showBug() {
        return sharedData;
    }

    public static void main(String[] args) {
        MutableStaticField obj = new MutableStaticField();
        int newData = 100;

        // Mutant Java code: Equivalent Loop Replacement
        int i = 0;
        do {
            obj.modifySharedData(newData);
            i++;
        } while (i < 1);

        System.out.println("Shared data after modification: " + obj.showBug());
    }
}