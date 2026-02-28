class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public void modifySharedData(int newData) {
        sharedData = newData;
        // Inserted unreachable while loop
        while (isFalse()) {
            System.out.println("This line will never be executed.");
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

    // Method that always returns false
    private static boolean isFalse() {
        return false;
    }
}