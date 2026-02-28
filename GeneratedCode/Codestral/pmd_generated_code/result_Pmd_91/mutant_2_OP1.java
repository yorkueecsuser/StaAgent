class VolatileBug {
    private String sharedVar; // BUG: AvoidUsingVolatile
    private String deadStore; // Mutation: Dead Store

    public void setSharedVar(String value) {
        this.sharedVar = value;
    }

    public String getSharedVar() {
        return this.sharedVar;
    }

    public void showBug() {
        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
                setSharedVar("Changed Value");
                deadStore = "Unused Value"; // No effect on the original functionality, but it's a dead store
            }
        });

        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                while(getSharedVar().equals("Initial Value")) {
                    // Do nothing
                }
                System.out.println("Value changed to: " + getSharedVar());
            }
        });

        setSharedVar("Initial Value");
        deadStore = "Initial Unused Value"; // Another dead store
        writer.start();
        reader.start();
    }
}