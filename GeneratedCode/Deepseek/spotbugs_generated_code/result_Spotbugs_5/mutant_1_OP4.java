class ApparentInfiniteLoop {
    public boolean getUnreachableCondition() {
        return false; // This method always returns false, making the branch unreachable
    }

    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");

            // Inserted unreachable if-else branch
            if (getUnreachableCondition()) {
                System.out.println("This line will never be executed.");
            } else {
                // Leave this branch empty as we want it to be unreachable
            }
        }
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}