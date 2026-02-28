class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public void modifySharedData(int newData) {
        if (getCondition()) { // Unreachable if statement
            System.out.println("This line will never be executed");
        }
        sharedData = newData;
    }

    private static boolean getCondition() {
        return false; // Always returns false, making the if statement unreachable
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