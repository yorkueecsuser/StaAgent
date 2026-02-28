class MutableStaticField {
    public static int sharedData = 0;

    public void modifySharedData(int newData) {
        boolean unreachable = getUnreachableCondition();
        if (unreachable) {
            sharedData = 999; // Unreachable branch, introduces a bug
        } else {
            sharedData = newData;
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the if-else branch unreachable
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