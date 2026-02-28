class VolatileBug {
    private String sharedVar; // BUG: AvoidUsingVolatile

    public void setSharedVar(String value) {
        this.sharedVar = value;
    }

    public String getSharedVar() {
        return this.sharedVar;
    }

    private boolean getUnreachableCondition() {
        return false;
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
                // Inserted unreachable if-else branch
                if (getUnreachableCondition()) {
                    // This block is unreachable
                    System.out.println("This should not be printed!");
                } else {
                    System.out.println("Value changed to: " + getSharedVar());
                }
            }
        });

        setSharedVar("Initial Value");
        writer.start();
        reader.start();
    }
}