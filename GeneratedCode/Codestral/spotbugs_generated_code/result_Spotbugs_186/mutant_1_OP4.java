class MutableStaticField {
    public static int sharedData = 0;

    public void modifySharedData(int newData) {
        sharedData = newData;
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This line should never be executed.");
        } else {
            // This block is always executed
            System.out.println("This line is always executed.");
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