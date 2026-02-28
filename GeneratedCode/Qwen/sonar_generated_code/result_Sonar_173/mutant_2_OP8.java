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
    }

    // Mutated code
    public void disposez() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }

    public String showBugz() {
        try {
            disposez();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return "Check console for finalize method invocation";
    }

    public static void mainz(String[] q) {
        FinalizeExample x = new FinalizeExample();
        x.showBugz();
    }
}