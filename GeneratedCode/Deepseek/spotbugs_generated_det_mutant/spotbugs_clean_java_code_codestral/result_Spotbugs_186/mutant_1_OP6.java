class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public void modifySharedData(int newData) {
        boolean condition = false; // Condition for the unreachable loop
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This loop should never execute!");
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