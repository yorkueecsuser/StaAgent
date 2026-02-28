class VolatileBug {
    private String sharedVar; // BUG: AvoidUsingVolatile

    private boolean getFalseCondition() {
        return false;
    }

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
        writer.start();
        reader.start();

        // Inserted unreachable for loop
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This should never be printed");
        }
    }
}