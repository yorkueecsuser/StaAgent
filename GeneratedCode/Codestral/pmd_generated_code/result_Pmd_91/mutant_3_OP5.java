class VolatileBug {
    private String sharedVar; // BUG: AvoidUsingVolatile

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
                    // Insert unreachable switch statement
                    int unreachableValue = getUnreachableValue();
                    switch (unreachableValue) {
                        case 1:
                            System.out.println("This line should never be reached.");
                            break;
                    }
                }
                System.out.println("Value changed to: " + getSharedVar());
            }
        });

        setSharedVar("Initial Value");
        writer.start();
        reader.start();
    }

    // Method to return a value that will always make the switch statement unreachable
    private int getUnreachableValue() {
        return -1;
    }
}