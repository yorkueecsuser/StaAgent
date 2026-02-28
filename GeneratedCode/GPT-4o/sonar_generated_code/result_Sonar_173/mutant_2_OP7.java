class FinalizeMethodExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method executed.");
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called

        // Inserting an unreachable while loop with a condition based on a non-final variable
        boolean isConditionMet = checkCondition();
        while (isConditionMet) {
            System.out.println("This is an unreachable code block.");
        }
    }

    public boolean checkCondition() {
        // This method will always return false to ensure the while loop is unreachable
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