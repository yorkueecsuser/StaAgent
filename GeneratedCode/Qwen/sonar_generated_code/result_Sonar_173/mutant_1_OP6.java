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
        return "Check console for finalize method invocation";
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        example.showBug();

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This will never be printed");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}