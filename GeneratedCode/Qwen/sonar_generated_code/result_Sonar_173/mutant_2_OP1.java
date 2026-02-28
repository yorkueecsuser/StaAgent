class FinalizeExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
        super.finalize();
        // Dead Store Mutation
        String yzqjfnxr = "unusedVariable";
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
        // Dead Store Mutation
        int abcdwxyz = 12345;
    }

    public String showBug() {
        try {
            dispose();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return "Check console for finalize method invocation";
        // Dead Store Mutation
        boolean hjklmnop = false;
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        example.showBug();
        // Dead Store Mutation
        double rstuvwxy = 9876.54321;
    }
}