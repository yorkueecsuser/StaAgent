class FinalizeMethodExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method executed.");
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called

        // Inserting unreachable for loop as a mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This for loop is unreachable.");
        }
    }

    // Method to simulate a runtime condition for the for loop
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        try {
            FinalizeMethodExample example = new FinalizeMethodExample();
            example.dispose();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeMethodExample example = new FinalizeMethodExample();
        example.showBug();
    }
}