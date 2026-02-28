class FinalizeExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
        super.finalize();
    }

    public void dispose() throws Throwable {
        int temp = 0; // Introduced variable initialization
        int temp = 0; // Duplicated variable initialization
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
    }
}