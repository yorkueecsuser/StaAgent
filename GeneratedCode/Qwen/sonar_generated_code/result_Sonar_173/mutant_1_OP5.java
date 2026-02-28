class FinalizeExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
        super.finalize();
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }

    public String showBug() {
        try {
            dispose();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("This will also never be printed");
                break;
        }
        return "Check console for finalize method invocation";
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        example.showBug();
    }
}