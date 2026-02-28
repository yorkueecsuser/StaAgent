class FinalizeBugExample {

    protected void finalize() throws Throwable {
        super.finalize();  // Noncompliant; this call should come last // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
        releaseSomeResources();
    }

    private void releaseSomeResources() {
        System.out.println("Releasing resources...");
    }

    public void showBug() {
        try {
            FinalizeBugExample obj = new FinalizeBugExample();
            obj = null;
            System.gc();  // Suggesting garbage collection to trigger finalize()
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();
    }
}